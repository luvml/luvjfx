package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import luvjfx.FxNodeOps;

public interface HasTreeColumn<S extends HasTreeColumn<S, N, T>, N extends TreeTableView<T>, T> extends FxNodeOps<S, N> {
  default S treeColumn(TreeTableColumn<T, ?> v) {
    node().setTreeColumn(v);
    return self();
  }

  default S treeColumn(ObservableValue<? extends TreeTableColumn<T, ?>> v) {
    node().treeColumnProperty().bind(v);
    return self();
  }

  default S treeColumnBidi(Property<TreeTableColumn<T, ?>> v) {
    node().treeColumnProperty().bindBidirectional(v);
    return self();
  }

  default TreeTableColumn<T, ?> treeColumn() {
    return node().getTreeColumn();
  }
}
