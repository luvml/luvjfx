package luvjfx.cap;

import java.lang.Integer;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextArea;
import luvjfx.FxNodeOps;

public interface HasPrefRowCount<S extends HasPrefRowCount<S, N>, N extends TextArea> extends FxNodeOps<S, N> {
  default S prefRowCount(int v) {
    node().setPrefRowCount(v);
    return self();
  }

  default S prefRowCount(ObservableValue<? extends Integer> v) {
    node().prefRowCountProperty().bind(v);
    return self();
  }

  default S prefRowCountBidi(Property<Number> v) {
    node().prefRowCountProperty().bindBidirectional(v);
    return self();
  }

  default int prefRowCount() {
    return node().getPrefRowCount();
  }
}
