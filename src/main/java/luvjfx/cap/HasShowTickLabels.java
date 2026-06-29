package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Slider;
import luvjfx.FxNodeOps;

public interface HasShowTickLabels<S extends HasShowTickLabels<S, N>, N extends Slider> extends FxNodeOps<S, N> {
  default S showTickLabels(boolean v) {
    node().setShowTickLabels(v);
    return self();
  }

  default S showTickLabels(ObservableValue<? extends Boolean> v) {
    node().showTickLabelsProperty().bind(v);
    return self();
  }

  default S showTickLabelsBidi(Property<Boolean> v) {
    node().showTickLabelsProperty().bindBidirectional(v);
    return self();
  }

  default boolean showTickLabels() {
    return node().isShowTickLabels();
  }
}
