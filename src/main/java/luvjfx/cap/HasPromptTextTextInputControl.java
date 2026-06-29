package luvjfx.cap;

import java.lang.String;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextInputControl;
import luvjfx.FxNodeOps;

public interface HasPromptTextTextInputControl<S extends HasPromptTextTextInputControl<S, N>, N extends TextInputControl> extends FxNodeOps<S, N> {
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
