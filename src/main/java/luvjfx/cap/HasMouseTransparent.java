package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasMouseTransparent<S extends HasMouseTransparent<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S mouseTransparent(boolean v) {
    node().setMouseTransparent(v);
    return self();
  }

  default S mouseTransparent(ObservableValue<? extends Boolean> v) {
    node().mouseTransparentProperty().bind(v);
    return self();
  }

  default S mouseTransparentBidi(Property<Boolean> v) {
    node().mouseTransparentProperty().bindBidirectional(v);
    return self();
  }

  default boolean mouseTransparent() {
    return node().isMouseTransparent();
  }
}
