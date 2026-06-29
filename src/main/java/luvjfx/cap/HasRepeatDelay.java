package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Spinner;
import javafx.util.Duration;
import luvjfx.FxNodeOps;

public interface HasRepeatDelay<S extends HasRepeatDelay<S, N, T>, N extends Spinner<T>, T> extends FxNodeOps<S, N> {
  default S repeatDelay(Duration v) {
    node().setRepeatDelay(v);
    return self();
  }

  default S repeatDelay(ObservableValue<? extends Duration> v) {
    node().repeatDelayProperty().bind(v);
    return self();
  }

  default S repeatDelayBidi(Property<Duration> v) {
    node().repeatDelayProperty().bindBidirectional(v);
    return self();
  }

  default Duration repeatDelay() {
    return node().getRepeatDelay();
  }
}
