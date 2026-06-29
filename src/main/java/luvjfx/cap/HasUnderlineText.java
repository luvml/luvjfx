package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.text.Text;
import luvjfx.FxNodeOps;

public interface HasUnderlineText<S extends HasUnderlineText<S, N>, N extends Text> extends FxNodeOps<S, N> {
  default S underline(boolean v) {
    node().setUnderline(v);
    return self();
  }

  default S underline(ObservableValue<? extends Boolean> v) {
    node().underlineProperty().bind(v);
    return self();
  }

  default S underlineBidi(Property<Boolean> v) {
    node().underlineProperty().bindBidirectional(v);
    return self();
  }

  default boolean underline() {
    return node().isUnderline();
  }
}
