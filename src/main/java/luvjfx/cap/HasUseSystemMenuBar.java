package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.MenuBar;
import luvjfx.FxNodeOps;

public interface HasUseSystemMenuBar<S extends HasUseSystemMenuBar<S, N>, N extends MenuBar> extends FxNodeOps<S, N> {
  default S useSystemMenuBar(boolean v) {
    node().setUseSystemMenuBar(v);
    return self();
  }

  default S useSystemMenuBar(ObservableValue<? extends Boolean> v) {
    node().useSystemMenuBarProperty().bind(v);
    return self();
  }

  default S useSystemMenuBarBidi(Property<Boolean> v) {
    node().useSystemMenuBarProperty().bindBidirectional(v);
    return self();
  }

  default boolean useSystemMenuBar() {
    return node().isUseSystemMenuBar();
  }
}
