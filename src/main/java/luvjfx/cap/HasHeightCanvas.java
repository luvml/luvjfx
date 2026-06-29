package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.canvas.Canvas;
import luvjfx.FxNodeOps;

public interface HasHeightCanvas<S extends HasHeightCanvas<S, N>, N extends Canvas> extends FxNodeOps<S, N> {
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
