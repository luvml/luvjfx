package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ScrollBar;
import luvjfx.FxNodeOps;

public interface HasUnitIncrement<S extends HasUnitIncrement<S, N>, N extends ScrollBar> extends FxNodeOps<S, N> {
  default S unitIncrement(double v) {
    node().setUnitIncrement(v);
    return self();
  }

  default S unitIncrement(ObservableValue<? extends Double> v) {
    node().unitIncrementProperty().bind(v);
    return self();
  }

  default S unitIncrementBidi(Property<Number> v) {
    node().unitIncrementProperty().bindBidirectional(v);
    return self();
  }

  default double unitIncrement() {
    return node().getUnitIncrement();
  }
}
