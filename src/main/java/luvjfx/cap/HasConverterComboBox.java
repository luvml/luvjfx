package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ComboBox;
import javafx.util.StringConverter;
import luvjfx.FxNodeOps;

public interface HasConverterComboBox<S extends HasConverterComboBox<S, N, T>, N extends ComboBox<T>, T> extends FxNodeOps<S, N> {
  default S converter(StringConverter<T> v) {
    node().setConverter(v);
    return self();
  }

  default S converter(ObservableValue<? extends StringConverter<T>> v) {
    node().converterProperty().bind(v);
    return self();
  }

  default S converterBidi(Property<StringConverter<T>> v) {
    node().converterProperty().bindBidirectional(v);
    return self();
  }

  default StringConverter<T> converter() {
    return node().getConverter();
  }
}
