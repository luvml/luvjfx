package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ChoiceBox;
import luvjfx.FxNodeOps;

public interface HasValueChoiceBox<S extends HasValueChoiceBox<S, N, T>, N extends ChoiceBox<T>, T> extends FxNodeOps<S, N> {
  default S value(T v) {
    node().setValue(v);
    return self();
  }

  default S value(ObservableValue<? extends T> v) {
    node().valueProperty().bind(v);
    return self();
  }

  default S valueBidi(Property<T> v) {
    node().valueProperty().bindBidirectional(v);
    return self();
  }

  default T value() {
    return node().getValue();
  }
}
