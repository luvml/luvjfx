package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeTableView;
import luvjfx.FxNodeOps;

public interface HasFocusModelTreeTableView<S extends HasFocusModelTreeTableView<S, N, T>, N extends TreeTableView<T>, T> extends FxNodeOps<S, N> {
  default S focusModel(TreeTableView.TreeTableViewFocusModel<T> v) {
    node().setFocusModel(v);
    return self();
  }

  default S focusModel(ObservableValue<? extends TreeTableView.TreeTableViewFocusModel<T>> v) {
    node().focusModelProperty().bind(v);
    return self();
  }

  default S focusModelBidi(Property<TreeTableView.TreeTableViewFocusModel<T>> v) {
    node().focusModelProperty().bindBidirectional(v);
    return self();
  }

  default TreeTableView.TreeTableViewFocusModel<T> focusModel() {
    return node().getFocusModel();
  }
}
