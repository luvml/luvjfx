package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.effect.Effect;
import luvjfx.FxNodeOps;

public interface HasEffect<S extends HasEffect<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S effect(Effect v) {
    node().setEffect(v);
    return self();
  }

  default S effect(ObservableValue<? extends Effect> v) {
    node().effectProperty().bind(v);
    return self();
  }

  default S effectBidi(Property<Effect> v) {
    node().effectProperty().bindBidirectional(v);
    return self();
  }

  default Effect effect() {
    return node().getEffect();
  }
}
