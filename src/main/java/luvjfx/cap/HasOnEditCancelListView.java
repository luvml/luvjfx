package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.control.ListView;
import luvjfx.FxNodeOps;

public interface HasOnEditCancelListView<S extends HasOnEditCancelListView<S, N, T>, N extends ListView<T>, T> extends FxNodeOps<S, N> {
  default S onEditCancel(EventHandler<ListView.EditEvent<T>> v) {
    node().setOnEditCancel(v);
    return self();
  }

  default S onEditCancel(ObservableValue<? extends EventHandler<ListView.EditEvent<T>>> v) {
    node().onEditCancelProperty().bind(v);
    return self();
  }

  default S onEditCancelBidi(Property<EventHandler<ListView.EditEvent<T>>> v) {
    node().onEditCancelProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<ListView.EditEvent<T>> onEditCancel() {
    return node().getOnEditCancel();
  }
}
