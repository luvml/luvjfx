package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.VPos;
import javafx.scene.layout.FlowPane;
import luvjfx.FxNodeOps;

public interface HasRowValignment<S extends HasRowValignment<S, N>, N extends FlowPane> extends FxNodeOps<S, N> {
  default S rowValignment(VPos v) {
    node().setRowValignment(v);
    return self();
  }

  default S rowValignment(ObservableValue<? extends VPos> v) {
    node().rowValignmentProperty().bind(v);
    return self();
  }

  default S rowValignmentBidi(Property<VPos> v) {
    node().rowValignmentProperty().bindBidirectional(v);
    return self();
  }

  default VPos rowValignment() {
    return node().getRowValignment();
  }
}
