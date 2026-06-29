package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.layout.Region;
import luvjfx.FxNodeOps;

public interface HasPadding<S extends HasPadding<S, N>, N extends Region> extends FxNodeOps<S, N> {
  default S padding(Insets v) {
    node().setPadding(v);
    return self();
  }

  default S padding(double v) {
    node().setPadding(new Insets(v));
    return self();
  }

  default S padding(ObservableValue<? extends Insets> v) {
    node().paddingProperty().bind(v);
    return self();
  }

  default S paddingBidi(Property<Insets> v) {
    node().paddingProperty().bindBidirectional(v);
    return self();
  }

  default Insets padding() {
    return node().getPadding();
  }
}
