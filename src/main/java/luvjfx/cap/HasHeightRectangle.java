package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Rectangle;
import luvjfx.FxNodeOps;

public interface HasHeightRectangle<S extends HasHeightRectangle<S, N>, N extends Rectangle> extends FxNodeOps<S, N> {
  default S height(double v) {
    node().setHeight(v);
    return self();
  }

  default S height(ObservableValue<? extends Double> v) {
    node().heightProperty().bind(v);
    return self();
  }

  default S heightBidi(Property<Number> v) {
    node().heightProperty().bindBidirectional(v);
    return self();
  }

  default double height() {
    return node().getHeight();
  }
}
