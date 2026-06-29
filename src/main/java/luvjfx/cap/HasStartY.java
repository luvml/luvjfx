package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Line;
import luvjfx.FxNodeOps;

public interface HasStartY<S extends HasStartY<S, N>, N extends Line> extends FxNodeOps<S, N> {
  default S startY(double v) {
    node().setStartY(v);
    return self();
  }

  default S startY(ObservableValue<? extends Double> v) {
    node().startYProperty().bind(v);
    return self();
  }

  default S startYBidi(Property<Number> v) {
    node().startYProperty().bindBidirectional(v);
    return self();
  }

  default double startY() {
    return node().getStartY();
  }
}
