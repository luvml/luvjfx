package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Slider;
import luvjfx.FxNodeOps;

public interface HasSnapToTicks<S extends HasSnapToTicks<S, N>, N extends Slider> extends FxNodeOps<S, N> {
  default S snapToTicks(boolean v) {
    node().setSnapToTicks(v);
    return self();
  }

  default S snapToTicks(ObservableValue<? extends Boolean> v) {
    node().snapToTicksProperty().bind(v);
    return self();
  }

  default S snapToTicksBidi(Property<Boolean> v) {
    node().snapToTicksProperty().bindBidirectional(v);
    return self();
  }

  default boolean snapToTicks() {
    return node().isSnapToTicks();
  }
}
