package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.ContextMenuEvent;
import luvjfx.FxNodeOps;

public interface HasOnContextMenuRequested<S extends HasOnContextMenuRequested<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onContextMenuRequested(EventHandler<? super ContextMenuEvent> v) {
    node().setOnContextMenuRequested(v);
    return self();
  }

  default S onContextMenuRequested(
      ObservableValue<? extends EventHandler<? super ContextMenuEvent>> v) {
    node().onContextMenuRequestedProperty().bind(v);
    return self();
  }

  default S onContextMenuRequestedBidi(Property<EventHandler<? super ContextMenuEvent>> v) {
    node().onContextMenuRequestedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super ContextMenuEvent> onContextMenuRequested() {
    return node().getOnContextMenuRequested();
  }
}
