package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.MenuButton;
import luvjfx.FxNodeOps;

public interface HasOnHidingMenuButton<S extends HasOnHidingMenuButton<S, N>, N extends MenuButton> extends FxNodeOps<S, N> {
  default S onHiding(EventHandler<Event> v) {
    node().setOnHiding(v);
    return self();
  }

  default S onHiding(ObservableValue<? extends EventHandler<Event>> v) {
    node().onHidingProperty().bind(v);
    return self();
  }

  default S onHidingBidi(Property<EventHandler<Event>> v) {
    node().onHidingProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<Event> onHiding() {
    return node().getOnHiding();
  }
}
