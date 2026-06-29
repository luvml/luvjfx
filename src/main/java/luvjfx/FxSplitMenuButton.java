package luvjfx;

import java.lang.Override;
import javafx.scene.control.SplitMenuButton;

public final class FxSplitMenuButton implements SplitMenuButtonCaps<FxSplitMenuButton, SplitMenuButton> {
  public final SplitMenuButton node;

  FxSplitMenuButton(SplitMenuButton node) {
    this.node = node;
  }

  @Override
  public SplitMenuButton node() {
    return node;
  }
}
