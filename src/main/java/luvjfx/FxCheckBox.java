package luvjfx;

import java.lang.Override;
import javafx.scene.control.CheckBox;

public final class FxCheckBox implements CheckBoxCaps<FxCheckBox, CheckBox> {
  public final CheckBox node;

  FxCheckBox(CheckBox node) {
    this.node = node;
  }

  @Override
  public CheckBox node() {
    return node;
  }
}
