package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.VBox;
import luvjfx.FxNodeOps;

public interface HasFillWidth<S extends HasFillWidth<S, N>, N extends VBox> extends FxNodeOps<S, N> {
  default S fillWidth(boolean v) {
    node().setFillWidth(v);
    return self();
  }

  default S fillWidth(ObservableValue<? extends Boolean> v) {
    node().fillWidthProperty().bind(v);
    return self();
  }

  default S fillWidthBidi(Property<Boolean> v) {
    node().fillWidthProperty().bindBidirectional(v);
    return self();
  }

  default boolean fillWidth() {
    return node().isFillWidth();
  }
}
