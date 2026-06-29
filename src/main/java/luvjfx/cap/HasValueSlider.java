package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Slider;
import luvjfx.FxNodeOps;

public interface HasValueSlider<S extends HasValueSlider<S, N>, N extends Slider> extends FxNodeOps<S, N> {
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
