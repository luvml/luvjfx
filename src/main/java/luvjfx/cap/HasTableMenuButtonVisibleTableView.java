package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableView;
import luvjfx.FxNodeOps;

public interface HasTableMenuButtonVisibleTableView<S extends HasTableMenuButtonVisibleTableView<S, N, T>, N extends TableView<T>, T> extends FxNodeOps<S, N> {
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
