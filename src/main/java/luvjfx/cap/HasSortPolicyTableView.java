package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableView;
import javafx.util.Callback;
import luvjfx.FxNodeOps;

public interface HasSortPolicyTableView<S extends HasSortPolicyTableView<S, N, T>, N extends TableView<T>, T> extends FxNodeOps<S, N> {
  default S sortPolicy(Callback<TableView<T>, Boolean> v) {
    node().setSortPolicy(v);
    return self();
  }

  default S sortPolicy(ObservableValue<? extends Callback<TableView<T>, Boolean>> v) {
    node().sortPolicyProperty().bind(v);
    return self();
  }

  default S sortPolicyBidi(Property<Callback<TableView<T>, Boolean>> v) {
    node().sortPolicyProperty().bindBidirectional(v);
    return self();
  }

  default Callback<TableView<T>, Boolean> sortPolicy() {
    return node().getSortPolicy();
  }
}
