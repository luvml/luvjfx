package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.control.ListView;
import luvjfx.FxNodeOps;

public interface HasOnEditCommitListView<S extends HasOnEditCommitListView<S, N, T>, N extends ListView<T>, T> extends FxNodeOps<S, N> {
  default S onEditCommit(EventHandler<ListView.EditEvent<T>> v) {
    node().setOnEditCommit(v);
    return self();
  }

  default S onEditCommit(ObservableValue<? extends EventHandler<ListView.EditEvent<T>>> v) {
    node().onEditCommitProperty().bind(v);
    return self();
  }

  default S onEditCommitBidi(Property<EventHandler<ListView.EditEvent<T>>> v) {
    node().onEditCommitProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<ListView.EditEvent<T>> onEditCommit() {
    return node().getOnEditCommit();
  }
}
