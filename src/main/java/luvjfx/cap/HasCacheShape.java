package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Region;
import luvjfx.FxNodeOps;

public interface HasCacheShape<S extends HasCacheShape<S, N>, N extends Region> extends FxNodeOps<S, N> {
  default S cacheShape(boolean v) {
    node().setCacheShape(v);
    return self();
  }

  default S cacheShape(ObservableValue<? extends Boolean> v) {
    node().cacheShapeProperty().bind(v);
    return self();
  }

  default S cacheShapeBidi(Property<Boolean> v) {
    node().cacheShapeProperty().bindBidirectional(v);
    return self();
  }

  default boolean cacheShape() {
    return node().isCacheShape();
  }
}
