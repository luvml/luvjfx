package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Labeled;
import javafx.scene.text.Font;
import luvjfx.FxNodeOps;

public interface HasFontLabeled<S extends HasFontLabeled<S, N>, N extends Labeled> extends FxNodeOps<S, N> {
  default S font(Font v) {
    node().setFont(v);
    return self();
  }

  default S font(ObservableValue<? extends Font> v) {
    node().fontProperty().bind(v);
    return self();
  }

  default S fontBidi(Property<Font> v) {
    node().fontProperty().bindBidirectional(v);
    return self();
  }

  default Font font() {
    return node().getFont();
  }
}
