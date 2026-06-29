package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Ellipse;
import luvjfx.FxNodeOps;

public interface HasCenterXEllipse<S extends HasCenterXEllipse<S, N>, N extends Ellipse> extends FxNodeOps<S, N> {
  default S centerX(double v) {
    node().setCenterX(v);
    return self();
  }

  default S centerX(ObservableValue<? extends Double> v) {
    node().centerXProperty().bind(v);
    return self();
  }

  default S centerXBidi(Property<Number> v) {
    node().centerXProperty().bindBidirectional(v);
    return self();
  }

  default double centerX() {
    return node().getCenterX();
  }
}
