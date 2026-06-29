package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.ScrollEvent;
import luvjfx.FxNodeOps;

public interface HasOnScrollFinished<S extends HasOnScrollFinished<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onScrollFinished(EventHandler<? super ScrollEvent> v) {
    node().setOnScrollFinished(v);
    return self();
  }

  default S onScrollFinished(ObservableValue<? extends EventHandler<? super ScrollEvent>> v) {
    node().onScrollFinishedProperty().bind(v);
    return self();
  }

  default S onScrollFinishedBidi(Property<EventHandler<? super ScrollEvent>> v) {
    node().onScrollFinishedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super ScrollEvent> onScrollFinished() {
    return node().getOnScrollFinished();
  }
}
