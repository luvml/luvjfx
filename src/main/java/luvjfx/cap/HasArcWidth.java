package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Rectangle;
import luvjfx.FxNodeOps;

public interface HasArcWidth<S extends HasArcWidth<S, N>, N extends Rectangle> extends FxNodeOps<S, N> {
  default S arcWidth(double v) {
    node().setArcWidth(v);
    return self();
  }

  default S arcWidth(ObservableValue<? extends Double> v) {
    node().arcWidthProperty().bind(v);
    return self();
  }

  default S arcWidthBidi(Property<Number> v) {
    node().arcWidthProperty().bindBidirectional(v);
    return self();
  }

  default double arcWidth() {
    return node().getArcWidth();
  }
}
