package luvjfx.cap;

import java.lang.String;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.text.Text;
import luvjfx.FxNodeOps;

public interface HasTextText<S extends HasTextText<S, N>, N extends Text> extends FxNodeOps<S, N> {
  default S text(String v) {
    node().setText(v);
    return self();
  }

  default S text(ObservableValue<? extends String> v) {
    node().textProperty().bind(v);
    return self();
  }

  default S textBidi(Property<String> v) {
    node().textProperty().bindBidirectional(v);
    return self();
  }

  default String text() {
    return node().getText();
  }
}
