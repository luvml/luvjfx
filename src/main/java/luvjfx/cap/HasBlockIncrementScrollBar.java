package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ScrollBar;
import luvjfx.FxNodeOps;

public interface HasBlockIncrementScrollBar<S extends HasBlockIncrementScrollBar<S, N>, N extends ScrollBar> extends FxNodeOps<S, N> {
  default S blockIncrement(double v) {
    node().setBlockIncrement(v);
    return self();
  }

  default S blockIncrement(ObservableValue<? extends Double> v) {
    node().blockIncrementProperty().bind(v);
    return self();
  }

  default S blockIncrementBidi(Property<Number> v) {
    node().blockIncrementProperty().bindBidirectional(v);
    return self();
  }

  default double blockIncrement() {
    return node().getBlockIncrement();
  }
}
