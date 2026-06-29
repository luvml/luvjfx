package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Shape;
import luvjfx.FxNodeOps;

public interface HasStroke<S extends HasStroke<S, N>, N extends Shape> extends FxNodeOps<S, N> {
  default S stroke(Paint v) {
    node().setStroke(v);
    return self();
  }

  default S stroke(ObservableValue<? extends Paint> v) {
    node().strokeProperty().bind(v);
    return self();
  }

  default S strokeBidi(Property<Paint> v) {
    node().strokeProperty().bindBidirectional(v);
    return self();
  }

  default Paint stroke() {
    return node().getStroke();
  }
}
