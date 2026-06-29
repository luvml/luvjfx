package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Spinner;
import javafx.util.Duration;
import luvjfx.FxNodeOps;

public interface HasInitialDelay<S extends HasInitialDelay<S, N, T>, N extends Spinner<T>, T> extends FxNodeOps<S, N> {
  default S initialDelay(Duration v) {
    node().setInitialDelay(v);
    return self();
  }

  default S initialDelay(ObservableValue<? extends Duration> v) {
    node().initialDelayProperty().bind(v);
    return self();
  }

  default S initialDelayBidi(Property<Duration> v) {
    node().initialDelayProperty().bindBidirectional(v);
    return self();
  }

  default Duration initialDelay() {
    return node().getInitialDelay();
  }
}
