package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Point3D;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasRotationAxis<S extends HasRotationAxis<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S rotationAxis(Point3D v) {
    node().setRotationAxis(v);
    return self();
  }

  default S rotationAxis(ObservableValue<? extends Point3D> v) {
    node().rotationAxisProperty().bind(v);
    return self();
  }

  default S rotationAxisBidi(Property<Point3D> v) {
    node().rotationAxisProperty().bindBidirectional(v);
    return self();
  }

  default Point3D rotationAxis() {
    return node().getRotationAxis();
  }
}
