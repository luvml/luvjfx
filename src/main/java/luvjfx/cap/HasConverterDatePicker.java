package luvjfx.cap;

import java.time.LocalDate;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.DatePicker;
import javafx.util.StringConverter;
import luvjfx.FxNodeOps;

public interface HasConverterDatePicker<S extends HasConverterDatePicker<S, N>, N extends DatePicker> extends FxNodeOps<S, N> {
  default S converter(StringConverter<LocalDate> v) {
    node().setConverter(v);
    return self();
  }

  default S converter(ObservableValue<? extends StringConverter<LocalDate>> v) {
    node().converterProperty().bind(v);
    return self();
  }

  default S converterBidi(Property<StringConverter<LocalDate>> v) {
    node().converterProperty().bindBidirectional(v);
    return self();
  }

  default StringConverter<LocalDate> converter() {
    return node().getConverter();
  }
}
