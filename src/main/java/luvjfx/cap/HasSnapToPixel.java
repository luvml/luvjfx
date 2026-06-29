package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Region;
import luvjfx.FxNodeOps;

public interface HasSnapToPixel<S extends HasSnapToPixel<S, N>, N extends Region> extends FxNodeOps<S, N> {
  default S snapToPixel(boolean v) {
    node().setSnapToPixel(v);
    return self();
  }

  default S snapToPixel(ObservableValue<? extends Boolean> v) {
    node().snapToPixelProperty().bind(v);
    return self();
  }

  default S snapToPixelBidi(Property<Boolean> v) {
    node().snapToPixelProperty().bindBidirectional(v);
    return self();
  }

  default boolean snapToPixel() {
    return node().isSnapToPixel();
  }
}
