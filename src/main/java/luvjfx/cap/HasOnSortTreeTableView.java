package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TreeTableView;
import luvjfx.FxNodeOps;

public interface HasOnSortTreeTableView<S extends HasOnSortTreeTableView<S, N, T>, N extends TreeTableView<T>, T> extends FxNodeOps<S, N> {
  default S onSort(EventHandler<SortEvent<TreeTableView<T>>> v) {
    node().setOnSort(v);
    return self();
  }

  default S onSort(ObservableValue<? extends EventHandler<SortEvent<TreeTableView<T>>>> v) {
    node().onSortProperty().bind(v);
    return self();
  }

  default S onSortBidi(Property<EventHandler<SortEvent<TreeTableView<T>>>> v) {
    node().onSortProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<SortEvent<TreeTableView<T>>> onSort() {
    return node().getOnSort();
  }
}
