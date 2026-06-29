package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Region;
import luvjfx.FxNodeOps;

public interface HasMaxWidth<S extends HasMaxWidth<S, N>, N extends Region> extends FxNodeOps<S, N> {
  default S maxWidth(double v) {
    node().setMaxWidth(v);
    return self();
  }

  default S maxWidth(ObservableValue<? extends Double> v) {
    node().maxWidthProperty().bind(v);
    return self();
  }

  default S maxWidthBidi(Property<Number> v) {
    node().maxWidthProperty().bindBidirectional(v);
    return self();
  }

  default double maxWidth() {
    return node().getMaxWidth();
  }
}
