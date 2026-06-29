package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeTableView;
import javafx.util.Callback;
import luvjfx.FxNodeOps;

public interface HasColumnResizePolicyTreeTableView<S extends HasColumnResizePolicyTreeTableView<S, N, T>, N extends TreeTableView<T>, T> extends FxNodeOps<S, N> {
  default S columnResizePolicy(Callback<TreeTableView.ResizeFeatures, Boolean> v) {
    node().setColumnResizePolicy(v);
    return self();
  }

  default S columnResizePolicy(
      ObservableValue<? extends Callback<TreeTableView.ResizeFeatures, Boolean>> v) {
    node().columnResizePolicyProperty().bind(v);
    return self();
  }

  default S columnResizePolicyBidi(Property<Callback<TreeTableView.ResizeFeatures, Boolean>> v) {
    node().columnResizePolicyProperty().bindBidirectional(v);
    return self();
  }

  default Callback<TreeTableView.ResizeFeatures, Boolean> columnResizePolicy() {
    return node().getColumnResizePolicy();
  }
}
