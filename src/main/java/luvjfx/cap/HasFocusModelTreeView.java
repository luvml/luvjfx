package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.FocusModel;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import luvjfx.FxNodeOps;

public interface HasFocusModelTreeView<S extends HasFocusModelTreeView<S, N, T>, N extends TreeView<T>, T> extends FxNodeOps<S, N> {
  default S focusModel(FocusModel<TreeItem<T>> v) {
    node().setFocusModel(v);
    return self();
  }

  default S focusModel(ObservableValue<? extends FocusModel<TreeItem<T>>> v) {
    node().focusModelProperty().bind(v);
    return self();
  }

  default S focusModelBidi(Property<FocusModel<TreeItem<T>>> v) {
    node().focusModelProperty().bindBidirectional(v);
    return self();
  }

  default FocusModel<TreeItem<T>> focusModel() {
    return node().getFocusModel();
  }
}
