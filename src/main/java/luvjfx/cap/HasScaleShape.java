package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Region;
import luvjfx.FxNodeOps;

public interface HasScaleShape<S extends HasScaleShape<S, N>, N extends Region> extends FxNodeOps<S, N> {
  default S scaleShape(boolean v) {
    node().setScaleShape(v);
    return self();
  }

  default S scaleShape(ObservableValue<? extends Boolean> v) {
    node().scaleShapeProperty().bind(v);
    return self();
  }

  default S scaleShapeBidi(Property<Boolean> v) {
    node().scaleShapeProperty().bindBidirectional(v);
    return self();
  }

  default boolean scaleShape() {
    return node().isScaleShape();
  }
}
