package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ListView;
import luvjfx.FxNodeOps;

public interface HasFixedCellSizeListView<S extends HasFixedCellSizeListView<S, N, T>, N extends ListView<T>, T> extends FxNodeOps<S, N> {
  default S fixedCellSize(double v) {
    node().setFixedCellSize(v);
    return self();
  }

  default S fixedCellSize(ObservableValue<? extends Double> v) {
    node().fixedCellSizeProperty().bind(v);
    return self();
  }

  default S fixedCellSizeBidi(Property<Number> v) {
    node().fixedCellSizeProperty().bindBidirectional(v);
    return self();
  }

  default double fixedCellSize() {
    return node().getFixedCellSize();
  }
}
