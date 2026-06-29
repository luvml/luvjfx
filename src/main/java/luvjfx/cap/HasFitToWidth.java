package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ScrollPane;
import luvjfx.FxNodeOps;

public interface HasFitToWidth<S extends HasFitToWidth<S, N>, N extends ScrollPane> extends FxNodeOps<S, N> {
  default S fitToWidth(boolean v) {
    node().setFitToWidth(v);
    return self();
  }

  default S fitToWidth(ObservableValue<? extends Boolean> v) {
    node().fitToWidthProperty().bind(v);
    return self();
  }

  default S fitToWidthBidi(Property<Boolean> v) {
    node().fitToWidthProperty().bindBidirectional(v);
    return self();
  }

  default boolean fitToWidth() {
    return node().isFitToWidth();
  }
}
