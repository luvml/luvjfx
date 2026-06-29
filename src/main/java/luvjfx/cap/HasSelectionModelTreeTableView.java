package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeTableView;
import luvjfx.FxNodeOps;

public interface HasSelectionModelTreeTableView<S extends HasSelectionModelTreeTableView<S, N, T>, N extends TreeTableView<T>, T> extends FxNodeOps<S, N> {
  default S selectionModel(TreeTableView.TreeTableViewSelectionModel<T> v) {
    node().setSelectionModel(v);
    return self();
  }

  default S selectionModel(
      ObservableValue<? extends TreeTableView.TreeTableViewSelectionModel<T>> v) {
    node().selectionModelProperty().bind(v);
    return self();
  }

  default S selectionModelBidi(Property<TreeTableView.TreeTableViewSelectionModel<T>> v) {
    node().selectionModelProperty().bindBidirectional(v);
    return self();
  }

  default TreeTableView.TreeTableViewSelectionModel<T> selectionModel() {
    return node().getSelectionModel();
  }
}
