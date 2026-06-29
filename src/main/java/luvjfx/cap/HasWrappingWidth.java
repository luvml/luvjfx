package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.text.Text;
import luvjfx.FxNodeOps;

public interface HasWrappingWidth<S extends HasWrappingWidth<S, N>, N extends Text> extends FxNodeOps<S, N> {
  default S wrappingWidth(double v) {
    node().setWrappingWidth(v);
    return self();
  }

  default S wrappingWidth(ObservableValue<? extends Double> v) {
    node().wrappingWidthProperty().bind(v);
    return self();
  }

  default S wrappingWidthBidi(Property<Number> v) {
    node().wrappingWidthProperty().bindBidirectional(v);
    return self();
  }

  default double wrappingWidth() {
    return node().getWrappingWidth();
  }
}
