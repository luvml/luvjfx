package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ScrollPane;
import luvjfx.FxNodeOps;

public interface HasVmax<S extends HasVmax<S, N>, N extends ScrollPane> extends FxNodeOps<S, N> {
  default S vmax(double v) {
    node().setVmax(v);
    return self();
  }

  default S vmax(ObservableValue<? extends Double> v) {
    node().vmaxProperty().bind(v);
    return self();
  }

  default S vmaxBidi(Property<Number> v) {
    node().vmaxProperty().bindBidirectional(v);
    return self();
  }

  default double vmax() {
    return node().getVmax();
  }
}
