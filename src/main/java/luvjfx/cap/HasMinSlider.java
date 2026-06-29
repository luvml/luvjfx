package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Slider;
import luvjfx.FxNodeOps;

public interface HasMinSlider<S extends HasMinSlider<S, N>, N extends Slider> extends FxNodeOps<S, N> {
  default S min(double v) {
    node().setMin(v);
    return self();
  }

  default S min(ObservableValue<? extends Double> v) {
    node().minProperty().bind(v);
    return self();
  }

  default S minBidi(Property<Number> v) {
    node().minProperty().bindBidirectional(v);
    return self();
  }

  default double min() {
    return node().getMin();
  }
}
