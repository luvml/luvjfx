package luvjfx.cap;

import java.lang.Boolean;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Labeled;
import luvjfx.FxNodeOps;

public interface HasMnemonicParsing<S extends HasMnemonicParsing<S, N>, N extends Labeled> extends FxNodeOps<S, N> {
  default S mnemonicParsing(boolean v) {
    node().setMnemonicParsing(v);
    return self();
  }

  default S mnemonicParsing(ObservableValue<? extends Boolean> v) {
    node().mnemonicParsingProperty().bind(v);
    return self();
  }

  default S mnemonicParsingBidi(Property<Boolean> v) {
    node().mnemonicParsingProperty().bindBidirectional(v);
    return self();
  }

  default boolean mnemonicParsing() {
    return node().isMnemonicParsing();
  }
}
