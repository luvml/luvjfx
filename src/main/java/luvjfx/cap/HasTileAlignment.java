package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;
import luvjfx.FxNodeOps;

public interface HasTileAlignment<S extends HasTileAlignment<S, N>, N extends TilePane> extends FxNodeOps<S, N> {
  default S tileAlignment(Pos v) {
    node().setTileAlignment(v);
    return self();
  }

  default S tileAlignment(ObservableValue<? extends Pos> v) {
    node().tileAlignmentProperty().bind(v);
    return self();
  }

  default S tileAlignmentBidi(Property<Pos> v) {
    node().tileAlignmentProperty().bindBidirectional(v);
    return self();
  }

  default Pos tileAlignment() {
    return node().getTileAlignment();
  }
}
