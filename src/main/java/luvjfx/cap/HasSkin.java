package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Control;
import javafx.scene.control.Skin;
import luvjfx.FxNodeOps;

public interface HasSkin<S extends HasSkin<S, N>, N extends Control> extends FxNodeOps<S, N> {
  default S skin(Skin<?> v) {
    node().setSkin(v);
    return self();
  }

  default S skin(ObservableValue<? extends Skin<?>> v) {
    node().skinProperty().bind(v);
    return self();
  }

  default S skinBidi(Property<Skin<?>> v) {
    node().skinProperty().bindBidirectional(v);
    return self();
  }

  default Skin<?> skin() {
    return node().getSkin();
  }
}
