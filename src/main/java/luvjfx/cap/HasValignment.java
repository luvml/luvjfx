package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.VPos;
import javafx.scene.control.Separator;
import luvjfx.FxNodeOps;

public interface HasValignment<S extends HasValignment<S, N>, N extends Separator> extends FxNodeOps<S, N> {
  default S valignment(VPos v) {
    node().setValignment(v);
    return self();
  }

  default S valignment(ObservableValue<? extends VPos> v) {
    node().valignmentProperty().bind(v);
    return self();
  }

  default S valignmentBidi(Property<VPos> v) {
    node().valignmentProperty().bindBidirectional(v);
    return self();
  }

  default VPos valignment() {
    return node().getValignment();
  }
}
