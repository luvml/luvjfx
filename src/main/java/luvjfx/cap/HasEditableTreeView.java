package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeView;
import luvjfx.FxNodeOps;

public interface HasEditableTreeView<S extends HasEditableTreeView<S, N, T>, N extends TreeView<T>, T> extends FxNodeOps<S, N> {
  default S editable(boolean v) {
    node().setEditable(v);
    return self();
  }

  default S editable(ObservableValue<? extends Boolean> v) {
    node().editableProperty().bind(v);
    return self();
  }

  default S editableBidi(Property<Boolean> v) {
    node().editableProperty().bindBidirectional(v);
    return self();
  }

  default boolean editable() {
    return node().isEditable();
  }
}
