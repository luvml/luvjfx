package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Region;
import javafx.scene.shape.Shape;
import luvjfx.FxNodeOps;

public interface HasShape<S extends HasShape<S, N>, N extends Region> extends FxNodeOps<S, N> {
  default S shape(Shape v) {
    node().setShape(v);
    return self();
  }

  default S shape(FxNodeOps<?, ? extends Shape> v) {
    node().setShape(v.node());
    return self();
  }

  default S shape(ObservableValue<? extends Shape> v) {
    node().shapeProperty().bind(v);
    return self();
  }

  default S shapeBidi(Property<Shape> v) {
    node().shapeProperty().bindBidirectional(v);
    return self();
  }

  default Shape shape() {
    return node().getShape();
  }
}
