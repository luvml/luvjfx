package luvjfx.cap;

import java.lang.String;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasAccessibleRoleDescription<S extends HasAccessibleRoleDescription<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S accessibleRoleDescription(String v) {
    node().setAccessibleRoleDescription(v);
    return self();
  }

  default S accessibleRoleDescription(ObservableValue<? extends String> v) {
    node().accessibleRoleDescriptionProperty().bind(v);
    return self();
  }

  default S accessibleRoleDescriptionBidi(Property<String> v) {
    node().accessibleRoleDescriptionProperty().bindBidirectional(v);
    return self();
  }

  default String accessibleRoleDescription() {
    return node().getAccessibleRoleDescription();
  }
}
