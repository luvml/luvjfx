package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Labeled;
import javafx.scene.paint.Paint;
import luvjfx.FxNodeOps;

public interface HasTextFill<S extends HasTextFill<S, N>, N extends Labeled> extends FxNodeOps<S, N> {
  default S textFill(Paint v) {
    node().setTextFill(v);
    return self();
  }

  default S textFill(ObservableValue<? extends Paint> v) {
    node().textFillProperty().bind(v);
    return self();
  }

  default S textFillBidi(Property<Paint> v) {
    node().textFillProperty().bindBidirectional(v);
    return self();
  }

  default Paint textFill() {
    return node().getTextFill();
  }
}
