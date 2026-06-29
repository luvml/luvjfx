package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ProgressIndicator;
import luvjfx.FxNodeOps;

public interface HasProgress<S extends HasProgress<S, N>, N extends ProgressIndicator> extends FxNodeOps<S, N> {
  default S progress(double v) {
    node().setProgress(v);
    return self();
  }

  default S progress(ObservableValue<? extends Double> v) {
    node().progressProperty().bind(v);
    return self();
  }

  default S progressBidi(Property<Number> v) {
    node().progressProperty().bindBidirectional(v);
    return self();
  }

  default double progress() {
    return node().getProgress();
  }
}
