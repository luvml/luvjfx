package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasTranslateX<S extends HasTranslateX<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S translateX(double v) {
    node().setTranslateX(v);
    return self();
  }

  default S translateX(ObservableValue<? extends Double> v) {
    node().translateXProperty().bind(v);
    return self();
  }

  default S translateXBidi(Property<Number> v) {
    node().translateXProperty().bindBidirectional(v);
    return self();
  }

  default double translateX() {
    return node().getTranslateX();
  }
}
