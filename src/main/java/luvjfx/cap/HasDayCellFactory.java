package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.util.Callback;
import luvjfx.FxNodeOps;

public interface HasDayCellFactory<S extends HasDayCellFactory<S, N>, N extends DatePicker> extends FxNodeOps<S, N> {
  default S dayCellFactory(Callback<DatePicker, DateCell> v) {
    node().setDayCellFactory(v);
    return self();
  }

  default S dayCellFactory(ObservableValue<? extends Callback<DatePicker, DateCell>> v) {
    node().dayCellFactoryProperty().bind(v);
    return self();
  }

  default S dayCellFactoryBidi(Property<Callback<DatePicker, DateCell>> v) {
    node().dayCellFactoryProperty().bindBidirectional(v);
    return self();
  }

  default Callback<DatePicker, DateCell> dayCellFactory() {
    return node().getDayCellFactory();
  }
}
