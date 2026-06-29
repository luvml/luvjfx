package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ScrollPane;
import luvjfx.FxNodeOps;

public interface HasHmax<S extends HasHmax<S, N>, N extends ScrollPane> extends FxNodeOps<S, N> {
  default S hmax(double v) {
    node().setHmax(v);
    return self();
  }

  default S hmax(ObservableValue<? extends Double> v) {
    node().hmaxProperty().bind(v);
    return self();
  }

  default S hmaxBidi(Property<Number> v) {
    node().hmaxProperty().bindBidirectional(v);
    return self();
  }

  default double hmax() {
    return node().getHmax();
  }
}
