package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Shape;
import luvjfx.FxNodeOps;

public interface HasStrokeWidth<S extends HasStrokeWidth<S, N>, N extends Shape> extends FxNodeOps<S, N> {
  default S strokeWidth(double v) {
    node().setStrokeWidth(v);
    return self();
  }

  default S strokeWidth(ObservableValue<? extends Double> v) {
    node().strokeWidthProperty().bind(v);
    return self();
  }

  default S strokeWidthBidi(Property<Number> v) {
    node().strokeWidthProperty().bindBidirectional(v);
    return self();
  }

  default double strokeWidth() {
    return node().getStrokeWidth();
  }
}
