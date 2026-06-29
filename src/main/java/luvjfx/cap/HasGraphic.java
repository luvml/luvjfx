package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.control.Labeled;
import luvjfx.FxNodeOps;

public interface HasGraphic<S extends HasGraphic<S, N>, N extends Labeled> extends FxNodeOps<S, N> {
  default S graphic(Node v) {
    node().setGraphic(v);
    return self();
  }

  default S graphic(FxNodeOps<?, ? extends Node> v) {
    node().setGraphic(v.node());
    return self();
  }

  default S graphic(ObservableValue<? extends Node> v) {
    node().graphicProperty().bind(v);
    return self();
  }

  default S graphicBidi(Property<Node> v) {
    node().graphicProperty().bindBidirectional(v);
    return self();
  }

  default Node graphic() {
    return node().getGraphic();
  }
}
