package luvjfx.cap;

import java.lang.Integer;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.text.Text;
import luvjfx.FxNodeOps;

public interface HasSelectionStart<S extends HasSelectionStart<S, N>, N extends Text> extends FxNodeOps<S, N> {
  default S selectionStart(int v) {
    node().setSelectionStart(v);
    return self();
  }

  default S selectionStart(ObservableValue<? extends Integer> v) {
    node().selectionStartProperty().bind(v);
    return self();
  }

  default S selectionStartBidi(Property<Number> v) {
    node().selectionStartProperty().bindBidirectional(v);
    return self();
  }

  default int selectionStart() {
    return node().getSelectionStart();
  }
}
