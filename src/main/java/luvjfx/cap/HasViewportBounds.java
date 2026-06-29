package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Bounds;
import javafx.scene.control.ScrollPane;
import luvjfx.FxNodeOps;

public interface HasViewportBounds<S extends HasViewportBounds<S, N>, N extends ScrollPane> extends FxNodeOps<S, N> {
  default S viewportBounds(Bounds v) {
    node().setViewportBounds(v);
    return self();
  }

  default S viewportBounds(ObservableValue<? extends Bounds> v) {
    node().viewportBoundsProperty().bind(v);
    return self();
  }

  default S viewportBoundsBidi(Property<Bounds> v) {
    node().viewportBoundsProperty().bindBidirectional(v);
    return self();
  }

  default Bounds viewportBounds() {
    return node().getViewportBounds();
  }
}
