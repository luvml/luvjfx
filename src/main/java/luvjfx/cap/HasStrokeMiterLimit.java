package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Shape;
import luvjfx.FxNodeOps;

public interface HasStrokeMiterLimit<S extends HasStrokeMiterLimit<S, N>, N extends Shape> extends FxNodeOps<S, N> {
  default S strokeMiterLimit(double v) {
    node().setStrokeMiterLimit(v);
    return self();
  }

  default S strokeMiterLimit(ObservableValue<? extends Double> v) {
    node().strokeMiterLimitProperty().bind(v);
    return self();
  }

  default S strokeMiterLimitBidi(Property<Number> v) {
    node().strokeMiterLimitProperty().bindBidirectional(v);
    return self();
  }

  default double strokeMiterLimit() {
    return node().getStrokeMiterLimit();
  }
}
