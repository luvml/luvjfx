package luvjfx.cap;

import java.lang.String;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ComboBoxBase;
import luvjfx.FxNodeOps;

public interface HasPromptTextComboBoxBase<S extends HasPromptTextComboBoxBase<S, N, T>, N extends ComboBoxBase<T>, T> extends FxNodeOps<S, N> {
  default S promptText(String v) {
    node().setPromptText(v);
    return self();
  }

  default S promptText(ObservableValue<? extends String> v) {
    node().promptTextProperty().bind(v);
    return self();
  }

  default S promptTextBidi(Property<String> v) {
    node().promptTextProperty().bindBidirectional(v);
    return self();
  }

  default String promptText() {
    return node().getPromptText();
  }
}
