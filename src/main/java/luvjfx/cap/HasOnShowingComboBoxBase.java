package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBoxBase;
import luvjfx.FxNodeOps;

public interface HasOnShowingComboBoxBase<S extends HasOnShowingComboBoxBase<S, N, T>, N extends ComboBoxBase<T>, T> extends FxNodeOps<S, N> {
  default S onShowing(EventHandler<Event> v) {
    node().setOnShowing(v);
    return self();
  }

  default S onShowing(ObservableValue<? extends EventHandler<Event>> v) {
    node().onShowingProperty().bind(v);
    return self();
  }

  default S onShowingBidi(Property<EventHandler<Event>> v) {
    node().onShowingProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<Event> onShowing() {
    return node().getOnShowing();
  }
}
