package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Shape;
import luvjfx.FxNodeOps;

public interface HasStrokeDashOffset<S extends HasStrokeDashOffset<S, N>, N extends Shape> extends FxNodeOps<S, N> {
  default S strokeDashOffset(double v) {
    node().setStrokeDashOffset(v);
    return self();
  }

  default S strokeDashOffset(ObservableValue<? extends Double> v) {
    node().strokeDashOffsetProperty().bind(v);
    return self();
  }

  default S strokeDashOffsetBidi(Property<Number> v) {
    node().strokeDashOffsetProperty().bindBidirectional(v);
    return self();
  }

  default double strokeDashOffset() {
    return node().getStrokeDashOffset();
  }
}
