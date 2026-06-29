package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Cursor;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasCursor<S extends HasCursor<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S cursor(Cursor v) {
    node().setCursor(v);
    return self();
  }

  default S cursor(ObservableValue<? extends Cursor> v) {
    node().cursorProperty().bind(v);
    return self();
  }

  default S cursorBidi(Property<Cursor> v) {
    node().cursorProperty().bindBidirectional(v);
    return self();
  }

  default Cursor cursor() {
    return node().getCursor();
  }
}
