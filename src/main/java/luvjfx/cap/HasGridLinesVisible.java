package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.GridPane;
import luvjfx.FxNodeOps;

public interface HasGridLinesVisible<S extends HasGridLinesVisible<S, N>, N extends GridPane> extends FxNodeOps<S, N> {
  default S gridLinesVisible(boolean v) {
    node().setGridLinesVisible(v);
    return self();
  }

  default S gridLinesVisible(ObservableValue<? extends Boolean> v) {
    node().gridLinesVisibleProperty().bind(v);
    return self();
  }

  default S gridLinesVisibleBidi(Property<Boolean> v) {
    node().gridLinesVisibleProperty().bindBidirectional(v);
    return self();
  }

  default boolean gridLinesVisible() {
    return node().isGridLinesVisible();
  }
}
