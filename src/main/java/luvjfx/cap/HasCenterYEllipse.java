package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Ellipse;
import luvjfx.FxNodeOps;

public interface HasCenterYEllipse<S extends HasCenterYEllipse<S, N>, N extends Ellipse> extends FxNodeOps<S, N> {
  default S centerY(double v) {
    node().setCenterY(v);
    return self();
  }

  default S centerY(ObservableValue<? extends Double> v) {
    node().centerYProperty().bind(v);
    return self();
  }

  default S centerYBidi(Property<Number> v) {
    node().centerYProperty().bindBidirectional(v);
    return self();
  }

  default double centerY() {
    return node().getCenterY();
  }
}
