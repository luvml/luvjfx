package luvjfx.cap;

import java.lang.Double;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TabPane;
import luvjfx.FxNodeOps;

public interface HasTabMaxWidth<S extends HasTabMaxWidth<S, N>, N extends TabPane> extends FxNodeOps<S, N> {
  default S tabMaxWidth(double v) {
    node().setTabMaxWidth(v);
    return self();
  }

  default S tabMaxWidth(ObservableValue<? extends Double> v) {
    node().tabMaxWidthProperty().bind(v);
    return self();
  }

  default S tabMaxWidthBidi(Property<Number> v) {
    node().tabMaxWidthProperty().bindBidirectional(v);
    return self();
  }

  default double tabMaxWidth() {
    return node().getTabMaxWidth();
  }
}
