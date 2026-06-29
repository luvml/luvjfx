package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasManaged<S extends HasManaged<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S managed(boolean v) {
    node().setManaged(v);
    return self();
  }

  default S managed(ObservableValue<? extends Boolean> v) {
    node().managedProperty().bind(v);
    return self();
  }

  default S managedBidi(Property<Boolean> v) {
    node().managedProperty().bindBidirectional(v);
    return self();
  }

  default boolean managed() {
    return node().isManaged();
  }
}
