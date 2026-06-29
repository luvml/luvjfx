package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import luvjfx.FxNodeOps;

public interface HasOnMouseClicked<S extends HasOnMouseClicked<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S onMouseClicked(EventHandler<? super MouseEvent> v) {
    node().setOnMouseClicked(v);
    return self();
  }

  default S onMouseClicked(ObservableValue<? extends EventHandler<? super MouseEvent>> v) {
    node().onMouseClickedProperty().bind(v);
    return self();
  }

  default S onMouseClickedBidi(Property<EventHandler<? super MouseEvent>> v) {
    node().onMouseClickedProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<? super MouseEvent> onMouseClicked() {
    return node().getOnMouseClicked();
  }
}
