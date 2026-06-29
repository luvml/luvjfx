package luvjfx;

import java.lang.Override;
import javafx.scene.control.ProgressBar;

public final class FxProgressBar implements ProgressBarCaps<FxProgressBar, ProgressBar> {
  public final ProgressBar node;

  FxProgressBar(ProgressBar node) {
    this.node = node;
  }

  @Override
  public ProgressBar node() {
    return node;
  }
}
