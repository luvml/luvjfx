package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.image.ImageView;
import luvjfx.FxNodeOps;

public interface HasFitHeight<S extends HasFitHeight<S, N>, N extends ImageView> extends FxNodeOps<S, N> {
  default S fitHeight(double v) {
    node().setFitHeight(v);
    return self();
  }

  default S fitHeight(ObservableValue<? extends Double> v) {
    node().fitHeightProperty().bind(v);
    return self();
  }

  default S fitHeightBidi(Property<Number> v) {
    node().fitHeightProperty().bindBidirectional(v);
    return self();
  }

  default double fitHeight() {
    return node().getFitHeight();
  }
}
