package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import luvjfx.FxNodeOps;

public interface HasAlignmentStackPane<S extends HasAlignmentStackPane<S, N>, N extends StackPane> extends FxNodeOps<S, N> {
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
