package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ScrollPane;
import luvjfx.FxNodeOps;

public interface HasMinViewportWidth<S extends HasMinViewportWidth<S, N>, N extends ScrollPane> extends FxNodeOps<S, N> {
  default S minViewportWidth(double v) {
    node().setMinViewportWidth(v);
    return self();
  }

  default S minViewportWidth(ObservableValue<? extends Double> v) {
    node().minViewportWidthProperty().bind(v);
    return self();
  }

  default S minViewportWidthBidi(Property<Number> v) {
    node().minViewportWidthProperty().bindBidirectional(v);
    return self();
  }

  default double minViewportWidth() {
    return node().getMinViewportWidth();
  }
}
