package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Slider;
import luvjfx.FxNodeOps;

public interface HasValueChanging<S extends HasValueChanging<S, N>, N extends Slider> extends FxNodeOps<S, N> {
  default S valueChanging(boolean v) {
    node().setValueChanging(v);
    return self();
  }

  default S valueChanging(ObservableValue<? extends Boolean> v) {
    node().valueChangingProperty().bind(v);
    return self();
  }

  default S valueChangingBidi(Property<Boolean> v) {
    node().valueChangingProperty().bindBidirectional(v);
    return self();
  }

  default boolean valueChanging() {
    return node().isValueChanging();
  }
}
