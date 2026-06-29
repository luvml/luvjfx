package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Rectangle;
import luvjfx.FxNodeOps;

public interface HasWidthRectangle<S extends HasWidthRectangle<S, N>, N extends Rectangle> extends FxNodeOps<S, N> {
  default S width(double v) {
    node().setWidth(v);
    return self();
  }

  default S width(ObservableValue<? extends Double> v) {
    node().widthProperty().bind(v);
    return self();
  }

  default S widthBidi(Property<Number> v) {
    node().widthProperty().bindBidirectional(v);
    return self();
  }

  default double width() {
    return node().getWidth();
  }
}
