package luvjfx.cap;

import java.lang.Double;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Slider;
import javafx.util.StringConverter;
import luvjfx.FxNodeOps;

public interface HasLabelFormatter<S extends HasLabelFormatter<S, N>, N extends Slider> extends FxNodeOps<S, N> {
  default S labelFormatter(StringConverter<Double> v) {
    node().setLabelFormatter(v);
    return self();
  }

  default S labelFormatter(ObservableValue<? extends StringConverter<Double>> v) {
    node().labelFormatterProperty().bind(v);
    return self();
  }

  default S labelFormatterBidi(Property<StringConverter<Double>> v) {
    node().labelFormatterProperty().bindBidirectional(v);
    return self();
  }

  default StringConverter<Double> labelFormatter() {
    return node().getLabelFormatter();
  }
}
