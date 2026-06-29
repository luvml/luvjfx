package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.text.Text;
import javafx.scene.text.TextBoundsType;
import luvjfx.FxNodeOps;

public interface HasBoundsType<S extends HasBoundsType<S, N>, N extends Text> extends FxNodeOps<S, N> {
  default S boundsType(TextBoundsType v) {
    node().setBoundsType(v);
    return self();
  }

  default S boundsType(ObservableValue<? extends TextBoundsType> v) {
    node().boundsTypeProperty().bind(v);
    return self();
  }

  default S boundsTypeBidi(Property<TextBoundsType> v) {
    node().boundsTypeProperty().bindBidirectional(v);
    return self();
  }

  default TextBoundsType boundsType() {
    return node().getBoundsType();
  }
}
