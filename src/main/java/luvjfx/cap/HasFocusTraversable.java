package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasFocusTraversable<S extends HasFocusTraversable<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S focusTraversable(boolean v) {
    node().setFocusTraversable(v);
    return self();
  }

  default S focusTraversable(ObservableValue<? extends Boolean> v) {
    node().focusTraversableProperty().bind(v);
    return self();
  }

  default S focusTraversableBidi(Property<Boolean> v) {
    node().focusTraversableProperty().bindBidirectional(v);
    return self();
  }

  default boolean focusTraversable() {
    return node().isFocusTraversable();
  }
}
