package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeView;
import luvjfx.FxNodeOps;

public interface HasShowRootTreeView<S extends HasShowRootTreeView<S, N, T>, N extends TreeView<T>, T> extends FxNodeOps<S, N> {
  default S showRoot(boolean v) {
    node().setShowRoot(v);
    return self();
  }

  default S showRoot(ObservableValue<? extends Boolean> v) {
    node().showRootProperty().bind(v);
    return self();
  }

  default S showRootBidi(Property<Boolean> v) {
    node().showRootProperty().bindBidirectional(v);
    return self();
  }

  default boolean showRoot() {
    return node().isShowRoot();
  }
}
