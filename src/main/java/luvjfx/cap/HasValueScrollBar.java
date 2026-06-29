package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ScrollBar;
import luvjfx.FxNodeOps;

public interface HasValueScrollBar<S extends HasValueScrollBar<S, N>, N extends ScrollBar> extends FxNodeOps<S, N> {
  default S value(double v) {
    node().setValue(v);
    return self();
  }

  default S value(ObservableValue<? extends Double> v) {
    node().valueProperty().bind(v);
    return self();
  }

  default S valueBidi(Property<Number> v) {
    node().valueProperty().bindBidirectional(v);
    return self();
  }

  default double value() {
    return node().getValue();
  }
}
