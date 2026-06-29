package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import luvjfx.FxNodeOps;

public interface HasDefaultButton<S extends HasDefaultButton<S, N>, N extends Button> extends FxNodeOps<S, N> {
  default S defaultButton(boolean v) {
    node().setDefaultButton(v);
    return self();
  }

  default S defaultButton(ObservableValue<? extends Boolean> v) {
    node().defaultButtonProperty().bind(v);
    return self();
  }

  default S defaultButtonBidi(Property<Boolean> v) {
    node().defaultButtonProperty().bindBidirectional(v);
    return self();
  }

  default boolean defaultButton() {
    return node().isDefaultButton();
  }
}
