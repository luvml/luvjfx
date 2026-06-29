package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Region;
import luvjfx.FxNodeOps;

public interface HasCenterShape<S extends HasCenterShape<S, N>, N extends Region> extends FxNodeOps<S, N> {
  default S centerShape(boolean v) {
    node().setCenterShape(v);
    return self();
  }

  default S centerShape(ObservableValue<? extends Boolean> v) {
    node().centerShapeProperty().bind(v);
    return self();
  }

  default S centerShapeBidi(Property<Boolean> v) {
    node().centerShapeProperty().bindBidirectional(v);
    return self();
  }

  default boolean centerShape() {
    return node().isCenterShape();
  }
}
