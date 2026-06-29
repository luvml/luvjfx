package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.ChoiceBox;
import luvjfx.FxNodeOps;

public interface HasOnHidingChoiceBox<S extends HasOnHidingChoiceBox<S, N, T>, N extends ChoiceBox<T>, T> extends FxNodeOps<S, N> {
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
