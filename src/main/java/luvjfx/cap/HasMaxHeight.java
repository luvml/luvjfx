package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Region;
import luvjfx.FxNodeOps;

public interface HasMaxHeight<S extends HasMaxHeight<S, N>, N extends Region> extends FxNodeOps<S, N> {
  default S maxHeight(double v) {
    node().setMaxHeight(v);
    return self();
  }

  default S maxHeight(ObservableValue<? extends Double> v) {
    node().maxHeightProperty().bind(v);
    return self();
  }

  default S maxHeightBidi(Property<Number> v) {
    node().maxHeightProperty().bindBidirectional(v);
    return self();
  }

  default double maxHeight() {
    return node().getMaxHeight();
  }
}
