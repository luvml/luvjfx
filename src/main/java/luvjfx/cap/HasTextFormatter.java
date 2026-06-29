package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.TextInputControl;
import luvjfx.FxNodeOps;

public interface HasTextFormatter<S extends HasTextFormatter<S, N>, N extends TextInputControl> extends FxNodeOps<S, N> {
  default S textFormatter(TextFormatter<?> v) {
    node().setTextFormatter(v);
    return self();
  }

  default S textFormatter(ObservableValue<? extends TextFormatter<?>> v) {
    node().textFormatterProperty().bind(v);
    return self();
  }

  default S textFormatterBidi(Property<TextFormatter<?>> v) {
    node().textFormatterProperty().bindBidirectional(v);
    return self();
  }

  default TextFormatter<?> textFormatter() {
    return node().getTextFormatter();
  }
}
