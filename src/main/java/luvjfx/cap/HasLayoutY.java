package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasLayoutY<S extends HasLayoutY<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S layoutY(double v) {
    node().setLayoutY(v);
    return self();
  }

  default S layoutY(ObservableValue<? extends Double> v) {
    node().layoutYProperty().bind(v);
    return self();
  }

  default S layoutYBidi(Property<Number> v) {
    node().layoutYProperty().bindBidirectional(v);
    return self();
  }

  default double layoutY() {
    return node().getLayoutY();
  }
}
