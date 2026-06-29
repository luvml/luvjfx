package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ScrollPane;
import luvjfx.FxNodeOps;

public interface HasMinViewportHeight<S extends HasMinViewportHeight<S, N>, N extends ScrollPane> extends FxNodeOps<S, N> {
  default S minViewportHeight(double v) {
    node().setMinViewportHeight(v);
    return self();
  }

  default S minViewportHeight(ObservableValue<? extends Double> v) {
    node().minViewportHeightProperty().bind(v);
    return self();
  }

  default S minViewportHeightBidi(Property<Number> v) {
    node().minViewportHeightProperty().bindBidirectional(v);
    return self();
  }

  default double minViewportHeight() {
    return node().getMinViewportHeight();
  }
}
