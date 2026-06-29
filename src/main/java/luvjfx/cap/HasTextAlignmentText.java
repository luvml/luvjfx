package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import luvjfx.FxNodeOps;

public interface HasTextAlignmentText<S extends HasTextAlignmentText<S, N>, N extends Text> extends FxNodeOps<S, N> {
  default S textAlignment(TextAlignment v) {
    node().setTextAlignment(v);
    return self();
  }

  default S textAlignment(ObservableValue<? extends TextAlignment> v) {
    node().textAlignmentProperty().bind(v);
    return self();
  }

  default S textAlignmentBidi(Property<TextAlignment> v) {
    node().textAlignmentProperty().bindBidirectional(v);
    return self();
  }

  default TextAlignment textAlignment() {
    return node().getTextAlignment();
  }
}
