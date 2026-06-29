package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Arc;
import luvjfx.FxNodeOps;

public interface HasRadiusYArc<S extends HasRadiusYArc<S, N>, N extends Arc> extends FxNodeOps<S, N> {
  default S radiusY(double v) {
    node().setRadiusY(v);
    return self();
  }

  default S radiusY(ObservableValue<? extends Double> v) {
    node().radiusYProperty().bind(v);
    return self();
  }

  default S radiusYBidi(Property<Number> v) {
    node().radiusYProperty().bindBidirectional(v);
    return self();
  }

  default double radiusY() {
    return node().getRadiusY();
  }
}
