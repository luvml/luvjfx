package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Control;
import luvjfx.FxNodeOps;

public interface HasContextMenu<S extends HasContextMenu<S, N>, N extends Control> extends FxNodeOps<S, N> {
  default S contextMenu(ContextMenu v) {
    node().setContextMenu(v);
    return self();
  }

  default S contextMenu(ObservableValue<? extends ContextMenu> v) {
    node().contextMenuProperty().bind(v);
    return self();
  }

  default S contextMenuBidi(Property<ContextMenu> v) {
    node().contextMenuProperty().bindBidirectional(v);
    return self();
  }

  default ContextMenu contextMenu() {
    return node().getContextMenu();
  }
}
