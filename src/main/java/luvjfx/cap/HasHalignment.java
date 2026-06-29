package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.HPos;
import javafx.scene.control.Separator;
import luvjfx.FxNodeOps;

public interface HasHalignment<S extends HasHalignment<S, N>, N extends Separator> extends FxNodeOps<S, N> {
  default S halignment(HPos v) {
    node().setHalignment(v);
    return self();
  }

  default S halignment(ObservableValue<? extends HPos> v) {
    node().halignmentProperty().bind(v);
    return self();
  }

  default S halignmentBidi(Property<HPos> v) {
    node().halignmentProperty().bindBidirectional(v);
    return self();
  }

  default HPos halignment() {
    return node().getHalignment();
  }
}
