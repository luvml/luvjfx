package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Shape;
import luvjfx.FxNodeOps;

public interface HasSmoothShape<S extends HasSmoothShape<S, N>, N extends Shape> extends FxNodeOps<S, N> {
  default S smooth(boolean v) {
    node().setSmooth(v);
    return self();
  }

  default S smooth(ObservableValue<? extends Boolean> v) {
    node().smoothProperty().bind(v);
    return self();
  }

  default S smoothBidi(Property<Boolean> v) {
    node().smoothProperty().bindBidirectional(v);
    return self();
  }

  default boolean smooth() {
    return node().isSmooth();
  }
}
