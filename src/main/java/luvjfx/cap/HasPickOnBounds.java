package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasPickOnBounds<S extends HasPickOnBounds<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S pickOnBounds(boolean v) {
    node().setPickOnBounds(v);
    return self();
  }

  default S pickOnBounds(ObservableValue<? extends Boolean> v) {
    node().pickOnBoundsProperty().bind(v);
    return self();
  }

  default S pickOnBoundsBidi(Property<Boolean> v) {
    node().pickOnBoundsProperty().bindBidirectional(v);
    return self();
  }

  default boolean pickOnBounds() {
    return node().isPickOnBounds();
  }
}
