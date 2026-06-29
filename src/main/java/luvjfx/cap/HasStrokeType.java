package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Shape;
import javafx.scene.shape.StrokeType;
import luvjfx.FxNodeOps;

public interface HasStrokeType<S extends HasStrokeType<S, N>, N extends Shape> extends FxNodeOps<S, N> {
  default S strokeType(StrokeType v) {
    node().setStrokeType(v);
    return self();
  }

  default S strokeType(ObservableValue<? extends StrokeType> v) {
    node().strokeTypeProperty().bind(v);
    return self();
  }

  default S strokeTypeBidi(Property<StrokeType> v) {
    node().strokeTypeProperty().bindBidirectional(v);
    return self();
  }

  default StrokeType strokeType() {
    return node().getStrokeType();
  }
}
