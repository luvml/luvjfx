package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import luvjfx.FxNodeOps;

public interface HasCancelButton<S extends HasCancelButton<S, N>, N extends Button> extends FxNodeOps<S, N> {
  default S cancelButton(boolean v) {
    node().setCancelButton(v);
    return self();
  }

  default S cancelButton(ObservableValue<? extends Boolean> v) {
    node().cancelButtonProperty().bind(v);
    return self();
  }

  default S cancelButtonBidi(Property<Boolean> v) {
    node().cancelButtonProperty().bindBidirectional(v);
    return self();
  }

  default boolean cancelButton() {
    return node().isCancelButton();
  }
}
