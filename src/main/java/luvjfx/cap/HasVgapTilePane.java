package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.TilePane;
import luvjfx.FxNodeOps;

public interface HasVgapTilePane<S extends HasVgapTilePane<S, N>, N extends TilePane> extends FxNodeOps<S, N> {
  default S vgap(double v) {
    node().setVgap(v);
    return self();
  }

  default S vgap(ObservableValue<? extends Double> v) {
    node().vgapProperty().bind(v);
    return self();
  }

  default S vgapBidi(Property<Number> v) {
    node().vgapProperty().bindBidirectional(v);
    return self();
  }

  default double vgap() {
    return node().getVgap();
  }
}
