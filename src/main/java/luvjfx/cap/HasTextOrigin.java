package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.VPos;
import javafx.scene.text.Text;
import luvjfx.FxNodeOps;

public interface HasTextOrigin<S extends HasTextOrigin<S, N>, N extends Text> extends FxNodeOps<S, N> {
  default S textOrigin(VPos v) {
    node().setTextOrigin(v);
    return self();
  }

  default S textOrigin(ObservableValue<? extends VPos> v) {
    node().textOriginProperty().bind(v);
    return self();
  }

  default S textOriginBidi(Property<VPos> v) {
    node().textOriginProperty().bindBidirectional(v);
    return self();
  }

  default VPos textOrigin() {
    return node().getTextOrigin();
  }
}
