package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TabPane;
import luvjfx.FxNodeOps;

public interface HasTabClosingPolicy<S extends HasTabClosingPolicy<S, N>, N extends TabPane> extends FxNodeOps<S, N> {
  default S tabClosingPolicy(TabPane.TabClosingPolicy v) {
    node().setTabClosingPolicy(v);
    return self();
  }

  default S tabClosingPolicy(ObservableValue<? extends TabPane.TabClosingPolicy> v) {
    node().tabClosingPolicyProperty().bind(v);
    return self();
  }

  default S tabClosingPolicyBidi(Property<TabPane.TabClosingPolicy> v) {
    node().tabClosingPolicyProperty().bindBidirectional(v);
    return self();
  }

  default TabPane.TabClosingPolicy tabClosingPolicy() {
    return node().getTabClosingPolicy();
  }
}
