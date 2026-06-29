package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Region;
import luvjfx.FxNodeOps;

public interface HasMinWidth<S extends HasMinWidth<S, N>, N extends Region> extends FxNodeOps<S, N> {
  default S minWidth(double v) {
    node().setMinWidth(v);
    return self();
  }

  default S minWidth(ObservableValue<? extends Double> v) {
    node().minWidthProperty().bind(v);
    return self();
  }

  default S minWidthBidi(Property<Number> v) {
    node().minWidthProperty().bindBidirectional(v);
    return self();
  }

  default double minWidth() {
    return node().getMinWidth();
  }
}
