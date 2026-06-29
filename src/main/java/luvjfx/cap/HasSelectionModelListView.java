package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import luvjfx.FxNodeOps;

public interface HasSelectionModelListView<S extends HasSelectionModelListView<S, N, T>, N extends ListView<T>, T> extends FxNodeOps<S, N> {
  default S selectionModel(MultipleSelectionModel<T> v) {
    node().setSelectionModel(v);
    return self();
  }

  default S selectionModel(ObservableValue<? extends MultipleSelectionModel<T>> v) {
    node().selectionModelProperty().bind(v);
    return self();
  }

  default S selectionModelBidi(Property<MultipleSelectionModel<T>> v) {
    node().selectionModelProperty().bindBidirectional(v);
    return self();
  }

  default MultipleSelectionModel<T> selectionModel() {
    return node().getSelectionModel();
  }
}
