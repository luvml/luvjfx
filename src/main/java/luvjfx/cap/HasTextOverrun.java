package luvjfx.cap;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Labeled;
import javafx.scene.control.OverrunStyle;
import luvjfx.FxNodeOps;

public interface HasTextOverrun<S extends HasTextOverrun<S, N>, N extends Labeled> extends FxNodeOps<S, N> {
  default S textOverrun(OverrunStyle v) {
    node().setTextOverrun(v);
    return self();
  }

  default S textOverrun(ObservableValue<? extends OverrunStyle> v) {
    node().textOverrunProperty().bind(v);
    return self();
  }

  default S textOverrunBidi(Property<OverrunStyle> v) {
    node().textOverrunProperty().bindBidirectional(v);
    return self();
  }

  default OverrunStyle textOverrun() {
    return node().getTextOverrun();
  }
}
