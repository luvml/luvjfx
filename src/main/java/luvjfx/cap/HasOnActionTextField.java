package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import luvjfx.FxNodeOps;

public interface HasOnActionTextField<S extends HasOnActionTextField<S, N>, N extends TextField> extends FxNodeOps<S, N> {
  default S onAction(EventHandler<ActionEvent> v) {
    node().setOnAction(v);
    return self();
  }

  default S onAction(ObservableValue<? extends EventHandler<ActionEvent>> v) {
    node().onActionProperty().bind(v);
    return self();
  }

  default S onActionBidi(Property<EventHandler<ActionEvent>> v) {
    node().onActionProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<ActionEvent> onAction() {
    return node().getOnAction();
  }
}
