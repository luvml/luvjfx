package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Labeled;
import luvjfx.FxNodeOps;

public interface HasWrapTextLabeled<S extends HasWrapTextLabeled<S, N>, N extends Labeled> extends FxNodeOps<S, N> {
  default S wrapText(boolean v) {
    node().setWrapText(v);
    return self();
  }

  default S wrapText(ObservableValue<? extends Boolean> v) {
    node().wrapTextProperty().bind(v);
    return self();
  }

  default S wrapTextBidi(Property<Boolean> v) {
    node().wrapTextProperty().bindBidirectional(v);
    return self();
  }

  default boolean wrapText() {
    return node().isWrapText();
  }
}
