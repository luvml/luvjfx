package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Hyperlink;
import luvjfx.FxNodeOps;

public interface HasVisited<S extends HasVisited<S, N>, N extends Hyperlink> extends FxNodeOps<S, N> {
  default S visited(boolean v) {
    node().setVisited(v);
    return self();
  }

  default S visited(ObservableValue<? extends Boolean> v) {
    node().visitedProperty().bind(v);
    return self();
  }

  default S visitedBidi(Property<Boolean> v) {
    node().visitedProperty().bindBidirectional(v);
    return self();
  }

  default boolean visited() {
    return node().isVisited();
  }
}
