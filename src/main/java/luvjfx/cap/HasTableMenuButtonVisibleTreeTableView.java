package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeTableView;
import luvjfx.FxNodeOps;

public interface HasTableMenuButtonVisibleTreeTableView<S extends HasTableMenuButtonVisibleTreeTableView<S, N, T>, N extends TreeTableView<T>, T> extends FxNodeOps<S, N> {
  default S tableMenuButtonVisible(boolean v) {
    node().setTableMenuButtonVisible(v);
    return self();
  }

  default S tableMenuButtonVisible(ObservableValue<? extends Boolean> v) {
    node().tableMenuButtonVisibleProperty().bind(v);
    return self();
  }

  default S tableMenuButtonVisibleBidi(Property<Boolean> v) {
    node().tableMenuButtonVisibleProperty().bindBidirectional(v);
    return self();
  }

  default boolean tableMenuButtonVisible() {
    return node().isTableMenuButtonVisible();
  }
}
