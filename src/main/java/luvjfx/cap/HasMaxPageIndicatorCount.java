package luvjfx.cap;

import java.lang.Integer;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Pagination;
import luvjfx.FxNodeOps;

public interface HasMaxPageIndicatorCount<S extends HasMaxPageIndicatorCount<S, N>, N extends Pagination> extends FxNodeOps<S, N> {
  default S maxPageIndicatorCount(int v) {
    node().setMaxPageIndicatorCount(v);
    return self();
  }

  default S maxPageIndicatorCount(ObservableValue<? extends Integer> v) {
    node().maxPageIndicatorCountProperty().bind(v);
    return self();
  }

  default S maxPageIndicatorCountBidi(Property<Number> v) {
    node().maxPageIndicatorCountProperty().bindBidirectional(v);
    return self();
  }

  default int maxPageIndicatorCount() {
    return node().getMaxPageIndicatorCount();
  }
}
