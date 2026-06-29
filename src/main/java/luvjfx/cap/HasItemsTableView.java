package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import luvjfx.FxNodeOps;

public interface HasItemsTableView<S extends HasItemsTableView<S, N, T>, N extends TableView<T>, T> extends FxNodeOps<S, N> {
  default S items(ObservableList<T> v) {
    node().setItems(v);
    return self();
  }

  default S items(ObservableValue<? extends ObservableList<T>> v) {
    node().itemsProperty().bind(v);
    return self();
  }

  default S itemsBidi(Property<ObservableList<T>> v) {
    node().itemsProperty().bindBidirectional(v);
    return self();
  }

  default ObservableList<T> items() {
    return node().getItems();
  }
}
