package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TitledPane;
import luvjfx.FxNodeOps;

public interface HasExpanded<S extends HasExpanded<S, N>, N extends TitledPane> extends FxNodeOps<S, N> {
  default S expanded(boolean v) {
    node().setExpanded(v);
    return self();
  }

  default S expanded(ObservableValue<? extends Boolean> v) {
    node().expandedProperty().bind(v);
    return self();
  }

  default S expandedBidi(Property<Boolean> v) {
    node().expandedProperty().bindBidirectional(v);
    return self();
  }

  default boolean expanded() {
    return node().isExpanded();
  }
}
