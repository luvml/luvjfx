package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.text.Text;
import luvjfx.FxNodeOps;

public interface HasCaretBias<S extends HasCaretBias<S, N>, N extends Text> extends FxNodeOps<S, N> {
  default S caretBias(boolean v) {
    node().setCaretBias(v);
    return self();
  }

  default S caretBias(ObservableValue<? extends Boolean> v) {
    node().caretBiasProperty().bind(v);
    return self();
  }

  default S caretBiasBidi(Property<Boolean> v) {
    node().caretBiasProperty().bindBidirectional(v);
    return self();
  }

  default boolean caretBias() {
    return node().isCaretBias();
  }
}
