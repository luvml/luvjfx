package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeView;
import javafx.util.Callback;
import luvjfx.FxNodeOps;

public interface HasCellFactoryTreeView<S extends HasCellFactoryTreeView<S, N, T>, N extends TreeView<T>, T> extends FxNodeOps<S, N> {
  default S cellFactory(Callback<TreeView<T>, TreeCell<T>> v) {
    node().setCellFactory(v);
    return self();
  }

  default S cellFactory(ObservableValue<? extends Callback<TreeView<T>, TreeCell<T>>> v) {
    node().cellFactoryProperty().bind(v);
    return self();
  }

  default S cellFactoryBidi(Property<Callback<TreeView<T>, TreeCell<T>>> v) {
    node().cellFactoryProperty().bindBidirectional(v);
    return self();
  }

  default Callback<TreeView<T>, TreeCell<T>> cellFactory() {
    return node().getCellFactory();
  }
}
