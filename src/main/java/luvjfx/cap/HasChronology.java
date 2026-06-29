package luvjfx.cap;

import java.time.chrono.Chronology;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.DatePicker;
import luvjfx.FxNodeOps;

public interface HasChronology<S extends HasChronology<S, N>, N extends DatePicker> extends FxNodeOps<S, N> {
  default S chronology(Chronology v) {
    node().setChronology(v);
    return self();
  }

  default S chronology(ObservableValue<? extends Chronology> v) {
    node().chronologyProperty().bind(v);
    return self();
  }

  default S chronologyBidi(Property<Chronology> v) {
    node().chronologyProperty().bindBidirectional(v);
    return self();
  }

  default Chronology chronology() {
    return node().getChronology();
  }
}
