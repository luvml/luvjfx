package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.RotateEvent;
import luvjfx.FxNodeOps;

public interface HasOnRotationStarted<S extends HasOnRotationStarted<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onRotationStarted(EventHandler<? super RotateEvent> v) {
    node().setOnRotationStarted(v);
    return self();
  }

  default S onRotationStarted(ObservableValue<? extends EventHandler<? super RotateEvent>> v) {
    node().onRotationStartedProperty().bind(v);
    return self();
  }

  default S onRotationStartedBidi(Property<EventHandler<? super RotateEvent>> v) {
    node().onRotationStartedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super RotateEvent> onRotationStarted() {
    return node().getOnRotationStarted();
  }
}
