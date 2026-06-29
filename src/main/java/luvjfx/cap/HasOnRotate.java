package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.RotateEvent;
import luvjfx.FxNodeOps;

public interface HasOnRotate<S extends HasOnRotate<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onRotate(EventHandler<? super RotateEvent> v) {
    node().setOnRotate(v);
    return self();
  }

  default S onRotate(ObservableValue<? extends EventHandler<? super RotateEvent>> v) {
    node().onRotateProperty().bind(v);
    return self();
  }

  default S onRotateBidi(Property<EventHandler<? super RotateEvent>> v) {
    node().onRotateProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super RotateEvent> onRotate() {
    return node().getOnRotate();
  }
}
