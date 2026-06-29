package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import luvjfx.FxNodeOps;

public interface HasToggleGroup<S extends HasToggleGroup<S, N>, N extends ToggleButton> extends FxNodeOps<S, N> {
  default S toggleGroup(ToggleGroup v) {
    node().setToggleGroup(v);
    return self();
  }

  default S toggleGroup(ObservableValue<? extends ToggleGroup> v) {
    node().toggleGroupProperty().bind(v);
    return self();
  }

  default S toggleGroupBidi(Property<ToggleGroup> v) {
    node().toggleGroupProperty().bindBidirectional(v);
    return self();
  }

  default ToggleGroup toggleGroup() {
    return node().getToggleGroup();
  }
}
