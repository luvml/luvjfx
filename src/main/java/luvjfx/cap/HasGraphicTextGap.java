package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Labeled;
import luvjfx.FxNodeOps;

public interface HasGraphicTextGap<S extends HasGraphicTextGap<S, N>, N extends Labeled> extends FxNodeOps<S, N> {
  default S graphicTextGap(double v) {
    node().setGraphicTextGap(v);
    return self();
  }

  default S graphicTextGap(ObservableValue<? extends Double> v) {
    node().graphicTextGapProperty().bind(v);
    return self();
  }

  default S graphicTextGapBidi(Property<Number> v) {
    node().graphicTextGapProperty().bindBidirectional(v);
    return self();
  }

  default double graphicTextGap() {
    return node().getGraphicTextGap();
  }
}
