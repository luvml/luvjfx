package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.text.Text;
import luvjfx.FxNodeOps;

public interface HasStrikethrough<S extends HasStrikethrough<S, N>, N extends Text> extends FxNodeOps<S, N> {
  default S strikethrough(boolean v) {
    node().setStrikethrough(v);
    return self();
  }

  default S strikethrough(ObservableValue<? extends Boolean> v) {
    node().strikethroughProperty().bind(v);
    return self();
  }

  default S strikethroughBidi(Property<Boolean> v) {
    node().strikethroughProperty().bindBidirectional(v);
    return self();
  }

  default boolean strikethrough() {
    return node().isStrikethrough();
  }
}
