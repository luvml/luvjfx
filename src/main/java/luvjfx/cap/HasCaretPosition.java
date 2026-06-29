package luvjfx.cap;

import java.lang.Integer;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.text.Text;
import luvjfx.FxNodeOps;

public interface HasCaretPosition<S extends HasCaretPosition<S, N>, N extends Text> extends FxNodeOps<S, N> {
  default S caretPosition(int v) {
    node().setCaretPosition(v);
    return self();
  }

  default S caretPosition(ObservableValue<? extends Integer> v) {
    node().caretPositionProperty().bind(v);
    return self();
  }

  default S caretPositionBidi(Property<Number> v) {
    node().caretPositionProperty().bindBidirectional(v);
    return self();
  }

  default int caretPosition() {
    return node().getCaretPosition();
  }
}
