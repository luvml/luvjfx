package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Border;
import javafx.scene.layout.Region;
import luvjfx.FxNodeOps;

public interface HasBorder<S extends HasBorder<S, N>, N extends Region> extends FxNodeOps<S, N> {
  default S border(Border v) {
    node().setBorder(v);
    return self();
  }

  default S border(ObservableValue<? extends Border> v) {
    node().borderProperty().bind(v);
    return self();
  }

  default S borderBidi(Property<Border> v) {
    node().borderProperty().bindBidirectional(v);
    return self();
  }

  default Border border() {
    return node().getBorder();
  }
}
