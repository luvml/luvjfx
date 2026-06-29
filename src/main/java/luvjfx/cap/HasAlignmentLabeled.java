package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.control.Labeled;
import luvjfx.FxNodeOps;

public interface HasAlignmentLabeled<S extends HasAlignmentLabeled<S, N>, N extends Labeled> extends FxNodeOps<S, N> {
  default S alignment(Pos v) {
    node().setAlignment(v);
    return self();
  }

  default S alignment(ObservableValue<? extends Pos> v) {
    node().alignmentProperty().bind(v);
    return self();
  }

  default S alignmentBidi(Property<Pos> v) {
    node().alignmentProperty().bindBidirectional(v);
    return self();
  }

  default Pos alignment() {
    return node().getAlignment();
  }
}
