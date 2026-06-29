package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.NodeOrientation;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasNodeOrientation<S extends HasNodeOrientation<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S nodeOrientation(NodeOrientation v) {
    node().setNodeOrientation(v);
    return self();
  }

  default S nodeOrientation(ObservableValue<? extends NodeOrientation> v) {
    node().nodeOrientationProperty().bind(v);
    return self();
  }

  default S nodeOrientationBidi(Property<NodeOrientation> v) {
    node().nodeOrientationProperty().bindBidirectional(v);
    return self();
  }

  default NodeOrientation nodeOrientation() {
    return node().getNodeOrientation();
  }
}
