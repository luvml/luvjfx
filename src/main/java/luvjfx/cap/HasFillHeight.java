package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.HBox;
import luvjfx.FxNodeOps;

public interface HasFillHeight<S extends HasFillHeight<S, N>, N extends HBox> extends FxNodeOps<S, N> {
  default S fillHeight(boolean v) {
    node().setFillHeight(v);
    return self();
  }

  default S fillHeight(ObservableValue<? extends Boolean> v) {
    node().fillHeightProperty().bind(v);
    return self();
  }

  default S fillHeightBidi(Property<Boolean> v) {
    node().fillHeightProperty().bindBidirectional(v);
    return self();
  }

  default boolean fillHeight() {
    return node().isFillHeight();
  }
}
