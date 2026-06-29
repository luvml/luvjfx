package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.CacheHint;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasCacheHint<S extends HasCacheHint<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S cacheHint(CacheHint v) {
    node().setCacheHint(v);
    return self();
  }

  default S cacheHint(ObservableValue<? extends CacheHint> v) {
    node().cacheHintProperty().bind(v);
    return self();
  }

  default S cacheHintBidi(Property<CacheHint> v) {
    node().cacheHintProperty().bindBidirectional(v);
    return self();
  }

  default CacheHint cacheHint() {
    return node().getCacheHint();
  }
}
