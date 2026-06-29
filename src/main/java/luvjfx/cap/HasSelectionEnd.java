package luvjfx.cap;

import java.lang.Integer;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.text.Text;
import luvjfx.FxNodeOps;

public interface HasSelectionEnd<S extends HasSelectionEnd<S, N>, N extends Text> extends FxNodeOps<S, N> {
  default S selectionEnd(int v) {
    node().setSelectionEnd(v);
    return self();
  }

  default S selectionEnd(ObservableValue<? extends Integer> v) {
    node().selectionEndProperty().bind(v);
    return self();
  }

  default S selectionEndBidi(Property<Number> v) {
    node().selectionEndProperty().bindBidirectional(v);
    return self();
  }

  default int selectionEnd() {
    return node().getSelectionEnd();
  }
}
