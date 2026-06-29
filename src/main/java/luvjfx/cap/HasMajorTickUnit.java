package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Slider;
import luvjfx.FxNodeOps;

public interface HasMajorTickUnit<S extends HasMajorTickUnit<S, N>, N extends Slider> extends FxNodeOps<S, N> {
  default S majorTickUnit(double v) {
    node().setMajorTickUnit(v);
    return self();
  }

  default S majorTickUnit(ObservableValue<? extends Double> v) {
    node().majorTickUnitProperty().bind(v);
    return self();
  }

  default S majorTickUnitBidi(Property<Number> v) {
    node().majorTickUnitProperty().bindBidirectional(v);
    return self();
  }

  default double majorTickUnit() {
    return node().getMajorTickUnit();
  }
}
