package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextArea;
import luvjfx.FxNodeOps;

public interface HasScrollLeft<S extends HasScrollLeft<S, N>, N extends TextArea> extends FxNodeOps<S, N> {
  default S scrollLeft(double v) {
    node().setScrollLeft(v);
    return self();
  }

  default S scrollLeft(ObservableValue<? extends Double> v) {
    node().scrollLeftProperty().bind(v);
    return self();
  }

  default S scrollLeftBidi(Property<Number> v) {
    node().scrollLeftProperty().bindBidirectional(v);
    return self();
  }

  default double scrollLeft() {
    return node().getScrollLeft();
  }
}
