package luvjfx.cap;

import java.lang.Integer;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollToEvent;
import luvjfx.FxNodeOps;

public interface HasOnScrollToListView<S extends HasOnScrollToListView<S, N, T>, N extends ListView<T>, T> extends FxNodeOps<S, N> {
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
