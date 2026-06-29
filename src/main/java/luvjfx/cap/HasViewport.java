package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import luvjfx.FxNodeOps;

public interface HasViewport<S extends HasViewport<S, N>, N extends ImageView> extends FxNodeOps<S, N> {
  default S viewport(Rectangle2D v) {
    node().setViewport(v);
    return self();
  }

  default S viewport(ObservableValue<? extends Rectangle2D> v) {
    node().viewportProperty().bind(v);
    return self();
  }

  default S viewportBidi(Property<Rectangle2D> v) {
    node().viewportProperty().bindBidirectional(v);
    return self();
  }

  default Rectangle2D viewport() {
    return node().getViewport();
  }
}
