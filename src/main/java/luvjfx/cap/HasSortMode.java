package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeSortMode;
import javafx.scene.control.TreeTableView;
import luvjfx.FxNodeOps;

public interface HasSortMode<S extends HasSortMode<S, N, T>, N extends TreeTableView<T>, T> extends FxNodeOps<S, N> {
  default S sortMode(TreeSortMode v) {
    node().setSortMode(v);
    return self();
  }

  default S sortMode(ObservableValue<? extends TreeSortMode> v) {
    node().sortModeProperty().bind(v);
    return self();
  }

  default S sortModeBidi(Property<TreeSortMode> v) {
    node().sortModeProperty().bindBidirectional(v);
    return self();
  }

  default TreeSortMode sortMode() {
    return node().getSortMode();
  }
}
