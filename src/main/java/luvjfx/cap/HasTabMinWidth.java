package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TabPane;
import luvjfx.FxNodeOps;

public interface HasTabMinWidth<S extends HasTabMinWidth<S, N>, N extends TabPane> extends FxNodeOps<S, N> {
  default S tabMinWidth(double v) {
    node().setTabMinWidth(v);
    return self();
  }

  default S tabMinWidth(ObservableValue<? extends Double> v) {
    node().tabMinWidthProperty().bind(v);
    return self();
  }

  default S tabMinWidthBidi(Property<Number> v) {
    node().tabMinWidthProperty().bindBidirectional(v);
    return self();
  }

  default double tabMinWidth() {
    return node().getTabMinWidth();
  }
}
