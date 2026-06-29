package luvjfx.cap;

import java.lang.Integer;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Slider;
import luvjfx.FxNodeOps;

public interface HasMinorTickCount<S extends HasMinorTickCount<S, N>, N extends Slider> extends FxNodeOps<S, N> {
  default S minorTickCount(int v) {
    node().setMinorTickCount(v);
    return self();
  }

  default S minorTickCount(ObservableValue<? extends Integer> v) {
    node().minorTickCountProperty().bind(v);
    return self();
  }

  default S minorTickCountBidi(Property<Number> v) {
    node().minorTickCountProperty().bindBidirectional(v);
    return self();
  }

  default int minorTickCount() {
    return node().getMinorTickCount();
  }
}
