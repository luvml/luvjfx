package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Line;
import luvjfx.FxNodeOps;

public interface HasEndY<S extends HasEndY<S, N>, N extends Line> extends FxNodeOps<S, N> {
  default S endY(double v) {
    node().setEndY(v);
    return self();
  }

  default S endY(ObservableValue<? extends Double> v) {
    node().endYProperty().bind(v);
    return self();
  }

  default S endYBidi(Property<Number> v) {
    node().endYProperty().bindBidirectional(v);
    return self();
  }

  default double endY() {
    return node().getEndY();
  }
}
