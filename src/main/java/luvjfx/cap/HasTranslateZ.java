package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasTranslateZ<S extends HasTranslateZ<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S translateZ(double v) {
    node().setTranslateZ(v);
    return self();
  }

  default S translateZ(ObservableValue<? extends Double> v) {
    node().translateZProperty().bind(v);
    return self();
  }

  default S translateZBidi(Property<Number> v) {
    node().translateZProperty().bindBidirectional(v);
    return self();
  }

  default double translateZ() {
    return node().getTranslateZ();
  }
}
