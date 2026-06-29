package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableView;
import luvjfx.FxNodeOps;

public interface HasOnSortTableView<S extends HasOnSortTableView<S, N, T>, N extends TableView<T>, T> extends FxNodeOps<S, N> {
  default S onSort(EventHandler<SortEvent<TableView<T>>> v) {
    node().setOnSort(v);
    return self();
  }

  default S onSort(ObservableValue<? extends EventHandler<SortEvent<TableView<T>>>> v) {
    node().onSortProperty().bind(v);
    return self();
  }

  default S onSortBidi(Property<EventHandler<SortEvent<TableView<T>>>> v) {
    node().onSortProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<SortEvent<TableView<T>>> onSort() {
    return node().getOnSort();
  }
}
