package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Region;
import luvjfx.FxNodeOps;

public interface HasPrefWidth<S extends HasPrefWidth<S, N>, N extends Region> extends FxNodeOps<S, N> {
  default S prefWidth(double v) {
    node().setPrefWidth(v);
    return self();
  }

  default S prefWidth(ObservableValue<? extends Double> v) {
    node().prefWidthProperty().bind(v);
    return self();
  }

  default S prefWidthBidi(Property<Number> v) {
    node().prefWidthProperty().bindBidirectional(v);
    return self();
  }

  default double prefWidth() {
    return node().getPrefWidth();
  }
}
