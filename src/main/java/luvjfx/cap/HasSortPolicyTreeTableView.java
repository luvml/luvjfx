package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeTableView;
import javafx.util.Callback;
import luvjfx.FxNodeOps;

public interface HasSortPolicyTreeTableView<S extends HasSortPolicyTreeTableView<S, N, T>, N extends TreeTableView<T>, T> extends FxNodeOps<S, N> {
  default S sortPolicy(Callback<TreeTableView<T>, Boolean> v) {
    node().setSortPolicy(v);
    return self();
  }

  default S sortPolicy(ObservableValue<? extends Callback<TreeTableView<T>, Boolean>> v) {
    node().sortPolicyProperty().bind(v);
    return self();
  }

  default S sortPolicyBidi(Property<Callback<TreeTableView<T>, Boolean>> v) {
    node().sortPolicyProperty().bindBidirectional(v);
    return self();
  }

  default Callback<TreeTableView<T>, Boolean> sortPolicy() {
    return node().getSortPolicy();
  }
}
