package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ScrollPane;
import luvjfx.FxNodeOps;

public interface HasVvalue<S extends HasVvalue<S, N>, N extends ScrollPane> extends FxNodeOps<S, N> {
  default S vvalue(double v) {
    node().setVvalue(v);
    return self();
  }

  default S vvalue(ObservableValue<? extends Double> v) {
    node().vvalueProperty().bind(v);
    return self();
  }

  default S vvalueBidi(Property<Number> v) {
    node().vvalueProperty().bindBidirectional(v);
    return self();
  }

  default double vvalue() {
    return node().getVvalue();
  }
}
