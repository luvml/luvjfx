package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import luvjfx.FxNodeOps;

public interface HasType<S extends HasType<S, N>, N extends Arc> extends FxNodeOps<S, N> {
  default S type(ArcType v) {
    node().setType(v);
    return self();
  }

  default S type(ObservableValue<? extends ArcType> v) {
    node().typeProperty().bind(v);
    return self();
  }

  default S typeBidi(Property<ArcType> v) {
    node().typeProperty().bindBidirectional(v);
    return self();
  }

  default ArcType type() {
    return node().getType();
  }
}
