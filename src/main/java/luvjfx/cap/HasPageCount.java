package luvjfx.cap;

import java.lang.Integer;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Pagination;
import luvjfx.FxNodeOps;

public interface HasPageCount<S extends HasPageCount<S, N>, N extends Pagination> extends FxNodeOps<S, N> {
  default S pageCount(int v) {
    node().setPageCount(v);
    return self();
  }

  default S pageCount(ObservableValue<? extends Integer> v) {
    node().pageCountProperty().bind(v);
    return self();
  }

  default S pageCountBidi(Property<Number> v) {
    node().pageCountProperty().bindBidirectional(v);
    return self();
  }

  default int pageCount() {
    return node().getPageCount();
  }
}
