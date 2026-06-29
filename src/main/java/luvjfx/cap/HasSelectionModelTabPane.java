package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import luvjfx.FxNodeOps;

public interface HasSelectionModelTabPane<S extends HasSelectionModelTabPane<S, N>, N extends TabPane> extends FxNodeOps<S, N> {
  default S selectionModel(SingleSelectionModel<Tab> v) {
    node().setSelectionModel(v);
    return self();
  }

  default S selectionModel(ObservableValue<? extends SingleSelectionModel<Tab>> v) {
    node().selectionModelProperty().bind(v);
    return self();
  }

  default S selectionModelBidi(Property<SingleSelectionModel<Tab>> v) {
    node().selectionModelProperty().bindBidirectional(v);
    return self();
  }

  default SingleSelectionModel<Tab> selectionModel() {
    return node().getSelectionModel();
  }
}
