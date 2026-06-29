package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TitledPane;
import luvjfx.FxNodeOps;

public interface HasAnimated<S extends HasAnimated<S, N>, N extends TitledPane> extends FxNodeOps<S, N> {
  default S animated(boolean v) {
    node().setAnimated(v);
    return self();
  }

  default S animated(ObservableValue<? extends Boolean> v) {
    node().animatedProperty().bind(v);
    return self();
  }

  default S animatedBidi(Property<Boolean> v) {
    node().animatedProperty().bindBidirectional(v);
    return self();
  }

  default boolean animated() {
    return node().isAnimated();
  }
}
