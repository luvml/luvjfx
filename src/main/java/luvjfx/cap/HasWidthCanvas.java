package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.canvas.Canvas;
import luvjfx.FxNodeOps;

public interface HasWidthCanvas<S extends HasWidthCanvas<S, N>, N extends Canvas> extends FxNodeOps<S, N> {
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
