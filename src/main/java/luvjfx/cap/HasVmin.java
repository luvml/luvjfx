package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ScrollPane;
import luvjfx.FxNodeOps;

public interface HasVmin<S extends HasVmin<S, N>, N extends ScrollPane> extends FxNodeOps<S, N> {
  default S vmin(double v) {
    node().setVmin(v);
    return self();
  }

  default S vmin(ObservableValue<? extends Double> v) {
    node().vminProperty().bind(v);
    return self();
  }

  default S vminBidi(Property<Number> v) {
    node().vminProperty().bindBidirectional(v);
    return self();
  }

  default double vmin() {
    return node().getVmin();
  }
}
