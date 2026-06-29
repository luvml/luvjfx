package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.CheckBox;
import luvjfx.FxNodeOps;

public interface HasIndeterminate<S extends HasIndeterminate<S, N>, N extends CheckBox> extends FxNodeOps<S, N> {
  default S indeterminate(boolean v) {
    node().setIndeterminate(v);
    return self();
  }

  default S indeterminate(ObservableValue<? extends Boolean> v) {
    node().indeterminateProperty().bind(v);
    return self();
  }

  default S indeterminateBidi(Property<Boolean> v) {
    node().indeterminateProperty().bindBidirectional(v);
    return self();
  }

  default boolean indeterminate() {
    return node().isIndeterminate();
  }
}
