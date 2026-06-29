package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import luvjfx.FxNodeOps;

public interface HasValueFactory<S extends HasValueFactory<S, N, T>, N extends Spinner<T>, T> extends FxNodeOps<S, N> {
  default S valueFactory(SpinnerValueFactory<T> v) {
    node().setValueFactory(v);
    return self();
  }

  default S valueFactory(ObservableValue<? extends SpinnerValueFactory<T>> v) {
    node().valueFactoryProperty().bind(v);
    return self();
  }

  default S valueFactoryBidi(Property<SpinnerValueFactory<T>> v) {
    node().valueFactoryProperty().bindBidirectional(v);
    return self();
  }

  default SpinnerValueFactory<T> valueFactory() {
    return node().getValueFactory();
  }
}
