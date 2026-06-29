package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.control.TreeView;
import luvjfx.FxNodeOps;

public interface HasOnEditCancelTreeView<S extends HasOnEditCancelTreeView<S, N, T>, N extends TreeView<T>, T> extends FxNodeOps<S, N> {
  default S onEditCancel(EventHandler<TreeView.EditEvent<T>> v) {
    node().setOnEditCancel(v);
    return self();
  }

  default S onEditCancel(ObservableValue<? extends EventHandler<TreeView.EditEvent<T>>> v) {
    node().onEditCancelProperty().bind(v);
    return self();
  }

  default S onEditCancelBidi(Property<EventHandler<TreeView.EditEvent<T>>> v) {
    node().onEditCancelProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<TreeView.EditEvent<T>> onEditCancel() {
    return node().getOnEditCancel();
  }
}
