package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.control.ScrollToEvent;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import luvjfx.FxNodeOps;

public interface HasOnScrollToColumnTreeTableView<S extends HasOnScrollToColumnTreeTableView<S, N, T>, N extends TreeTableView<T>, T> extends FxNodeOps<S, N> {
  default S onScrollToColumn(EventHandler<ScrollToEvent<TreeTableColumn<T, ?>>> v) {
    node().setOnScrollToColumn(v);
    return self();
  }

  default S onScrollToColumn(
      ObservableValue<? extends EventHandler<ScrollToEvent<TreeTableColumn<T, ?>>>> v) {
    node().onScrollToColumnProperty().bind(v);
    return self();
  }

  default S onScrollToColumnBidi(Property<EventHandler<ScrollToEvent<TreeTableColumn<T, ?>>>> v) {
    node().onScrollToColumnProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<ScrollToEvent<TreeTableColumn<T, ?>>> onScrollToColumn() {
    return node().getOnScrollToColumn();
  }
}
