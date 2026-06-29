package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Shape;
import luvjfx.FxNodeOps;

public interface HasFill<S extends HasFill<S, N>, N extends Shape> extends FxNodeOps<S, N> {
  default S fill(Paint v) {
    node().setFill(v);
    return self();
  }

  default S fill(ObservableValue<? extends Paint> v) {
    node().fillProperty().bind(v);
    return self();
  }

  default S fillBidi(Property<Paint> v) {
    node().fillProperty().bindBidirectional(v);
    return self();
  }

  default Paint fill() {
    return node().getFill();
  }
}
