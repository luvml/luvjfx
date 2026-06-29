package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasRotate<S extends HasRotate<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S rotate(double v) {
    node().setRotate(v);
    return self();
  }

  default S rotate(ObservableValue<? extends Double> v) {
    node().rotateProperty().bind(v);
    return self();
  }

  default S rotateBidi(Property<Number> v) {
    node().rotateProperty().bindBidirectional(v);
    return self();
  }

  default double rotate() {
    return node().getRotate();
  }
}
