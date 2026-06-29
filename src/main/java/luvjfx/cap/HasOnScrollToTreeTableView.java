package luvjfx.cap;

import java.lang.Integer;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.control.ScrollToEvent;
import javafx.scene.control.TreeTableView;
import luvjfx.FxNodeOps;

public interface HasOnScrollToTreeTableView<S extends HasOnScrollToTreeTableView<S, N, T>, N extends TreeTableView<T>, T> extends FxNodeOps<S, N> {
  default S onScrollTo(EventHandler<ScrollToEvent<Integer>> v) {
    node().setOnScrollTo(v);
    return self();
  }

  default S onScrollTo(ObservableValue<? extends EventHandler<ScrollToEvent<Integer>>> v) {
    node().onScrollToProperty().bind(v);
    return self();
  }

  default S onScrollToBidi(Property<EventHandler<ScrollToEvent<Integer>>> v) {
    node().onScrollToProperty().bindBidirectional(v);
    return self();
  }

  default EventHandler<ScrollToEvent<Integer>> onScrollTo() {
    return node().getOnScrollTo();
  }
}
