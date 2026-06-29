package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import luvjfx.FxNodeOps;

public interface HasFontText<S extends HasFontText<S, N>, N extends Text> extends FxNodeOps<S, N> {
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
