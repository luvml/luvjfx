package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasScaleY<S extends HasScaleY<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S scaleY(double v) {
    node().setScaleY(v);
    return self();
  }

  default S scaleY(ObservableValue<? extends Double> v) {
    node().scaleYProperty().bind(v);
    return self();
  }

  default S scaleYBidi(Property<Number> v) {
    node().scaleYProperty().bindBidirectional(v);
    return self();
  }

  default double scaleY() {
    return node().getScaleY();
  }
}
