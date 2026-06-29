package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.DepthTest;
import javafx.scene.Node;
import luvjfx.FxNodeOps;

public interface HasDepthTest<S extends HasDepthTest<S, N>, N extends Node> extends FxNodeOps<S, N> {
  default S depthTest(DepthTest v) {
    node().setDepthTest(v);
    return self();
  }

  default S depthTest(ObservableValue<? extends DepthTest> v) {
    node().depthTestProperty().bind(v);
    return self();
  }

  default S depthTestBidi(Property<DepthTest> v) {
    node().depthTestProperty().bindBidirectional(v);
    return self();
  }

  default DepthTest depthTest() {
    return node().getDepthTest();
  }
}
