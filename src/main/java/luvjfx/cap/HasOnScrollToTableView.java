package luvjfx.cap;

import java.lang.Integer;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.control.ScrollToEvent;
import javafx.scene.control.TableView;
import luvjfx.FxNodeOps;

public interface HasOnScrollToTableView<S extends HasOnScrollToTableView<S, N, T>, N extends TableView<T>, T> extends FxNodeOps<S, N> {
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
