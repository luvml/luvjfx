package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TabPane;
import luvjfx.FxNodeOps;

public interface HasRotateGraphic<S extends HasRotateGraphic<S, N>, N extends TabPane> extends FxNodeOps<S, N> {
  default S rotateGraphic(boolean v) {
    node().setRotateGraphic(v);
    return self();
  }

  default S rotateGraphic(ObservableValue<? extends Boolean> v) {
    node().rotateGraphicProperty().bind(v);
    return self();
  }

  default S rotateGraphicBidi(Property<Boolean> v) {
    node().rotateGraphicProperty().bindBidirectional(v);
    return self();
  }

  default boolean rotateGraphic() {
    return node().isRotateGraphic();
  }
}
