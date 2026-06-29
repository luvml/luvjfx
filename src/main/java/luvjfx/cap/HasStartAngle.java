package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Arc;
import luvjfx.FxNodeOps;

public interface HasStartAngle<S extends HasStartAngle<S, N>, N extends Arc> extends FxNodeOps<S, N> {
  default S startAngle(double v) {
    node().setStartAngle(v);
    return self();
  }

  default S startAngle(ObservableValue<? extends Double> v) {
    node().startAngleProperty().bind(v);
    return self();
  }

  default S startAngleBidi(Property<Number> v) {
    node().startAngleProperty().bindBidirectional(v);
    return self();
  }

  default double startAngle() {
    return node().getStartAngle();
  }
}
