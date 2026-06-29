package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableView;
import javafx.util.Callback;
import luvjfx.FxNodeOps;

public interface HasColumnResizePolicyTableView<S extends HasColumnResizePolicyTableView<S, N, T>, N extends TableView<T>, T> extends FxNodeOps<S, N> {
  default S columnResizePolicy(Callback<TableView.ResizeFeatures, Boolean> v) {
    node().setColumnResizePolicy(v);
    return self();
  }

  default S columnResizePolicy(
      ObservableValue<? extends Callback<TableView.ResizeFeatures, Boolean>> v) {
    node().columnResizePolicyProperty().bind(v);
    return self();
  }

  default S columnResizePolicyBidi(Property<Callback<TableView.ResizeFeatures, Boolean>> v) {
    node().columnResizePolicyProperty().bindBidirectional(v);
    return self();
  }

  default Callback<TableView.ResizeFeatures, Boolean> columnResizePolicy() {
    return node().getColumnResizePolicy();
  }
}
