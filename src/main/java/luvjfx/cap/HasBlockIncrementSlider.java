package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Slider;
import luvjfx.FxNodeOps;

public interface HasBlockIncrementSlider<S extends HasBlockIncrementSlider<S, N>, N extends Slider> extends FxNodeOps<S, N> {
  default S blockIncrement(double v) {
    node().setBlockIncrement(v);
    return self();
  }

  default S blockIncrement(ObservableValue<? extends Double> v) {
    node().blockIncrementProperty().bind(v);
    return self();
  }

  default S blockIncrementBidi(Property<Number> v) {
    node().blockIncrementProperty().bindBidirectional(v);
    return self();
  }

  default double blockIncrement() {
    return node().getBlockIncrement();
  }
}
