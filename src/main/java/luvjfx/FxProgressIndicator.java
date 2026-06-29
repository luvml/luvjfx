package luvjfx;

import java.lang.Override;
import javafx.scene.control.ProgressIndicator;

public final class FxProgressIndicator implements ProgressIndicatorCaps<FxProgressIndicator, ProgressIndicator> {
  public final ProgressIndicator node;

  FxProgressIndicator(ProgressIndicator node) {
    this.node = node;
  }

  @Override
  public ProgressIndicator node() {
    return node;
  }
}
