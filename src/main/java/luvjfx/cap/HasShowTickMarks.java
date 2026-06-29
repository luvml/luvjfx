package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Slider;
import luvjfx.FxNodeOps;

public interface HasShowTickMarks<S extends HasShowTickMarks<S, N>, N extends Slider> extends FxNodeOps<S, N> {
  default S showTickMarks(boolean v) {
    node().setShowTickMarks(v);
    return self();
  }

  default S showTickMarks(ObservableValue<? extends Boolean> v) {
    node().showTickMarksProperty().bind(v);
    return self();
  }

  default S showTickMarksBidi(Property<Boolean> v) {
    node().showTickMarksProperty().bindBidirectional(v);
    return self();
  }

  default boolean showTickMarks() {
    return node().isShowTickMarks();
  }
}
