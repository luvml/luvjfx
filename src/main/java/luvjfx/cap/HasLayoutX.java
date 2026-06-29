package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasLayoutX<S extends HasLayoutX<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S layoutX(double v) {
    node().setLayoutX(v);
    return self();
  }

  default S layoutX(ObservableValue<? extends Double> v) {
    node().layoutXProperty().bind(v);
    return self();
  }

  default S layoutXBidi(Property<Number> v) {
    node().layoutXProperty().bindBidirectional(v);
    return self();
  }

  default double layoutX() {
    return node().getLayoutX();
  }
}
