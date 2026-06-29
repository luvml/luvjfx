package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Control;
import javafx.scene.control.Tooltip;
import luvjfx.FxNodeOps;

public interface HasTooltip<S extends HasTooltip<S, N>, N extends Control> extends FxNodeOps<S, N> {
  default S tooltip(Tooltip v) {
    node().setTooltip(v);
    return self();
  }

  default S tooltip(ObservableValue<? extends Tooltip> v) {
    node().tooltipProperty().bind(v);
    return self();
  }

  default S tooltipBidi(Property<Tooltip> v) {
    node().tooltipProperty().bindBidirectional(v);
    return self();
  }

  default Tooltip tooltip() {
    return node().getTooltip();
  }
}
