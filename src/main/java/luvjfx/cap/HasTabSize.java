package luvjfx.cap;

import java.lang.Integer;
import java.lang.Number;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.text.Text;
import luvjfx.FxNodeOps;

public interface HasTabSize<S extends HasTabSize<S, N>, N extends Text> extends FxNodeOps<S, N> {
  default S tabSize(int v) {
    node().setTabSize(v);
    return self();
  }

  default S tabSize(ObservableValue<? extends Integer> v) {
    node().tabSizeProperty().bind(v);
    return self();
  }

  default S tabSizeBidi(Property<Number> v) {
    node().tabSizeProperty().bindBidirectional(v);
    return self();
  }

  default int tabSize() {
    return node().getTabSize();
  }
}
