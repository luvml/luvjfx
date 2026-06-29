package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.ZoomEvent;
import luvjfx.FxNodeOps;

public interface HasOnZoomStarted<S extends HasOnZoomStarted<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onZoomStarted(EventHandler<? super ZoomEvent> v) {
    node().setOnZoomStarted(v);
    return self();
  }

  default S onZoomStarted(ObservableValue<? extends EventHandler<? super ZoomEvent>> v) {
    node().onZoomStartedProperty().bind(v);
    return self();
  }

  default S onZoomStartedBidi(Property<EventHandler<? super ZoomEvent>> v) {
    node().onZoomStartedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super ZoomEvent> onZoomStarted() {
    return node().getOnZoomStarted();
  }
}
