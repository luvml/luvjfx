package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.MenuButton;
import luvjfx.FxNodeOps;

public interface HasOnShownMenuButton<S extends HasOnShownMenuButton<S, N>, N extends MenuButton> extends FxNodeOps<S, N> {
  default S onShown(EventHandler<Event> v) {
    node().setOnShown(v);
    return self();
  }

  default S onShown(ObservableValue<? extends EventHandler<Event>> v) {
    node().onShownProperty().bind(v);
    return self();
  }

  default S onShownBidi(Property<EventHandler<Event>> v) {
    node().onShownProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<Event> onShown() {
    return node().getOnShown();
  }
}
