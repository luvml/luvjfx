package luvjfx.cap;

import java.lang.Integer;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;
import luvjfx.FxNodeOps;

public interface HasPrefColumnCountTextField<S extends HasPrefColumnCountTextField<S, N>, N extends TextField> extends FxNodeOps<S, N> {
  default S prefColumnCount(int v) {
    node().setPrefColumnCount(v);
    return self();
  }

  default S prefColumnCount(ObservableValue<? extends Integer> v) {
    node().prefColumnCountProperty().bind(v);
    return self();
  }

  default S prefColumnCountBidi(Property<Number> v) {
    node().prefColumnCountProperty().bindBidirectional(v);
    return self();
  }

  default int prefColumnCount() {
    return node().getPrefColumnCount();
  }
}
