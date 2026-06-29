package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ScrollBar;
import luvjfx.FxNodeOps;

public interface HasVisibleAmount<S extends HasVisibleAmount<S, N>, N extends ScrollBar> extends FxNodeOps<S, N> {
  default S visibleAmount(double v) {
    node().setVisibleAmount(v);
    return self();
  }

  default S visibleAmount(ObservableValue<? extends Double> v) {
    node().visibleAmountProperty().bind(v);
    return self();
  }

  default S visibleAmountBidi(Property<Number> v) {
    node().visibleAmountProperty().bindBidirectional(v);
    return self();
  }

  default double visibleAmount() {
    return node().getVisibleAmount();
  }
}
