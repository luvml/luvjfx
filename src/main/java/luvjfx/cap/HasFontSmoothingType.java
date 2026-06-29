package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.text.FontSmoothingType;
import javafx.scene.text.Text;
import luvjfx.FxNodeOps;

public interface HasFontSmoothingType<S extends HasFontSmoothingType<S, N>, N extends Text> extends FxNodeOps<S, N> {
  default S fontSmoothingType(FontSmoothingType v) {
    node().setFontSmoothingType(v);
    return self();
  }

  default S fontSmoothingType(ObservableValue<? extends FontSmoothingType> v) {
    node().fontSmoothingTypeProperty().bind(v);
    return self();
  }

  default S fontSmoothingTypeBidi(Property<FontSmoothingType> v) {
    node().fontSmoothingTypeProperty().bindBidirectional(v);
    return self();
  }

  default FontSmoothingType fontSmoothingType() {
    return node().getFontSmoothingType();
  }
}
