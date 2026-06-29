package luvjfx.cap;

import java.lang.String;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasAccessibleText<S extends HasAccessibleText<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S accessibleText(String v) {
    node().setAccessibleText(v);
    return self();
  }

  default S accessibleText(ObservableValue<? extends String> v) {
    node().accessibleTextProperty().bind(v);
    return self();
  }

  default S accessibleTextBidi(Property<String> v) {
    node().accessibleTextProperty().bindBidirectional(v);
    return self();
  }

  default String accessibleText() {
    return node().getAccessibleText();
  }
}
