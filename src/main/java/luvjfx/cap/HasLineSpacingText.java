package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.text.Text;
import luvjfx.FxNodeOps;

public interface HasLineSpacingText<S extends HasLineSpacingText<S, N>, N extends Text> extends FxNodeOps<S, N> {
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
