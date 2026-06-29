package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ScrollPane;
import luvjfx.FxNodeOps;

public interface HasHmin<S extends HasHmin<S, N>, N extends ScrollPane> extends FxNodeOps<S, N> {
  default S hmin(double v) {
    node().setHmin(v);
    return self();
  }

  default S hmin(ObservableValue<? extends Double> v) {
    node().hminProperty().bind(v);
    return self();
  }

  default S hminBidi(Property<Number> v) {
    node().hminProperty().bindBidirectional(v);
    return self();
  }

  default double hmin() {
    return node().getHmin();
  }
}
