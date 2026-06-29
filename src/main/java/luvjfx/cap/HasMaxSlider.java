package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Slider;
import luvjfx.FxNodeOps;

public interface HasMaxSlider<S extends HasMaxSlider<S, N>, N extends Slider> extends FxNodeOps<S, N> {
  default S max(double v) {
    node().setMax(v);
    return self();
  }

  default S max(ObservableValue<? extends Double> v) {
    node().maxProperty().bind(v);
    return self();
  }

  default S maxBidi(Property<Number> v) {
    node().maxProperty().bindBidirectional(v);
    return self();
  }

  default double max() {
    return node().getMax();
  }
}
