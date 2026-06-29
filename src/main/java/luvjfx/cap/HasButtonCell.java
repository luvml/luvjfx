package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import luvjfx.FxNodeOps;

public interface HasButtonCell<S extends HasButtonCell<S, N, T>, N extends ComboBox<T>, T> extends FxNodeOps<S, N> {
  default S buttonCell(ListCell<T> v) {
    node().setButtonCell(v);
    return self();
  }

  default S buttonCell(FxNodeOps<?, ? extends ListCell> v) {
    node().setButtonCell(v.node());
    return self();
  }

  default S buttonCell(ObservableValue<? extends ListCell<T>> v) {
    node().buttonCellProperty().bind(v);
    return self();
  }

  default S buttonCellBidi(Property<ListCell<T>> v) {
    node().buttonCellProperty().bindBidirectional(v);
    return self();
  }

  default ListCell<T> buttonCell() {
    return node().getButtonCell();
  }
}
