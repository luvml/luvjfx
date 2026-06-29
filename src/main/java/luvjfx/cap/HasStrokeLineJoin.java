package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Shape;
import javafx.scene.shape.StrokeLineJoin;
import luvjfx.FxNodeOps;

public interface HasStrokeLineJoin<S extends HasStrokeLineJoin<S, N>, N extends Shape> extends FxNodeOps<S, N> {
  default S strokeLineJoin(StrokeLineJoin v) {
    node().setStrokeLineJoin(v);
    return self();
  }

  default S strokeLineJoin(ObservableValue<? extends StrokeLineJoin> v) {
    node().strokeLineJoinProperty().bind(v);
    return self();
  }

  default S strokeLineJoinBidi(Property<StrokeLineJoin> v) {
    node().strokeLineJoinProperty().bindBidirectional(v);
    return self();
  }

  default StrokeLineJoin strokeLineJoin() {
    return node().getStrokeLineJoin();
  }
}
