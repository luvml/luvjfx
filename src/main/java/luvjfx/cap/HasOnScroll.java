package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.ScrollEvent;
import luvjfx.FxNodeOps;

public interface HasOnScroll<S extends HasOnScroll<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onScroll(EventHandler<? super ScrollEvent> v) {
    node().setOnScroll(v);
    return self();
  }

  default S onScroll(ObservableValue<? extends EventHandler<? super ScrollEvent>> v) {
    node().onScrollProperty().bind(v);
    return self();
  }

  default S onScrollBidi(Property<EventHandler<? super ScrollEvent>> v) {
    node().onScrollProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super ScrollEvent> onScroll() {
    return node().getOnScroll();
  }
}
