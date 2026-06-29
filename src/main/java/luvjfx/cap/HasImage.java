package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import luvjfx.FxNodeOps;

public interface HasImage<S extends HasImage<S, N>, N extends ImageView> extends FxNodeOps<S, N> {
  default S image(Image v) {
    node().setImage(v);
    return self();
  }

  default S image(ObservableValue<? extends Image> v) {
    node().imageProperty().bind(v);
    return self();
  }

  default S imageBidi(Property<Image> v) {
    node().imageProperty().bindBidirectional(v);
    return self();
  }

  default Image image() {
    return node().getImage();
  }
}
