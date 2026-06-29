package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Arc;
import luvjfx.FxNodeOps;

public interface HasRadiusXArc<S extends HasRadiusXArc<S, N>, N extends Arc> extends FxNodeOps<S, N> {
  default S radiusX(double v) {
    node().setRadiusX(v);
    return self();
  }

  default S radiusX(ObservableValue<? extends Double> v) {
    node().radiusXProperty().bind(v);
    return self();
  }

  default S radiusXBidi(Property<Number> v) {
    node().radiusXProperty().bindBidirectional(v);
    return self();
  }

  default double radiusX() {
    return node().getRadiusX();
  }
}
