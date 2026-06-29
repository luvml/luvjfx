package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.effect.BlendMode;
import luvjfx.FxNodeOps;

public interface HasBlendMode<S extends HasBlendMode<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S blendMode(BlendMode v) {
    node().setBlendMode(v);
    return self();
  }

  default S blendMode(ObservableValue<? extends BlendMode> v) {
    node().blendModeProperty().bind(v);
    return self();
  }

  default S blendModeBidi(Property<BlendMode> v) {
    node().blendModeProperty().bindBidirectional(v);
    return self();
  }

  default BlendMode blendMode() {
    return node().getBlendMode();
  }
}
