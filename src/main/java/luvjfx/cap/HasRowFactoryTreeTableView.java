package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeTableRow;
import javafx.scene.control.TreeTableView;
import javafx.util.Callback;
import luvjfx.FxNodeOps;

public interface HasRowFactoryTreeTableView<S extends HasRowFactoryTreeTableView<S, N, T>, N extends TreeTableView<T>, T> extends FxNodeOps<S, N> {
  default S rowFactory(Callback<TreeTableView<T>, TreeTableRow<T>> v) {
    node().setRowFactory(v);
    return self();
  }

  default S rowFactory(ObservableValue<? extends Callback<TreeTableView<T>, TreeTableRow<T>>> v) {
    node().rowFactoryProperty().bind(v);
    return self();
  }

  default S rowFactoryBidi(Property<Callback<TreeTableView<T>, TreeTableRow<T>>> v) {
    node().rowFactoryProperty().bindBidirectional(v);
    return self();
  }

  default Callback<TreeTableView<T>, TreeTableRow<T>> rowFactory() {
    return node().getRowFactory();
  }
}
