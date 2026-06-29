package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Rectangle;
import luvjfx.FxNodeOps;

public interface HasArcHeight<S extends HasArcHeight<S, N>, N extends Rectangle> extends FxNodeOps<S, N> {
  default S arcHeight(double v) {
    node().setArcHeight(v);
    return self();
  }

  default S arcHeight(ObservableValue<? extends Double> v) {
    node().arcHeightProperty().bind(v);
    return self();
  }

  default S arcHeightBidi(Property<Number> v) {
    node().arcHeightProperty().bindBidirectional(v);
    return self();
  }

  default double arcHeight() {
    return node().getArcHeight();
  }
}
