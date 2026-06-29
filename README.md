# luvjfx — a terse, type-safe construction DSL for JavaFX

luvjfx lets you build a JavaFX scene graph that reads top-to-bottom like the tree it produces — `vbox(label("Name"), textField(), button("OK"))` — instead of the usual pile of `new`, `setX(...)`, and `getChildren().addAll(...)` statements. It is *construction only*: it never hides JavaFX from you. Every wrapper carries the real node in a public `.node` field, and `.attr(n -> ...)` hands you that node typed, so anything the DSL does not cover you still do the normal JavaFX way — in the same expression. The whole capability surface (every wrapper, every property method) is machine-generated from JavaFX itself by reflection, so coverage is exhaustive and re-runnable per JavaFX release rather than hand-curated.

This README is the tutorial: the mental model, the three ways to configure a node, reactive binding, the companion `luvjfx-reactive` module, and honest side-by-sides showing where this wins over plain JavaFX and over fluent-builder DSLs.

## 30-second mental model

Three rules cover almost everything:

1. A factory named after the JavaFX class creates the node and returns a thin wrapper: `vbox()` → `FxVBox`, `label("Hi")` → `FxLabel`, `button("OK")` → `FxButton`. Names match JavaFX (`VBox`→`vbox`, `HBox`→`hbox`, `StackPane`→`stack`).
2. Every property is a fluent method returning the wrapper, so you chain: `textField().promptText("Your name").disable(false)`. There is one method per JavaFX property, generated, so `slider().majorTickUnit(10).showTickLabels(true)` works without anyone hand-writing those methods.
3. The real node is always one hop away: `myButton.node` is the `Button`; `.attr(b -> b.setGraphic(icon))` configures it with full IDE autocomplete. Nothing is ever blocked.

```java
import static luvjfx.Fx.*;

var name = textField().promptText("Your name");
var form = vbox().styleClass("form").spacing(8).padding(16).nodes(
    label("Booking").style("-fx-font-size: 18; -fx-font-weight: bold;"),
    label("Name"),
    name,
    button("Book").defaultButton(true)
);

var scene = scene(borderPane().center(form), 440, 380);
```

The indentation *is* the scene graph. There is no `.build()` step and no separate `getChildren().addAll(...)`.

## Children and configuration: which style to use

Each factory takes `Consumer<? super FxXxx>...`. A child wrapper *is* such a consumer (it knows how to add itself to its parent), and a bare lambda `v -> v.spacing(8)` is also one — so children and configuration mix freely in one argument list. This is the single language trick the design turns on: typing the vararg as a functional interface (`Consumer`) is what lets a bare lambda and a raw child coexist, which a heterogeneous `Object...` cannot do. Several call shapes are therefore valid and identical in behavior; here is the one to reach for by default.

**Recommended.** When a container has *no* attributes of its own, write it as bare varargs — the container is just its children, and it reads exactly like the tree:

```java
vbox(label("Name"), textField().promptText("Your name"), button("OK"))
```

When a container *does* have attributes, set them first and then list children with `.nodes(...)` — attributes before children, like an HTML element:

```java
var form = vbox().spacing(8).padding(16).nodes(
    label("Name"),
    textField().promptText("Your name"),
    button("OK").defaultButton(true)
);
```

Why attrs-first once a container is configured: you describe the box and *then* its contents (the order you think in); the container's `.spacing/.padding` sit next to the container instead of trailing far below a long child list; and a leading `.spacing(8)` can't be misread as configuring the last child the way a trailing one after `)` can. (Leaf controls have no children, so they are always just a fluent chain: `button("Book").defaultButton(true).disable(invalid)`.)

These two forms stay valid and equivalent — use them where they read better in a given spot (e.g. a one-liner with a single trailing attribute, or the purest one-varargs luvml feel):

```java
// trailing fluent — children first, container config last
vbox(label("Name"), textField(), button("OK")).spacing(8).padding(16);

// leading config lambda — config and children in one varargs, config first
vbox($ -> $.spacing(8).padding(16),
    label("Name"), textField($ -> $.promptText("x")), button("OK"));
```

Containers differ only in how children attach, and the same `Consumer` signature serves all of them:

```java
borderPane().center(form).bottom(status).left(nav);   // positional — placement methods
scrollPane().content(bigTable);                        // single-content
stack(background, overlay);                            // children self-add (VBox/HBox/StackPane/…)
```

## The escape hatch: `.attr(...)` and `.node`

The DSL covers JavaFX properties; for anything else — imperative setup, third-party nodes, methods that are not bean properties — drop to the real node without leaving the chain:

```java
var table = tableView(Person.class)
    .placeholder(label("No rows"))
    .attr(t -> {                          // t is a real TableView<Person>
        var col = new TableColumn<Person, String>("Name");
        col.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().name()));
        t.getColumns().add(col);
    });

stage.setScene(scene(table.node, 600, 400));   // .node is the raw TableView<Person>
```

Generic controls take a `Class<T>` token so `T` is pinned for autocomplete:

```java
comboBox(String.class, c -> c.value("apple").items(list).editable(true).promptText("pick"));
```

## Reactive binding (built in, zero extra dependency)

Every property method has an `ObservableValue` overload for one-way binding, and a `…Bidi(Property<…>)` companion for two-way binding. These need only `javafx.base` (already on the classpath), so they live in core luvjfx — binding reads as just another fluent step:

```java
label("").text(clockText);                 // one-way: label's text follows an ObservableValue<String>
textField().textBidi(nameModel);           // two-way: field <-> Property<String>
checkBox("Round trip").selectedBidi(flag); // two-way: checkbox <-> BooleanProperty
slider().valueBidi(amount);                // numeric two-way uses Property<Number>
datePicker().value(suggestedDate);         // one-way object binding
```

Node-level bindings (`disable`, `visible`, `opacity`) are on every node:

```java
button("Book").disable(formInvalid);       // disable follows an ObservableValue<Boolean>
returnPicker.disable(roundTrip.not());     // BooleanBinding works directly
```

Compare with plain JavaFX, which forces you to pull each node out of the tree and name its property:

```java
// plain JavaFX
status.textProperty().bind(message);
name.textProperty().bindBidirectional(nameModel);
returnPicker.disableProperty().bind(roundTrip.not());
// luvjfx — same three bindings, inline at construction
label("").text(message)
textField().textBidi(nameModel)
datePicker().disable(roundTrip.not())
```

## The `luvjfx-reactive` module — domain-driven validation via int4

Binding one control to one observable is built into core luvjfx (above). The harder problem — values that carry *validity* and a *domain of allowed values*, and constraints where one field's domain depends on others — is genuinely hard and well-solved by [int4-org/FX](https://github.com/int4-org/FX) (`fx-core` + `fx-values`, MIT). luvjfx does not rebuild that; the sibling module `luvjfx-reactive` depends on int4 and bridges it to the luvjfx controls. luvjfx and int4 stay orthogonal — luvjfx builds the node tree, int4 owns value + validity, and they meet only at `ObservableValue`/`Property`.

A `Model<T>` *is* an `ObservableValue<T>` with a writable value, a `Domain<T>`, and a `valid()` flag. `Observe.values(...).compute(...)` composes several observables into a derived one, keeping the inputs and the function together (unlike JavaFX's `Bindings.createObjectBinding(fn, dep1, dep2, …)`, where the dependency list is written separately from the function). The headline is a *dependent domain* — the return date's allowed range depends on departure:

```java
var roundTrip  = BooleanModel.of(false);
var departure  = ObjectModel.of(today, Domain.bounded(today, today.plusYears(1)));
var returnDate = ObjectModel.<LocalDate>of(today.plusDays(7), Domain.any());

// when round-trip + departure change, recompute the return date's domain:
Observe.values(roundTrip, departure)
    .compute((rt, dep) -> Boolean.TRUE.equals(rt) && dep != null
        ? Domain.bounded(dep, dep.plusYears(1))
        : Domain.<LocalDate>inapplicable())
    .subscribe(returnDate::setDomain);

var bookable = Observe.booleans(departure.valid(), returnDate.valid()).allTrue();
```

The models then drive luvjfx controls through the core binding overloads, and `Models.edits(controlProperty, model)` is the one-line bridge for the edit direction (control → model):

```java
checkBox("Round trip").attr(cb -> Models.edits(cb.selectedProperty(), roundTrip));
datePicker().disable(roundTrip.map(rt -> !Boolean.TRUE.equals(rt)))
    .attr(dp -> Models.edits(dp.valueProperty(), returnDate));
button("Book").disable(bookable.map(v -> !v));   // a derived int4 observable feeds straight back into the DSL
```

`DemoApp4` (in that module) is the runnable result: a round-trip checkbox, two date pickers, a live status line, and a Book button that enables only when every model is valid — the Return picker disables when the trip is one-way, and its *domain* (not just a hand-checked condition) tracks the departure date. Run it with `mvn -o javafx:run` from `luvjfx-reactive`.

Note on obtaining int4: at time of writing `fx-core`/`fx-values` are unreleased (`1.0.0-SNAPSHOT`), so they are built once into the local `.m2` from the cloned repo (`mvn -pl fx-core,fx-values -am -Dmaven.test.skip=true install`, with `common-*` resolved from Central). When int4 cuts a Maven Central release, that step disappears and `luvjfx-reactive` builds with no extra setup.

## Why this shape (vs the alternatives)

Against **plain JavaFX**: you stop writing `new X(); x.setA(...); x.setB(...); parent.getChildren().add(x);` four lines at a time. The tree literal mirrors the scene graph 1:1, bindings inline, and you keep every escape hatch. You give up nothing — `.node` is the real object.

Against a **fluent-builder DSL** (the int4-org/FX style this project grew out of): two concrete differences. (1) The property methods are *generated from JavaFX by reflection* (367 capability atoms across 51 node types), so coverage is exhaustive and regenerates per JavaFX release — nobody hand-maintains a method per property, which is exactly the maintenance treadmill fluent builders hit. (2) Raw child nodes and bare-lambda configurators share one varargs (via `Consumer<? super N>`), the combination a builder typed on `Object...` cannot offer with compile-time fit — so `vbox(someRawNode, $ -> $.spacing(8), label("x"))` all type-check together.

Against **a luvml-faithful port**: HTML has a small closed vocabulary, so free-static attribute factories cost nothing; JavaFX has hundreds of node-specific typed properties, so IDE-discoverable fluent methods on a typed wrapper win. luvjfx keeps luvml's *feel* (mix children and config in varargs, 1:1 mapping, no build step) without paying for a fragment-then-serialize layer that live mutable nodes do not need.

## Keyboard-friendly by construction

Because everything returns the real node, standard JavaFX keyboard ergonomics are one fluent step away: `button("Book").defaultButton(true)` (Enter), `button("Cancel").cancelButton(true)` (Esc), Tab traversal is automatic, and a scene-level `setOnKeyPressed` handles shortcuts. The demos ship a status bar spelling out the active keys.

## Honest limitations

- **Tables are only partly tamed.** `FxTableView` covers the table-level properties (`items`, `editable`, `placeholder`, `sortPolicy`, …), but JavaFX's real table verbosity — defining `TableColumn`s and their `cellValueFactory` — is untouched, because `TableColumn` is not a `Node` and `columns` is not a bean property. You still build columns with raw JavaFX inside `.attr(...)` (see the table example above). A terse column/cell builder is deferred work.
- **Non-Node builders** (`MenuItem`, `Tab`, `TableColumn`, `Menu`) are not wrapped — the generator seeds from `Node` only. They are used raw.

## Layout, build, regenerate

- `luvjfx` — this module: the construction DSL + binding overloads. Depends only on JavaFX. Hand-written: `FxNodeOps`, `FxPane`, `FxAny`, and the demos; everything else is generated.
- `luvjfx-gen` — the generator (reflection + JavaPoet). `mvn -o exec:java` from there regenerates this module's capability layer in place.
- `luvjfx-reactive` — int4 integration (`Models` bridge) + the constraint-flow demo. Depends on luvjfx + int4 `fx-core`/`fx-values` (Java 25).

```bash
# one-time, until int4 publishes to Maven Central: build its two modules into local .m2
git clone https://github.com/int4-org/FX.git
cd FX && mvn -pl fx-core,fx-values -am -Dmaven.test.skip=true install   # common-* come from Central

# build + run a demo
cd luvjfx           && mvn -o javafx:run     # DemoApp (booking form, fluent)
cd luvjfx-reactive  && mvn -o javafx:run     # DemoApp4 (int4 Domain/Model constraint flow)
# regenerate the capability layer after a JavaFX upgrade
cd luvjfx-gen       && mvn -o exec:java
```
