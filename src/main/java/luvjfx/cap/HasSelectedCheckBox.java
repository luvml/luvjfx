package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.CheckBox;
import luvjfx.FxNodeOps;

public interface HasSelectedCheckBox<S extends HasSelectedCheckBox<S, N>, N extends CheckBox> extends FxNodeOps<S, N> {
  default S selected(boolean v) {
    node().setSelected(v);
    return self();
  }

  default S selected(ObservableValue<? extends Boolean> v) {
    node().selectedProperty().bind(v);
    return self();
  }

  default S selectedBidi(Property<Boolean> v) {
    node().selectedProperty().bindBidirectional(v);
    return self();
  }

  default boolean selected() {
    return node().isSelected();
  }
}
