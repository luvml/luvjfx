package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasTranslateY<S extends HasTranslateY<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S translateY(double v) {
    node().setTranslateY(v);
    return self();
  }

  default S translateY(ObservableValue<? extends Double> v) {
    node().translateYProperty().bind(v);
    return self();
  }

  default S translateYBidi(Property<Number> v) {
    node().translateYProperty().bindBidirectional(v);
    return self();
  }

  default double translateY() {
    return node().getTranslateY();
  }
}
