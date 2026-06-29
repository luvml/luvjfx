package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.image.ImageView;
import luvjfx.FxNodeOps;

public interface HasPreserveRatio<S extends HasPreserveRatio<S, N>, N extends ImageView> extends FxNodeOps<S, N> {
  default S preserveRatio(boolean v) {
    node().setPreserveRatio(v);
    return self();
  }

  default S preserveRatio(ObservableValue<? extends Boolean> v) {
    node().preserveRatioProperty().bind(v);
    return self();
  }

  default S preserveRatioBidi(Property<Boolean> v) {
    node().preserveRatioProperty().bindBidirectional(v);
    return self();
  }

  default boolean preserveRatio() {
    return node().isPreserveRatio();
  }
}
