package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasScaleX<S extends HasScaleX<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S scaleX(double v) {
    node().setScaleX(v);
    return self();
  }

  default S scaleX(ObservableValue<? extends Double> v) {
    node().scaleXProperty().bind(v);
    return self();
  }

  default S scaleXBidi(Property<Number> v) {
    node().scaleXProperty().bindBidirectional(v);
    return self();
  }

  default double scaleX() {
    return node().getScaleX();
  }
}
