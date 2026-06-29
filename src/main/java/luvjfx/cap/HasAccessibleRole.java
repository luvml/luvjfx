package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.AccessibleRole;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasAccessibleRole<S extends HasAccessibleRole<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S accessibleRole(AccessibleRole v) {
    node().setAccessibleRole(v);
    return self();
  }

  default S accessibleRole(ObservableValue<? extends AccessibleRole> v) {
    node().accessibleRoleProperty().bind(v);
    return self();
  }

  default S accessibleRoleBidi(Property<AccessibleRole> v) {
    node().accessibleRoleProperty().bindBidirectional(v);
    return self();
  }

  default AccessibleRole accessibleRole() {
    return node().getAccessibleRole();
  }
}
