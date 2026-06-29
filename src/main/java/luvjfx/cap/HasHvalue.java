package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ScrollPane;
import luvjfx.FxNodeOps;

public interface HasHvalue<S extends HasHvalue<S, N>, N extends ScrollPane> extends FxNodeOps<S, N> {
  default S hvalue(double v) {
    node().setHvalue(v);
    return self();
  }

  default S hvalue(ObservableValue<? extends Double> v) {
    node().hvalueProperty().bind(v);
    return self();
  }

  default S hvalueBidi(Property<Number> v) {
    node().hvalueProperty().bindBidirectional(v);
    return self();
  }

  default double hvalue() {
    return node().getHvalue();
  }
}
