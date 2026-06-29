package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableView;
import luvjfx.FxNodeOps;

public interface HasSelectionModelTableView<S extends HasSelectionModelTableView<S, N, T>, N extends TableView<T>, T> extends FxNodeOps<S, N> {
  default S selectionModel(TableView.TableViewSelectionModel<T> v) {
    node().setSelectionModel(v);
    return self();
  }

  default S selectionModel(ObservableValue<? extends TableView.TableViewSelectionModel<T>> v) {
    node().selectionModelProperty().bind(v);
    return self();
  }

  default S selectionModelBidi(Property<TableView.TableViewSelectionModel<T>> v) {
    node().selectionModelProperty().bindBidirectional(v);
    return self();
  }

  default TableView.TableViewSelectionModel<T> selectionModel() {
    return node().getSelectionModel();
  }
}
