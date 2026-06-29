package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.FocusModel;
import javafx.scene.control.ListView;
import luvjfx.FxNodeOps;

public interface HasFocusModelListView<S extends HasFocusModelListView<S, N, T>, N extends ListView<T>, T> extends FxNodeOps<S, N> {
  default S focusModel(FocusModel<T> v) {
    node().setFocusModel(v);
    return self();
  }

  default S focusModel(ObservableValue<? extends FocusModel<T>> v) {
    node().focusModelProperty().bind(v);
    return self();
  }

  default S focusModelBidi(Property<FocusModel<T>> v) {
    node().focusModelProperty().bindBidirectional(v);
    return self();
  }

  default FocusModel<T> focusModel() {
    return node().getFocusModel();
  }
}
