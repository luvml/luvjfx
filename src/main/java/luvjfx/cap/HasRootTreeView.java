package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import luvjfx.FxNodeOps;

public interface HasRootTreeView<S extends HasRootTreeView<S, N, T>, N extends TreeView<T>, T> extends FxNodeOps<S, N> {
  default S root(TreeItem<T> v) {
    node().setRoot(v);
    return self();
  }

  default S root(ObservableValue<? extends TreeItem<T>> v) {
    node().rootProperty().bind(v);
    return self();
  }

  default S rootBidi(Property<TreeItem<T>> v) {
    node().rootProperty().bindBidirectional(v);
    return self();
  }

  default TreeItem<T> root() {
    return node().getRoot();
  }
}
