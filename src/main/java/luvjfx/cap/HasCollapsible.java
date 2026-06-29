package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TitledPane;
import luvjfx.FxNodeOps;

public interface HasCollapsible<S extends HasCollapsible<S, N>, N extends TitledPane> extends FxNodeOps<S, N> {
  default S collapsible(boolean v) {
    node().setCollapsible(v);
    return self();
  }

  default S collapsible(ObservableValue<? extends Boolean> v) {
    node().collapsibleProperty().bind(v);
    return self();
  }

  default S collapsibleBidi(Property<Boolean> v) {
    node().collapsibleProperty().bindBidirectional(v);
    return self();
  }

  default boolean collapsible() {
    return node().isCollapsible();
  }
}
