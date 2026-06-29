package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.scene.layout.FlowPane;
import luvjfx.FxNodeOps;

public interface HasOrientationFlowPane<S extends HasOrientationFlowPane<S, N>, N extends FlowPane> extends FxNodeOps<S, N> {
  default S orientation(Orientation v) {
    node().setOrientation(v);
    return self();
  }

  default S orientation(ObservableValue<? extends Orientation> v) {
    node().orientationProperty().bind(v);
    return self();
  }

  default S orientationBidi(Property<Orientation> v) {
    node().orientationProperty().bindBidirectional(v);
    return self();
  }

  default Orientation orientation() {
    return node().getOrientation();
  }
}
