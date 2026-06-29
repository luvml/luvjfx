package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.TilePane;
import luvjfx.FxNodeOps;

public interface HasPrefTileWidth<S extends HasPrefTileWidth<S, N>, N extends TilePane> extends FxNodeOps<S, N> {
  default S prefTileWidth(double v) {
    node().setPrefTileWidth(v);
    return self();
  }

  default S prefTileWidth(ObservableValue<? extends Double> v) {
    node().prefTileWidthProperty().bind(v);
    return self();
  }

  default S prefTileWidthBidi(Property<Number> v) {
    node().prefTileWidthProperty().bindBidirectional(v);
    return self();
  }

  default double prefTileWidth() {
    return node().getPrefTileWidth();
  }
}
