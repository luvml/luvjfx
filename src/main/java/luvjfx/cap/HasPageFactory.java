package luvjfx.cap;

import java.lang.Integer;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.control.Pagination;
import javafx.util.Callback;
import luvjfx.FxNodeOps;

public interface HasPageFactory<S extends HasPageFactory<S, N>, N extends Pagination> extends FxNodeOps<S, N> {
  default S pageFactory(Callback<Integer, Node> v) {
    node().setPageFactory(v);
    return self();
  }

  default S pageFactory(ObservableValue<? extends Callback<Integer, Node>> v) {
    node().pageFactoryProperty().bind(v);
    return self();
  }

  default S pageFactoryBidi(Property<Callback<Integer, Node>> v) {
    node().pageFactoryProperty().bindBidirectional(v);
    return self();
  }

  default Callback<Integer, Node> pageFactory() {
    return node().getPageFactory();
  }
}
