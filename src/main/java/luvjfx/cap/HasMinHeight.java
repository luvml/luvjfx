package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Region;
import luvjfx.FxNodeOps;

public interface HasMinHeight<S extends HasMinHeight<S, N>, N extends Region> extends FxNodeOps<S, N> {
  default S minHeight(double v) {
    node().setMinHeight(v);
    return self();
  }

  default S minHeight(ObservableValue<? extends Double> v) {
    node().minHeightProperty().bind(v);
    return self();
  }

  default S minHeightBidi(Property<Number> v) {
    node().minHeightProperty().bindBidirectional(v);
    return self();
  }

  default double minHeight() {
    return node().getMinHeight();
  }
}
