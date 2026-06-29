package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasViewOrder<S extends HasViewOrder<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S viewOrder(double v) {
    node().setViewOrder(v);
    return self();
  }

  default S viewOrder(ObservableValue<? extends Double> v) {
    node().viewOrderProperty().bind(v);
    return self();
  }

  default S viewOrderBidi(Property<Number> v) {
    node().viewOrderProperty().bindBidirectional(v);
    return self();
  }

  default double viewOrder() {
    return node().getViewOrder();
  }
}
