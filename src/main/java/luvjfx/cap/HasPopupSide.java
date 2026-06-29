package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Side;
import javafx.scene.control.MenuButton;
import luvjfx.FxNodeOps;

public interface HasPopupSide<S extends HasPopupSide<S, N>, N extends MenuButton> extends FxNodeOps<S, N> {
  default S popupSide(Side v) {
    node().setPopupSide(v);
    return self();
  }

  default S popupSide(ObservableValue<? extends Side> v) {
    node().popupSideProperty().bind(v);
    return self();
  }

  default S popupSideBidi(Property<Side> v) {
    node().popupSideProperty().bindBidirectional(v);
    return self();
  }

  default Side popupSide() {
    return node().getPopupSide();
  }
}
