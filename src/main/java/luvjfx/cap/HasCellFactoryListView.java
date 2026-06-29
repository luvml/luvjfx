package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import luvjfx.FxNodeOps;

public interface HasCellFactoryListView<S extends HasCellFactoryListView<S, N, T>, N extends ListView<T>, T> extends FxNodeOps<S, N> {
  default S cellFactory(Callback<ListView<T>, ListCell<T>> v) {
    node().setCellFactory(v);
    return self();
  }

  default S cellFactory(ObservableValue<? extends Callback<ListView<T>, ListCell<T>>> v) {
    node().cellFactoryProperty().bind(v);
    return self();
  }

  default S cellFactoryBidi(Property<Callback<ListView<T>, ListCell<T>>> v) {
    node().cellFactoryProperty().bindBidirectional(v);
    return self();
  }

  default Callback<ListView<T>, ListCell<T>> cellFactory() {
    return node().getCellFactory();
  }
}
