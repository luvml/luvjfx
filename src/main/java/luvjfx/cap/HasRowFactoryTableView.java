package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.util.Callback;
import luvjfx.FxNodeOps;

public interface HasRowFactoryTableView<S extends HasRowFactoryTableView<S, N, T>, N extends TableView<T>, T> extends FxNodeOps<S, N> {
  default S rowFactory(Callback<TableView<T>, TableRow<T>> v) {
    node().setRowFactory(v);
    return self();
  }

  default S rowFactory(ObservableValue<? extends Callback<TableView<T>, TableRow<T>>> v) {
    node().rowFactoryProperty().bind(v);
    return self();
  }

  default S rowFactoryBidi(Property<Callback<TableView<T>, TableRow<T>>> v) {
    node().rowFactoryProperty().bindBidirectional(v);
    return self();
  }

  default Callback<TableView<T>, TableRow<T>> rowFactory() {
    return node().getRowFactory();
  }
}
