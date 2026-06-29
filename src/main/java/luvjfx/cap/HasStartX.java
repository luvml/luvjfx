package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Line;
import luvjfx.FxNodeOps;

public interface HasStartX<S extends HasStartX<S, N>, N extends Line> extends FxNodeOps<S, N> {
  default S startX(double v) {
    node().setStartX(v);
    return self();
  }

  default S startX(ObservableValue<? extends Double> v) {
    node().startXProperty().bind(v);
    return self();
  }

  default S startXBidi(Property<Number> v) {
    node().startXProperty().bindBidirectional(v);
    return self();
  }

  default double startX() {
    return node().getStartX();
  }
}
