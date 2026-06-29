package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.image.ImageView;
import luvjfx.FxNodeOps;

public interface HasYImageView<S extends HasYImageView<S, N>, N extends ImageView> extends FxNodeOps<S, N> {
  default S y(double v) {
    node().setY(v);
    return self();
  }

  default S y(ObservableValue<? extends Double> v) {
    node().yProperty().bind(v);
    return self();
  }

  default S yBidi(Property<Number> v) {
    node().yProperty().bindBidirectional(v);
    return self();
  }

  default double y() {
    return node().getY();
  }
}
