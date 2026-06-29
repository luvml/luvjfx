package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextArea;
import luvjfx.FxNodeOps;

public interface HasScrollTop<S extends HasScrollTop<S, N>, N extends TextArea> extends FxNodeOps<S, N> {
  default S scrollTop(double v) {
    node().setScrollTop(v);
    return self();
  }

  default S scrollTop(ObservableValue<? extends Double> v) {
    node().scrollTopProperty().bind(v);
    return self();
  }

  default S scrollTopBidi(Property<Number> v) {
    node().scrollTopProperty().bindBidirectional(v);
    return self();
  }

  default double scrollTop() {
    return node().getScrollTop();
  }
}
