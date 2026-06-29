package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Shape;
import javafx.scene.shape.StrokeLineCap;
import luvjfx.FxNodeOps;

public interface HasStrokeLineCap<S extends HasStrokeLineCap<S, N>, N extends Shape> extends FxNodeOps<S, N> {
  default S strokeLineCap(StrokeLineCap v) {
    node().setStrokeLineCap(v);
    return self();
  }

  default S strokeLineCap(ObservableValue<? extends StrokeLineCap> v) {
    node().strokeLineCapProperty().bind(v);
    return self();
  }

  default S strokeLineCapBidi(Property<StrokeLineCap> v) {
    node().strokeLineCapProperty().bindBidirectional(v);
    return self();
  }

  default StrokeLineCap strokeLineCap() {
    return node().getStrokeLineCap();
  }
}
