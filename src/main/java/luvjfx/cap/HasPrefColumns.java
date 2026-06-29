package luvjfx.cap;

import java.lang.Integer;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.TilePane;
import luvjfx.FxNodeOps;

public interface HasPrefColumns<S extends HasPrefColumns<S, N>, N extends TilePane> extends FxNodeOps<S, N> {
  default S prefColumns(int v) {
    node().setPrefColumns(v);
    return self();
  }

  default S prefColumns(ObservableValue<? extends Integer> v) {
    node().prefColumnsProperty().bind(v);
    return self();
  }

  default S prefColumnsBidi(Property<Number> v) {
    node().prefColumnsProperty().bindBidirectional(v);
    return self();
  }

  default int prefColumns() {
    return node().getPrefColumns();
  }
}
