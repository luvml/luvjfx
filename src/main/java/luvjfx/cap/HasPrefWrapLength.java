package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.FlowPane;
import luvjfx.FxNodeOps;

public interface HasPrefWrapLength<S extends HasPrefWrapLength<S, N>, N extends FlowPane> extends FxNodeOps<S, N> {
  default S prefWrapLength(double v) {
    node().setPrefWrapLength(v);
    return self();
  }

  default S prefWrapLength(ObservableValue<? extends Double> v) {
    node().prefWrapLengthProperty().bind(v);
    return self();
  }

  default S prefWrapLengthBidi(Property<Number> v) {
    node().prefWrapLengthProperty().bindBidirectional(v);
    return self();
  }

  default double prefWrapLength() {
    return node().getPrefWrapLength();
  }
}
