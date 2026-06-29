package luvjfx;

import java.lang.Class;
import java.lang.SafeVarargs;
import java.lang.String;
import java.util.function.Consumer;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuButton;
import javafx.scene.control.Pagination;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToolBar;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.TreeView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public final class Fx {
  private Fx() {
  }

  @SafeVarargs
  private static <W extends FxNodeOps<W, ?>> W cfg(W w, Consumer<? super W>... a) {
    for (var c : a) {
      c.accept(w);
    }
    return w;
  }

  public static <N extends Node> FxAny<N> fx(N node) {
    return new FxAny<>(node);
  }

  public static Scene scene(FxNodeOps<?, ? extends Parent> root) {
    return new Scene(root.node());
  }

  public static Scene scene(FxNodeOps<?, ? extends Parent> root, double w, double h) {
    return new Scene(root.node(), w, h);
  }

  @SafeVarargs
  public static FxVBox vbox(Consumer<? super FxVBox>... a) {
    return cfg(new FxVBox(new VBox()), a);
  }

  @SafeVarargs
  public static FxHBox hbox(Consumer<? super FxHBox>... a) {
    return cfg(new FxHBox(new HBox()), a);
  }

  @SafeVarargs
  public static FxStackPane stack(Consumer<? super FxStackPane>... a) {
    return cfg(new FxStackPane(new StackPane()), a);
  }

  @SafeVarargs
  public static FxBorderPane borderPane(Consumer<? super FxBorderPane>... a) {
    return cfg(new FxBorderPane(new BorderPane()), a);
  }

  @SafeVarargs
  public static FxGridPane gridPane(Consumer<? super FxGridPane>... a) {
    return cfg(new FxGridPane(new GridPane()), a);
  }

  @SafeVarargs
  public static FxFlowPane flowPane(Consumer<? super FxFlowPane>... a) {
    return cfg(new FxFlowPane(new FlowPane()), a);
  }

  @SafeVarargs
  public static FxTilePane tilePane(Consumer<? super FxTilePane>... a) {
    return cfg(new FxTilePane(new TilePane()), a);
  }

  @SafeVarargs
  public static FxAnchorPane anchorPane(Consumer<? super FxAnchorPane>... a) {
    return cfg(new FxAnchorPane(new AnchorPane()), a);
  }

  @SafeVarargs
  public static FxScrollPane scrollPane(Consumer<? super FxScrollPane>... a) {
    return cfg(new FxScrollPane(new ScrollPane()), a);
  }

  @SafeVarargs
  public static FxLabel label(String text, Consumer<? super FxLabel>... a) {
    return cfg(new FxLabel(new Label(text)), a);
  }

  @SafeVarargs
  public static FxLabel label(Consumer<? super FxLabel>... a) {
    return cfg(new FxLabel(new Label()), a);
  }

  @SafeVarargs
  public static FxButton button(String text, Consumer<? super FxButton>... a) {
    return cfg(new FxButton(new Button(text)), a);
  }

  @SafeVarargs
  public static FxButton button(Consumer<? super FxButton>... a) {
    return cfg(new FxButton(new Button()), a);
  }

  @SafeVarargs
  public static FxToggleButton toggleButton(String text, Consumer<? super FxToggleButton>... a) {
    return cfg(new FxToggleButton(new ToggleButton(text)), a);
  }

  @SafeVarargs
  public static FxToggleButton toggleButton(Consumer<? super FxToggleButton>... a) {
    return cfg(new FxToggleButton(new ToggleButton()), a);
  }

  @SafeVarargs
  public static FxRadioButton radioButton(String text, Consumer<? super FxRadioButton>... a) {
    return cfg(new FxRadioButton(new RadioButton(text)), a);
  }

  @SafeVarargs
  public static FxRadioButton radioButton(Consumer<? super FxRadioButton>... a) {
    return cfg(new FxRadioButton(new RadioButton()), a);
  }

  @SafeVarargs
  public static FxCheckBox checkBox(String text, Consumer<? super FxCheckBox>... a) {
    return cfg(new FxCheckBox(new CheckBox(text)), a);
  }

  @SafeVarargs
  public static FxCheckBox checkBox(Consumer<? super FxCheckBox>... a) {
    return cfg(new FxCheckBox(new CheckBox()), a);
  }

  @SafeVarargs
  public static FxHyperlink hyperlink(String text, Consumer<? super FxHyperlink>... a) {
    return cfg(new FxHyperlink(new Hyperlink(text)), a);
  }

  @SafeVarargs
  public static FxHyperlink hyperlink(Consumer<? super FxHyperlink>... a) {
    return cfg(new FxHyperlink(new Hyperlink()), a);
  }

  @SafeVarargs
  public static FxMenuButton menuButton(String text, Consumer<? super FxMenuButton>... a) {
    return cfg(new FxMenuButton(new MenuButton(text)), a);
  }

  @SafeVarargs
  public static FxMenuButton menuButton(Consumer<? super FxMenuButton>... a) {
    return cfg(new FxMenuButton(new MenuButton()), a);
  }

  @SafeVarargs
  public static FxSplitMenuButton splitMenuButton(String text,
      Consumer<? super FxSplitMenuButton>... a) {
    return cfg(new FxSplitMenuButton(new SplitMenuButton(text)), a);
  }

  @SafeVarargs
  public static FxSplitMenuButton splitMenuButton(Consumer<? super FxSplitMenuButton>... a) {
    return cfg(new FxSplitMenuButton(new SplitMenuButton()), a);
  }

  @SafeVarargs
  public static FxColorPicker colorPicker(Consumer<? super FxColorPicker>... a) {
    return cfg(new FxColorPicker(new ColorPicker()), a);
  }

  @SafeVarargs
  public static FxDatePicker datePicker(Consumer<? super FxDatePicker>... a) {
    return cfg(new FxDatePicker(new DatePicker()), a);
  }

  @SafeVarargs
  public static FxTextField textField(String text, Consumer<? super FxTextField>... a) {
    return cfg(new FxTextField(new TextField(text)), a);
  }

  @SafeVarargs
  public static FxTextField textField(Consumer<? super FxTextField>... a) {
    return cfg(new FxTextField(new TextField()), a);
  }

  @SafeVarargs
  public static FxPasswordField passwordField(Consumer<? super FxPasswordField>... a) {
    return cfg(new FxPasswordField(new PasswordField()), a);
  }

  @SafeVarargs
  public static FxTextArea textArea(String text, Consumer<? super FxTextArea>... a) {
    return cfg(new FxTextArea(new TextArea(text)), a);
  }

  @SafeVarargs
  public static FxTextArea textArea(Consumer<? super FxTextArea>... a) {
    return cfg(new FxTextArea(new TextArea()), a);
  }

  @SafeVarargs
  public static FxSlider slider(Consumer<? super FxSlider>... a) {
    return cfg(new FxSlider(new Slider()), a);
  }

  @SafeVarargs
  public static FxProgressBar progressBar(Consumer<? super FxProgressBar>... a) {
    return cfg(new FxProgressBar(new ProgressBar()), a);
  }

  @SafeVarargs
  public static FxProgressIndicator progressIndicator(Consumer<? super FxProgressIndicator>... a) {
    return cfg(new FxProgressIndicator(new ProgressIndicator()), a);
  }

  @SafeVarargs
  public static FxScrollBar scrollBar(Consumer<? super FxScrollBar>... a) {
    return cfg(new FxScrollBar(new ScrollBar()), a);
  }

  @SafeVarargs
  public static FxSeparator separator(Consumer<? super FxSeparator>... a) {
    return cfg(new FxSeparator(new Separator()), a);
  }

  @SafeVarargs
  public static FxTitledPane titledPane(Consumer<? super FxTitledPane>... a) {
    return cfg(new FxTitledPane(new TitledPane()), a);
  }

  @SafeVarargs
  public static FxTabPane tabPane(Consumer<? super FxTabPane>... a) {
    return cfg(new FxTabPane(new TabPane()), a);
  }

  @SafeVarargs
  public static FxAccordion accordion(Consumer<? super FxAccordion>... a) {
    return cfg(new FxAccordion(new Accordion()), a);
  }

  @SafeVarargs
  public static FxSplitPane splitPane(Consumer<? super FxSplitPane>... a) {
    return cfg(new FxSplitPane(new SplitPane()), a);
  }

  @SafeVarargs
  public static FxPagination pagination(Consumer<? super FxPagination>... a) {
    return cfg(new FxPagination(new Pagination()), a);
  }

  @SafeVarargs
  public static FxToolBar toolBar(Consumer<? super FxToolBar>... a) {
    return cfg(new FxToolBar(new ToolBar()), a);
  }

  @SafeVarargs
  public static FxMenuBar menuBar(Consumer<? super FxMenuBar>... a) {
    return cfg(new FxMenuBar(new MenuBar()), a);
  }

  @SafeVarargs
  public static <T> FxComboBox<T> comboBox(Class<T> type, Consumer<? super FxComboBox<T>>... a) {
    return cfg(new FxComboBox<T>(new ComboBox<T>()), a);
  }

  @SafeVarargs
  public static <T> FxChoiceBox<T> choiceBox(Class<T> type, Consumer<? super FxChoiceBox<T>>... a) {
    return cfg(new FxChoiceBox<T>(new ChoiceBox<T>()), a);
  }

  @SafeVarargs
  public static <T> FxListView<T> listView(Class<T> type, Consumer<? super FxListView<T>>... a) {
    return cfg(new FxListView<T>(new ListView<T>()), a);
  }

  @SafeVarargs
  public static <T> FxTableView<T> tableView(Class<T> type, Consumer<? super FxTableView<T>>... a) {
    return cfg(new FxTableView<T>(new TableView<T>()), a);
  }

  @SafeVarargs
  public static <T> FxTreeView<T> treeView(Class<T> type, Consumer<? super FxTreeView<T>>... a) {
    return cfg(new FxTreeView<T>(new TreeView<T>()), a);
  }

  @SafeVarargs
  public static <T> FxTreeTableView<T> treeTableView(Class<T> type,
      Consumer<? super FxTreeTableView<T>>... a) {
    return cfg(new FxTreeTableView<T>(new TreeTableView<T>()), a);
  }

  @SafeVarargs
  public static <T> FxSpinner<T> spinner(Class<T> type, Consumer<? super FxSpinner<T>>... a) {
    return cfg(new FxSpinner<T>(new Spinner<T>()), a);
  }

  @SafeVarargs
  public static FxRectangle rectangle(Consumer<? super FxRectangle>... a) {
    return cfg(new FxRectangle(new Rectangle()), a);
  }

  @SafeVarargs
  public static FxCircle circle(Consumer<? super FxCircle>... a) {
    return cfg(new FxCircle(new Circle()), a);
  }

  @SafeVarargs
  public static FxEllipse ellipse(Consumer<? super FxEllipse>... a) {
    return cfg(new FxEllipse(new Ellipse()), a);
  }

  @SafeVarargs
  public static FxLine line(Consumer<? super FxLine>... a) {
    return cfg(new FxLine(new Line()), a);
  }

  @SafeVarargs
  public static FxPolygon polygon(Consumer<? super FxPolygon>... a) {
    return cfg(new FxPolygon(new Polygon()), a);
  }

  @SafeVarargs
  public static FxPolyline polyline(Consumer<? super FxPolyline>... a) {
    return cfg(new FxPolyline(new Polyline()), a);
  }

  @SafeVarargs
  public static FxArc arc(Consumer<? super FxArc>... a) {
    return cfg(new FxArc(new Arc()), a);
  }

  @SafeVarargs
  public static FxText text(String text, Consumer<? super FxText>... a) {
    return cfg(new FxText(new Text(text)), a);
  }

  @SafeVarargs
  public static FxText text(Consumer<? super FxText>... a) {
    return cfg(new FxText(new Text()), a);
  }

  @SafeVarargs
  public static FxImageView imageView(Consumer<? super FxImageView>... a) {
    return cfg(new FxImageView(new ImageView()), a);
  }

  @SafeVarargs
  public static FxCanvas canvas(Consumer<? super FxCanvas>... a) {
    return cfg(new FxCanvas(new Canvas()), a);
  }
}
