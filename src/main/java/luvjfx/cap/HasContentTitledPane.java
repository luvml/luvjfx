package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.control.TitledPane;
import luvjfx.FxNodeOps;

public interface HasContentTitledPane<S extends HasContentTitledPane<S, N>, N extends TitledPane> extends FxNodeOps<S, N> {
  default S content(Node v) {
    node().setContent(v);
    return self();
  }

  default S content(FxNodeOps<?, ? extends Node> v) {
    node().setContent(v.node());
    return self();
  }

  default S content(ObservableValue<? extends Node> v) {
    node().contentProperty().bind(v);
    return self();
  }

  default S contentBidi(Property<Node> v) {
    node().contentProperty().bindBidirectional(v);
    return self();
  }

  default Node content() {
    return node().getContent();
  }
}
