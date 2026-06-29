package luvjfx.cap;

import java.lang.String;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Labeled;
import luvjfx.FxNodeOps;

public interface HasEllipsisString<S extends HasEllipsisString<S, N>, N extends Labeled> extends FxNodeOps<S, N> {
  default S ellipsisString(String v) {
    node().setEllipsisString(v);
    return self();
  }

  default S ellipsisString(ObservableValue<? extends String> v) {
    node().ellipsisStringProperty().bind(v);
    return self();
  }

  default S ellipsisStringBidi(Property<String> v) {
    node().ellipsisStringProperty().bindBidirectional(v);
    return self();
  }

  default String ellipsisString() {
    return node().getEllipsisString();
  }
}
