package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.control.ScrollToEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import luvjfx.FxNodeOps;

public interface HasOnScrollToColumnTableView<S extends HasOnScrollToColumnTableView<S, N, T>, N extends TableView<T>, T> extends FxNodeOps<S, N> {
  default S onScrollToColumn(EventHandler<ScrollToEvent<TableColumn<T, ?>>> v) {
    node().setOnScrollToColumn(v);
    return self();
  }

  default S onScrollToColumn(
      ObservableValue<? extends EventHandler<ScrollToEvent<TableColumn<T, ?>>>> v) {
    node().onScrollToColumnProperty().bind(v);
    return self();
  }

  default S onScrollToColumnBidi(Property<EventHandler<ScrollToEvent<TableColumn<T, ?>>>> v) {
    node().onScrollToColumnProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<ScrollToEvent<TableColumn<T, ?>>> onScrollToColumn() {
    return node().getOnScrollToColumn();
  }
}
