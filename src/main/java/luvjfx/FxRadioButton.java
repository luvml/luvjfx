package luvjfx;

import java.lang.Override;
import javafx.scene.control.RadioButton;

public final class FxRadioButton implements RadioButtonCaps<FxRadioButton, RadioButton> {
  public final RadioButton node;

  FxRadioButton(RadioButton node) {
    this.node = node;
  }

  @Override
  public RadioButton node() {
    return node;
  }
}
