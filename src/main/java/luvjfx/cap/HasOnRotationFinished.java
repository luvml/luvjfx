package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.RotateEvent;
import luvjfx.FxNodeOps;

public interface HasOnRotationFinished<S extends HasOnRotationFinished<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onRotationFinished(EventHandler<? super RotateEvent> v) {
    node().setOnRotationFinished(v);
    return self();
  }

  default S onRotationFinished(ObservableValue<? extends EventHandler<? super RotateEvent>> v) {
    node().onRotationFinishedProperty().bind(v);
    return self();
  }

  default S onRotationFinishedBidi(Property<EventHandler<? super RotateEvent>> v) {
    node().onRotationFinishedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super RotateEvent> onRotationFinished() {
    return node().getOnRotationFinished();
  }
}
