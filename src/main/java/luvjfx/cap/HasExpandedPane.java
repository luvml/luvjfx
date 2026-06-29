package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Accordion;
import javafx.scene.control.TitledPane;
import luvjfx.FxNodeOps;

public interface HasExpandedPane<S extends HasExpandedPane<S, N>, N extends Accordion> extends FxNodeOps<S, N> {
  default S expandedPane(TitledPane v) {
    node().setExpandedPane(v);
    return self();
  }

  default S expandedPane(FxNodeOps<?, ? extends TitledPane> v) {
    node().setExpandedPane(v.node());
    return self();
  }

  default S expandedPane(ObservableValue<? extends TitledPane> v) {
    node().expandedPaneProperty().bind(v);
    return self();
  }

  default S expandedPaneBidi(Property<TitledPane> v) {
    node().expandedPaneProperty().bindBidirectional(v);
    return self();
  }

  default TitledPane expandedPane() {
    return node().getExpandedPane();
  }
}
