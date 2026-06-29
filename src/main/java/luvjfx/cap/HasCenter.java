package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import luvjfx.FxNodeOps;

public interface HasCenter<S extends HasCenter<S, N>, N extends BorderPane> extends FxNodeOps<S, N> {
  default S center(Node v) {
    node().setCenter(v);
    return self();
  }

  default S center(FxNodeOps<?, ? extends Node> v) {
    node().setCenter(v.node());
    return self();
  }

  default S center(ObservableValue<? extends Node> v) {
    node().centerProperty().bind(v);
    return self();
  }

  default S centerBidi(Property<Node> v) {
    node().centerProperty().bindBidirectional(v);
    return self();
  }

  default Node center() {
    return node().getCenter();
  }
}
