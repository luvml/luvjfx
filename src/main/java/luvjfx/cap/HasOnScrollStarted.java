package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.ScrollEvent;
import luvjfx.FxNodeOps;

public interface HasOnScrollStarted<S extends HasOnScrollStarted<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onScrollStarted(EventHandler<? super ScrollEvent> v) {
    node().setOnScrollStarted(v);
    return self();
  }

  default S onScrollStarted(ObservableValue<? extends EventHandler<? super ScrollEvent>> v) {
    node().onScrollStartedProperty().bind(v);
    return self();
  }

  default S onScrollStartedBidi(Property<EventHandler<? super ScrollEvent>> v) {
    node().onScrollStartedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super ScrollEvent> onScrollStarted() {
    return node().getOnScrollStarted();
  }
}
