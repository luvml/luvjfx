package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Circle;
import luvjfx.FxNodeOps;

public interface HasRadius<S extends HasRadius<S, N>, N extends Circle> extends FxNodeOps<S, N> {
  default S radius(double v) {
    node().setRadius(v);
    return self();
  }

  default S radius(ObservableValue<? extends Double> v) {
    node().radiusProperty().bind(v);
    return self();
  }

  default S radiusBidi(Property<Number> v) {
    node().radiusProperty().bindBidirectional(v);
    return self();
  }

  default double radius() {
    return node().getRadius();
  }
}
