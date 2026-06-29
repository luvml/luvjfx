package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Labeled;
import luvjfx.FxNodeOps;

public interface HasContentDisplay<S extends HasContentDisplay<S, N>, N extends Labeled> extends FxNodeOps<S, N> {
  default S contentDisplay(ContentDisplay v) {
    node().setContentDisplay(v);
    return self();
  }

  default S contentDisplay(ObservableValue<? extends ContentDisplay> v) {
    node().contentDisplayProperty().bind(v);
    return self();
  }

  default S contentDisplayBidi(Property<ContentDisplay> v) {
    node().contentDisplayProperty().bindBidirectional(v);
    return self();
  }

  default ContentDisplay contentDisplay() {
    return node().getContentDisplay();
  }
}
