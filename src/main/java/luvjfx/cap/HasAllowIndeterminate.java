package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.CheckBox;
import luvjfx.FxNodeOps;

public interface HasAllowIndeterminate<S extends HasAllowIndeterminate<S, N>, N extends CheckBox> extends FxNodeOps<S, N> {
  default S allowIndeterminate(boolean v) {
    node().setAllowIndeterminate(v);
    return self();
  }

  default S allowIndeterminate(ObservableValue<? extends Boolean> v) {
    node().allowIndeterminateProperty().bind(v);
    return self();
  }

  default S allowIndeterminateBidi(Property<Boolean> v) {
    node().allowIndeterminateProperty().bindBidirectional(v);
    return self();
  }

  default boolean allowIndeterminate() {
    return node().isAllowIndeterminate();
  }
}
