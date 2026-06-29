package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Side;
import javafx.scene.control.TabPane;
import luvjfx.FxNodeOps;

public interface HasSide<S extends HasSide<S, N>, N extends TabPane> extends FxNodeOps<S, N> {
  default S side(Side v) {
    node().setSide(v);
    return self();
  }

  default S side(ObservableValue<? extends Side> v) {
    node().sideProperty().bind(v);
    return self();
  }

  default S sideBidi(Property<Side> v) {
    node().sideProperty().bindBidirectional(v);
    return self();
  }

  default Side side() {
    return node().getSide();
  }
}
