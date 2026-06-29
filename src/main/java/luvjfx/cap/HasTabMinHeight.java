package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TabPane;
import luvjfx.FxNodeOps;

public interface HasTabMinHeight<S extends HasTabMinHeight<S, N>, N extends TabPane> extends FxNodeOps<S, N> {
  default S tabMinHeight(double v) {
    node().setTabMinHeight(v);
    return self();
  }

  default S tabMinHeight(ObservableValue<? extends Double> v) {
    node().tabMinHeightProperty().bind(v);
    return self();
  }

  default S tabMinHeightBidi(Property<Number> v) {
    node().tabMinHeightProperty().bindBidirectional(v);
    return self();
  }

  default double tabMinHeight() {
    return node().getTabMinHeight();
  }
}
