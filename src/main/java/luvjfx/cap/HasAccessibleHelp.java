package luvjfx.cap;

import java.lang.String;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasAccessibleHelp<S extends HasAccessibleHelp<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S accessibleHelp(String v) {
    node().setAccessibleHelp(v);
    return self();
  }

  default S accessibleHelp(ObservableValue<? extends String> v) {
    node().accessibleHelpProperty().bind(v);
    return self();
  }

  default S accessibleHelpBidi(Property<String> v) {
    node().accessibleHelpProperty().bindBidirectional(v);
    return self();
  }

  default String accessibleHelp() {
    return node().getAccessibleHelp();
  }
}
