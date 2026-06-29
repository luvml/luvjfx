package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TabPane;
import luvjfx.FxNodeOps;

public interface HasTabDragPolicy<S extends HasTabDragPolicy<S, N>, N extends TabPane> extends FxNodeOps<S, N> {
  default S tabDragPolicy(TabPane.TabDragPolicy v) {
    node().setTabDragPolicy(v);
    return self();
  }

  default S tabDragPolicy(ObservableValue<? extends TabPane.TabDragPolicy> v) {
    node().tabDragPolicyProperty().bind(v);
    return self();
  }

  default S tabDragPolicyBidi(Property<TabPane.TabDragPolicy> v) {
    node().tabDragPolicyProperty().bindBidirectional(v);
    return self();
  }

  default TabPane.TabDragPolicy tabDragPolicy() {
    return node().getTabDragPolicy();
  }
}
