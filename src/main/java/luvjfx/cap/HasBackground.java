package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Background;
import javafx.scene.layout.Region;
import luvjfx.FxNodeOps;

public interface HasBackground<S extends HasBackground<S, N>, N extends Region> extends FxNodeOps<S, N> {
  default S background(Background v) {
    node().setBackground(v);
    return self();
  }

  default S background(ObservableValue<? extends Background> v) {
    node().backgroundProperty().bind(v);
    return self();
  }

  default S backgroundBidi(Property<Background> v) {
    node().backgroundProperty().bindBidirectional(v);
    return self();
  }

  default Background background() {
    return node().getBackground();
  }
}
