package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ScrollBar;
import luvjfx.FxNodeOps;

public interface HasMaxScrollBar<S extends HasMaxScrollBar<S, N>, N extends ScrollBar> extends FxNodeOps<S, N> {
  default S max(double v) {
    node().setMax(v);
    return self();
  }

  default S max(ObservableValue<? extends Double> v) {
    node().maxProperty().bind(v);
    return self();
  }

  default S maxBidi(Property<Number> v) {
    node().maxProperty().bindBidirectional(v);
    return self();
  }

  default double max() {
    return node().getMax();
  }
}
