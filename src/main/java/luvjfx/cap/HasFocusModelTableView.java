package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableView;
import luvjfx.FxNodeOps;

public interface HasFocusModelTableView<S extends HasFocusModelTableView<S, N, T>, N extends TableView<T>, T> extends FxNodeOps<S, N> {
  default S focusModel(TableView.TableViewFocusModel<T> v) {
    node().setFocusModel(v);
    return self();
  }

  default S focusModel(ObservableValue<? extends TableView.TableViewFocusModel<T>> v) {
    node().focusModelProperty().bind(v);
    return self();
  }

  default S focusModelBidi(Property<TableView.TableViewFocusModel<T>> v) {
    node().focusModelProperty().bindBidirectional(v);
    return self();
  }

  default TableView.TableViewFocusModel<T> focusModel() {
    return node().getFocusModel();
  }
}
