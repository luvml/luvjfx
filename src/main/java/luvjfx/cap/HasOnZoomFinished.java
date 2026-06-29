package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.ZoomEvent;
import luvjfx.FxNodeOps;

public interface HasOnZoomFinished<S extends HasOnZoomFinished<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onZoomFinished(EventHandler<? super ZoomEvent> v) {
    node().setOnZoomFinished(v);
    return self();
  }

  default S onZoomFinished(ObservableValue<? extends EventHandler<? super ZoomEvent>> v) {
    node().onZoomFinishedProperty().bind(v);
    return self();
  }

  default S onZoomFinishedBidi(Property<EventHandler<? super ZoomEvent>> v) {
    node().onZoomFinishedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super ZoomEvent> onZoomFinished() {
    return node().getOnZoomFinished();
  }
}
