package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.control.ListView;
import luvjfx.FxNodeOps;

public interface HasOnEditStartListView<S extends HasOnEditStartListView<S, N, T>, N extends ListView<T>, T> extends FxNodeOps<S, N> {
  default S onEditStart(EventHandler<ListView.EditEvent<T>> v) {
    node().setOnEditStart(v);
    return self();
  }

  default S onEditStart(ObservableValue<? extends EventHandler<ListView.EditEvent<T>>> v) {
    node().onEditStartProperty().bind(v);
    return self();
  }

  default S onEditStartBidi(Property<EventHandler<ListView.EditEvent<T>>> v) {
    node().onEditStartProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<ListView.EditEvent<T>> onEditStart() {
    return node().getOnEditStart();
  }
}
