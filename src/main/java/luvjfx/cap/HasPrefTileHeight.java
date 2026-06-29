package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.TilePane;
import luvjfx.FxNodeOps;

public interface HasPrefTileHeight<S extends HasPrefTileHeight<S, N>, N extends TilePane> extends FxNodeOps<S, N> {
  default S prefTileHeight(double v) {
    node().setPrefTileHeight(v);
    return self();
  }

  default S prefTileHeight(ObservableValue<? extends Double> v) {
    node().prefTileHeightProperty().bind(v);
    return self();
  }

  default S prefTileHeightBidi(Property<Number> v) {
    node().prefTileHeightProperty().bindBidirectional(v);
    return self();
  }

  default double prefTileHeight() {
    return node().getPrefTileHeight();
  }
}
