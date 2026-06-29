package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.layout.Region;
import luvjfx.FxNodeOps;

public interface HasOpaqueInsets<S extends HasOpaqueInsets<S, N>, N extends Region> extends FxNodeOps<S, N> {
  default S opaqueInsets(Insets v) {
    node().setOpaqueInsets(v);
    return self();
  }

  default S opaqueInsets(double v) {
    node().setOpaqueInsets(new Insets(v));
    return self();
  }

  default S opaqueInsets(ObservableValue<? extends Insets> v) {
    node().opaqueInsetsProperty().bind(v);
    return self();
  }

  default S opaqueInsetsBidi(Property<Insets> v) {
    node().opaqueInsetsProperty().bindBidirectional(v);
    return self();
  }

  default Insets opaqueInsets() {
    return node().getOpaqueInsets();
  }
}
