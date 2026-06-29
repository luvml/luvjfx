package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ScrollPane;
import luvjfx.FxNodeOps;

public interface HasPannable<S extends HasPannable<S, N>, N extends ScrollPane> extends FxNodeOps<S, N> {
  default S pannable(boolean v) {
    node().setPannable(v);
    return self();
  }

  default S pannable(ObservableValue<? extends Boolean> v) {
    node().pannableProperty().bind(v);
    return self();
  }

  default S pannableBidi(Property<Boolean> v) {
    node().pannableProperty().bindBidirectional(v);
    return self();
  }

  default boolean pannable() {
    return node().isPannable();
  }
}
