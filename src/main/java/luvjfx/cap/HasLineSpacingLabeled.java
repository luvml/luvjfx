package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Labeled;
import luvjfx.FxNodeOps;

public interface HasLineSpacingLabeled<S extends HasLineSpacingLabeled<S, N>, N extends Labeled> extends FxNodeOps<S, N> {
  default S lineSpacing(double v) {
    node().setLineSpacing(v);
    return self();
  }

  default S lineSpacing(ObservableValue<? extends Double> v) {
    node().lineSpacingProperty().bind(v);
    return self();
  }

  default S lineSpacingBidi(Property<Number> v) {
    node().lineSpacingProperty().bindBidirectional(v);
    return self();
  }

  default double lineSpacing() {
    return node().getLineSpacing();
  }
}
