package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Region;
import luvjfx.FxNodeOps;

public interface HasPrefHeight<S extends HasPrefHeight<S, N>, N extends Region> extends FxNodeOps<S, N> {
  default S prefHeight(double v) {
    node().setPrefHeight(v);
    return self();
  }

  default S prefHeight(ObservableValue<? extends Double> v) {
    node().prefHeightProperty().bind(v);
    return self();
  }

  default S prefHeightBidi(Property<Number> v) {
    node().prefHeightProperty().bindBidirectional(v);
    return self();
  }

  default double prefHeight() {
    return node().getPrefHeight();
  }
}
