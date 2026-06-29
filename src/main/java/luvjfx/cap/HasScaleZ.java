package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasScaleZ<S extends HasScaleZ<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S scaleZ(double v) {
    node().setScaleZ(v);
    return self();
  }

  default S scaleZ(ObservableValue<? extends Double> v) {
    node().scaleZProperty().bind(v);
    return self();
  }

  default S scaleZBidi(Property<Number> v) {
    node().scaleZProperty().bindBidirectional(v);
    return self();
  }

  default double scaleZ() {
    return node().getScaleZ();
  }
}
