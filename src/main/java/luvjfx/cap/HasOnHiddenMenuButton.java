package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.MenuButton;
import luvjfx.FxNodeOps;

public interface HasOnHiddenMenuButton<S extends HasOnHiddenMenuButton<S, N>, N extends MenuButton> extends FxNodeOps<S, N> {
  default S onHidden(EventHandler<Event> v) {
    node().setOnHidden(v);
    return self();
  }

  default S onHidden(ObservableValue<? extends EventHandler<Event>> v) {
    node().onHiddenProperty().bind(v);
    return self();
  }

  default S onHiddenBidi(Property<EventHandler<Event>> v) {
    node().onHiddenProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<Event> onHidden() {
    return node().getOnHidden();
  }
}
