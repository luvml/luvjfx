package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.ZoomEvent;
import luvjfx.FxNodeOps;

public interface HasOnZoom<S extends HasOnZoom<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onZoom(EventHandler<? super ZoomEvent> v) {
    node().setOnZoom(v);
    return self();
  }

  default S onZoom(ObservableValue<? extends EventHandler<? super ZoomEvent>> v) {
    node().onZoomProperty().bind(v);
    return self();
  }

  default S onZoomBidi(Property<EventHandler<? super ZoomEvent>> v) {
    node().onZoomProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super ZoomEvent> onZoom() {
    return node().getOnZoom();
  }
}
