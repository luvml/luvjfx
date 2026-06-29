package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.image.ImageView;
import luvjfx.FxNodeOps;

public interface HasFitWidth<S extends HasFitWidth<S, N>, N extends ImageView> extends FxNodeOps<S, N> {
  default S fitWidth(double v) {
    node().setFitWidth(v);
    return self();
  }

  default S fitWidth(ObservableValue<? extends Double> v) {
    node().fitWidthProperty().bind(v);
    return self();
  }

  default S fitWidthBidi(Property<Number> v) {
    node().fitWidthProperty().bindBidirectional(v);
    return self();
  }

  default double fitWidth() {
    return node().getFitWidth();
  }
}
