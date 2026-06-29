package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import luvjfx.FxNodeOps;

public interface HasSelectionFill<S extends HasSelectionFill<S, N>, N extends Text> extends FxNodeOps<S, N> {
  default S selectionFill(Paint v) {
    node().setSelectionFill(v);
    return self();
  }

  default S selectionFill(ObservableValue<? extends Paint> v) {
    node().selectionFillProperty().bind(v);
    return self();
  }

  default S selectionFillBidi(Property<Paint> v) {
    node().selectionFillProperty().bindBidirectional(v);
    return self();
  }

  default Paint selectionFill() {
    return node().getSelectionFill();
  }
}
