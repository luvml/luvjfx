package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TabPane;
import luvjfx.FxNodeOps;

public interface HasTabMaxHeight<S extends HasTabMaxHeight<S, N>, N extends TabPane> extends FxNodeOps<S, N> {
  default S tabMaxHeight(double v) {
    node().setTabMaxHeight(v);
    return self();
  }

  default S tabMaxHeight(ObservableValue<? extends Double> v) {
    node().tabMaxHeightProperty().bind(v);
    return self();
  }

  default S tabMaxHeightBidi(Property<Number> v) {
    node().tabMaxHeightProperty().bindBidirectional(v);
    return self();
  }

  default double tabMaxHeight() {
    return node().getTabMaxHeight();
  }
}
