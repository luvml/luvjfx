package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.control.TreeView;
import luvjfx.FxNodeOps;

public interface HasOnEditCommitTreeView<S extends HasOnEditCommitTreeView<S, N, T>, N extends TreeView<T>, T> extends FxNodeOps<S, N> {
  default S onEditCommit(EventHandler<TreeView.EditEvent<T>> v) {
    node().setOnEditCommit(v);
    return self();
  }

  default S onEditCommit(ObservableValue<? extends EventHandler<TreeView.EditEvent<T>>> v) {
    node().onEditCommitProperty().bind(v);
    return self();
  }

  default S onEditCommitBidi(Property<EventHandler<TreeView.EditEvent<T>>> v) {
    node().onEditCommitProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<TreeView.EditEvent<T>> onEditCommit() {
    return node().getOnEditCommit();
  }
}
