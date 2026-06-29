package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasCache<S extends HasCache<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S cache(boolean v) {
    node().setCache(v);
    return self();
  }

  default S cache(ObservableValue<? extends Boolean> v) {
    node().cacheProperty().bind(v);
    return self();
  }

  default S cacheBidi(Property<Boolean> v) {
    node().cacheProperty().bindBidirectional(v);
    return self();
  }

  default boolean cache() {
    return node().isCache();
  }
}
