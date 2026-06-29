package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.control.TreeView;
import luvjfx.FxNodeOps;

public interface HasOnEditStartTreeView<S extends HasOnEditStartTreeView<S, N, T>, N extends TreeView<T>, T> extends FxNodeOps<S, N> {
  default S onEditStart(EventHandler<TreeView.EditEvent<T>> v) {
    node().setOnEditStart(v);
    return self();
  }

  default S onEditStart(ObservableValue<? extends EventHandler<TreeView.EditEvent<T>>> v) {
    node().onEditStartProperty().bind(v);
    return self();
  }

  default S onEditStartBidi(Property<EventHandler<TreeView.EditEvent<T>>> v) {
    node().onEditStartProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<TreeView.EditEvent<T>> onEditStart() {
    return node().getOnEditStart();
  }
}
