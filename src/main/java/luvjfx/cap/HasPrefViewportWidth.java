package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ScrollPane;
import luvjfx.FxNodeOps;

public interface HasPrefViewportWidth<S extends HasPrefViewportWidth<S, N>, N extends ScrollPane> extends FxNodeOps<S, N> {
  default S prefViewportWidth(double v) {
    node().setPrefViewportWidth(v);
    return self();
  }

  default S prefViewportWidth(ObservableValue<? extends Double> v) {
    node().prefViewportWidthProperty().bind(v);
    return self();
  }

  default S prefViewportWidthBidi(Property<Number> v) {
    node().prefViewportWidthProperty().bindBidirectional(v);
    return self();
  }

  default double prefViewportWidth() {
    return node().getPrefViewportWidth();
  }
}
