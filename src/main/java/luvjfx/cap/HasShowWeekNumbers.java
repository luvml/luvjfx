package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.DatePicker;
import luvjfx.FxNodeOps;

public interface HasShowWeekNumbers<S extends HasShowWeekNumbers<S, N>, N extends DatePicker> extends FxNodeOps<S, N> {
  default S showWeekNumbers(boolean v) {
    node().setShowWeekNumbers(v);
    return self();
  }

  default S showWeekNumbers(ObservableValue<? extends Boolean> v) {
    node().showWeekNumbersProperty().bind(v);
    return self();
  }

  default S showWeekNumbersBidi(Property<Boolean> v) {
    node().showWeekNumbersProperty().bindBidirectional(v);
    return self();
  }

  default boolean showWeekNumbers() {
    return node().isShowWeekNumbers();
  }
}
