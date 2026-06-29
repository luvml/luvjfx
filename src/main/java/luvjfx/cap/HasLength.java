package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Arc;
import luvjfx.FxNodeOps;

public interface HasLength<S extends HasLength<S, N>, N extends Arc> extends FxNodeOps<S, N> {
  default S length(double v) {
    node().setLength(v);
    return self();
  }

  default S length(ObservableValue<? extends Double> v) {
    node().lengthProperty().bind(v);
    return self();
  }

  default S lengthBidi(Property<Number> v) {
    node().lengthProperty().bindBidirectional(v);
    return self();
  }

  default double length() {
    return node().getLength();
  }
}
