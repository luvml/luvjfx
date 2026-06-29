package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.HPos;
import javafx.scene.layout.FlowPane;
import luvjfx.FxNodeOps;

public interface HasColumnHalignment<S extends HasColumnHalignment<S, N>, N extends FlowPane> extends FxNodeOps<S, N> {
  default S columnHalignment(HPos v) {
    node().setColumnHalignment(v);
    return self();
  }

  default S columnHalignment(ObservableValue<? extends HPos> v) {
    node().columnHalignmentProperty().bind(v);
    return self();
  }

  default S columnHalignmentBidi(Property<HPos> v) {
    node().columnHalignmentProperty().bindBidirectional(v);
    return self();
  }

  default HPos columnHalignment() {
    return node().getColumnHalignment();
  }
}
