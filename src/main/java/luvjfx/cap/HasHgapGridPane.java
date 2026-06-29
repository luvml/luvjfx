package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.GridPane;
import luvjfx.FxNodeOps;

public interface HasHgapGridPane<S extends HasHgapGridPane<S, N>, N extends GridPane> extends FxNodeOps<S, N> {
  default S hgap(double v) {
    node().setHgap(v);
    return self();
  }

  default S hgap(ObservableValue<? extends Double> v) {
    node().hgapProperty().bind(v);
    return self();
  }

  default S hgapBidi(Property<Number> v) {
    node().hgapProperty().bindBidirectional(v);
    return self();
  }

  default double hgap() {
    return node().getHgap();
  }
}
