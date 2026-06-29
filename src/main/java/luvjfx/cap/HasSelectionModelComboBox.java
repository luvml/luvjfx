package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SingleSelectionModel;
import luvjfx.FxNodeOps;

public interface HasSelectionModelComboBox<S extends HasSelectionModelComboBox<S, N, T>, N extends ComboBox<T>, T> extends FxNodeOps<S, N> {
  default S selectionModel(SingleSelectionModel<T> v) {
    node().setSelectionModel(v);
    return self();
  }

  default S selectionModel(ObservableValue<? extends SingleSelectionModel<T>> v) {
    node().selectionModelProperty().bind(v);
    return self();
  }

  default S selectionModelBidi(Property<SingleSelectionModel<T>> v) {
    node().selectionModelProperty().bindBidirectional(v);
    return self();
  }

  default SingleSelectionModel<T> selectionModel() {
    return node().getSelectionModel();
  }
}
