package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.ChoiceBox;
import luvjfx.FxNodeOps;

public interface HasOnHiddenChoiceBox<S extends HasOnHiddenChoiceBox<S, N, T>, N extends ChoiceBox<T>, T> extends FxNodeOps<S, N> {
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
