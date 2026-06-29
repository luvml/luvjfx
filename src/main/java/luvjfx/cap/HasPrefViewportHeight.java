package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ScrollPane;
import luvjfx.FxNodeOps;

public interface HasPrefViewportHeight<S extends HasPrefViewportHeight<S, N>, N extends ScrollPane> extends FxNodeOps<S, N> {
  default S prefViewportHeight(double v) {
    node().setPrefViewportHeight(v);
    return self();
  }

  default S prefViewportHeight(ObservableValue<? extends Double> v) {
    node().prefViewportHeightProperty().bind(v);
    return self();
  }

  default S prefViewportHeightBidi(Property<Number> v) {
    node().prefViewportHeightProperty().bindBidirectional(v);
    return self();
  }

  default double prefViewportHeight() {
    return node().getPrefViewportHeight();
  }
}
