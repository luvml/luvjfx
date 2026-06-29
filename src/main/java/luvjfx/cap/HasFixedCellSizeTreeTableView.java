package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeTableView;
import luvjfx.FxNodeOps;

public interface HasFixedCellSizeTreeTableView<S extends HasFixedCellSizeTreeTableView<S, N, T>, N extends TreeTableView<T>, T> extends FxNodeOps<S, N> {
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
