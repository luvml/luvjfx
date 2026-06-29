package luvjfx;

import java.lang.Override;
import javafx.scene.control.ToggleButton;

public final class FxToggleButton implements ToggleButtonCaps<FxToggleButton, ToggleButton> {
  public final ToggleButton node;

  FxToggleButton(ToggleButton node) {
    this.node = node;
  }

  @Override
  public ToggleButton node() {
    return node;
  }
}
