package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import luvjfx.FxNodeOps;

public interface HasSelectionModelTreeView<S extends HasSelectionModelTreeView<S, N, T>, N extends TreeView<T>, T> extends FxNodeOps<S, N> {
  default S selectionModel(MultipleSelectionModel<TreeItem<T>> v) {
    node().setSelectionModel(v);
    return self();
  }

  default S selectionModel(ObservableValue<? extends MultipleSelectionModel<TreeItem<T>>> v) {
    node().selectionModelProperty().bind(v);
    return self();
  }

  default S selectionModelBidi(Property<MultipleSelectionModel<TreeItem<T>>> v) {
    node().selectionModelProperty().bindBidirectional(v);
    return self();
  }

  default MultipleSelectionModel<TreeItem<T>> selectionModel() {
    return node().getSelectionModel();
  }
}
