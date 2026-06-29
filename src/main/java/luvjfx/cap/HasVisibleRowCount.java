package luvjfx.cap;

import java.lang.Integer;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ComboBox;
import luvjfx.FxNodeOps;

public interface HasVisibleRowCount<S extends HasVisibleRowCount<S, N, T>, N extends ComboBox<T>, T> extends FxNodeOps<S, N> {
  default S visibleRowCount(int v) {
    node().setVisibleRowCount(v);
    return self();
  }

  default S visibleRowCount(ObservableValue<? extends Integer> v) {
    node().visibleRowCountProperty().bind(v);
    return self();
  }

  default S visibleRowCountBidi(Property<Number> v) {
    node().visibleRowCountProperty().bindBidirectional(v);
    return self();
  }

  default int visibleRowCount() {
    return node().getVisibleRowCount();
  }
}
