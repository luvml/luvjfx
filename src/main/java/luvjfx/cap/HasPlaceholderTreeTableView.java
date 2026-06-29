package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.control.TreeTableView;
import luvjfx.FxNodeOps;

public interface HasPlaceholderTreeTableView<S extends HasPlaceholderTreeTableView<S, N, T>, N extends TreeTableView<T>, T> extends FxNodeOps<S, N> {
  default S placeholder(Node v) {
    node().setPlaceholder(v);
    return self();
  }

  default S placeholder(FxNodeOps<?, ? extends Node> v) {
    node().setPlaceholder(v.node());
    return self();
  }

  default S placeholder(ObservableValue<? extends Node> v) {
    node().placeholderProperty().bind(v);
    return self();
  }

  default S placeholderBidi(Property<Node> v) {
    node().placeholderProperty().bindBidirectional(v);
    return self();
  }

  default Node placeholder() {
    return node().getPlaceholder();
  }
}
