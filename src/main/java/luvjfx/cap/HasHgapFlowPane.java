package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.FlowPane;
import luvjfx.FxNodeOps;

public interface HasHgapFlowPane<S extends HasHgapFlowPane<S, N>, N extends FlowPane> extends FxNodeOps<S, N> {
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
