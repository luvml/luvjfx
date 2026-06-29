package luvjfx.cap;

import java.lang.Integer;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.TilePane;
import luvjfx.FxNodeOps;

public interface HasPrefRows<S extends HasPrefRows<S, N>, N extends TilePane> extends FxNodeOps<S, N> {
  default S prefRows(int v) {
    node().setPrefRows(v);
    return self();
  }

  default S prefRows(ObservableValue<? extends Integer> v) {
    node().prefRowsProperty().bind(v);
    return self();
  }

  default S prefRowsBidi(Property<Number> v) {
    node().prefRowsProperty().bindBidirectional(v);
    return self();
  }

  default int prefRows() {
    return node().getPrefRows();
  }
}
