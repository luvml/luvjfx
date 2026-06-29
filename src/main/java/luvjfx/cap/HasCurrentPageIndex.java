package luvjfx.cap;

import java.lang.Integer;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Pagination;
import luvjfx.FxNodeOps;

public interface HasCurrentPageIndex<S extends HasCurrentPageIndex<S, N>, N extends Pagination> extends FxNodeOps<S, N> {
  default S currentPageIndex(int v) {
    node().setCurrentPageIndex(v);
    return self();
  }

  default S currentPageIndex(ObservableValue<? extends Integer> v) {
    node().currentPageIndexProperty().bind(v);
    return self();
  }

  default S currentPageIndexBidi(Property<Number> v) {
    node().currentPageIndexProperty().bindBidirectional(v);
    return self();
  }

  default int currentPageIndex() {
    return node().getCurrentPageIndex();
  }
}
