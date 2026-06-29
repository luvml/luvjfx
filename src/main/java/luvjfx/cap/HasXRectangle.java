package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Rectangle;
import luvjfx.FxNodeOps;

public interface HasXRectangle<S extends HasXRectangle<S, N>, N extends Rectangle> extends FxNodeOps<S, N> {
  default S x(double v) {
    node().setX(v);
    return self();
  }

  default S x(ObservableValue<? extends Double> v) {
    node().xProperty().bind(v);
    return self();
  }

  default S xBidi(Property<Number> v) {
    node().xProperty().bindBidirectional(v);
    return self();
  }

  default double x() {
    return node().getX();
  }
}
