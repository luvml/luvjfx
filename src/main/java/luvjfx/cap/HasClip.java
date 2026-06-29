package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasClip<S extends HasClip<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S clip(Node v) {
    node().setClip(v);
    return self();
  }

  default S clip(FxNodeOps<?, ? extends Node> v) {
    node().setClip(v.node());
    return self();
  }

  default S clip(ObservableValue<? extends Node> v) {
    node().clipProperty().bind(v);
    return self();
  }

  default S clipBidi(Property<Node> v) {
    node().clipProperty().bindBidirectional(v);
    return self();
  }

  default Node clip() {
    return node().getClip();
  }
}
