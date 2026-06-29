package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import luvjfx.FxNodeOps;

public interface HasOnMouseReleased<S extends HasOnMouseReleased<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onMouseReleased(EventHandler<? super MouseEvent> v) {
    node().setOnMouseReleased(v);
    return self();
  }

  default S onMouseReleased(ObservableValue<? extends EventHandler<? super MouseEvent>> v) {
    node().onMouseReleasedProperty().bind(v);
    return self();
  }

  default S onMouseReleasedBidi(Property<EventHandler<? super MouseEvent>> v) {
    node().onMouseReleasedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super MouseEvent> onMouseReleased() {
    return node().getOnMouseReleased();
  }
}
