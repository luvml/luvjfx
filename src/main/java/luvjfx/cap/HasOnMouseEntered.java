package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import luvjfx.FxNodeOps;

public interface HasOnMouseEntered<S extends HasOnMouseEntered<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onMouseEntered(EventHandler<? super MouseEvent> v) {
    node().setOnMouseEntered(v);
    return self();
  }

  default S onMouseEntered(ObservableValue<? extends EventHandler<? super MouseEvent>> v) {
    node().onMouseEnteredProperty().bind(v);
    return self();
  }

  default S onMouseEnteredBidi(Property<EventHandler<? super MouseEvent>> v) {
    node().onMouseEnteredProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super MouseEvent> onMouseEntered() {
    return node().getOnMouseEntered();
  }
}
