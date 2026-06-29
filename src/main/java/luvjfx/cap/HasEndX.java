package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Line;
import luvjfx.FxNodeOps;

public interface HasEndX<S extends HasEndX<S, N>, N extends Line> extends FxNodeOps<S, N> {
  default S endX(double v) {
    node().setEndX(v);
    return self();
  }

  default S endX(ObservableValue<? extends Double> v) {
    node().endXProperty().bind(v);
    return self();
  }

  default S endXBidi(Property<Number> v) {
    node().endXProperty().bindBidirectional(v);
    return self();
  }

  default double endX() {
    return node().getEndX();
  }
}
