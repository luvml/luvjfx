package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import luvjfx.FxNodeOps;

public interface HasOnMouseExited<S extends HasOnMouseExited<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onMouseExited(EventHandler<? super MouseEvent> v) {
    node().setOnMouseExited(v);
    return self();
  }

  default S onMouseExited(ObservableValue<? extends EventHandler<? super MouseEvent>> v) {
    node().onMouseExitedProperty().bind(v);
    return self();
  }

  default S onMouseExitedBidi(Property<EventHandler<? super MouseEvent>> v) {
    node().onMouseExitedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super MouseEvent> onMouseExited() {
    return node().getOnMouseExited();
  }
}
