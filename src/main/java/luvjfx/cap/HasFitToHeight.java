package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ScrollPane;
import luvjfx.FxNodeOps;

public interface HasFitToHeight<S extends HasFitToHeight<S, N>, N extends ScrollPane> extends FxNodeOps<S, N> {
  default S fitToHeight(boolean v) {
    node().setFitToHeight(v);
    return self();
  }

  default S fitToHeight(ObservableValue<? extends Boolean> v) {
    node().fitToHeightProperty().bind(v);
    return self();
  }

  default S fitToHeightBidi(Property<Boolean> v) {
    node().fitToHeightProperty().bindBidirectional(v);
    return self();
  }

  default boolean fitToHeight() {
    return node().isFitToHeight();
  }
}
