package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.HBox;
import luvjfx.FxNodeOps;

public interface HasSpacingHBox<S extends HasSpacingHBox<S, N>, N extends HBox> extends FxNodeOps<S, N> {
  default S spacing(double v) {
    node().setSpacing(v);
    return self();
  }

  default S spacing(ObservableValue<? extends Double> v) {
    node().spacingProperty().bind(v);
    return self();
  }

  default S spacingBidi(Property<Number> v) {
    node().spacingProperty().bindBidirectional(v);
    return self();
  }

  default double spacing() {
    return node().getSpacing();
  }
}
