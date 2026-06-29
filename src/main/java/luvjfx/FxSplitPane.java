package luvjfx;

import java.lang.Override;
import javafx.scene.control.SplitPane;

public final class FxSplitPane implements SplitPaneCaps<FxSplitPane, SplitPane> {
  public final SplitPane node;

  FxSplitPane(SplitPane node) {
    this.node = node;
  }

  @Override
  public SplitPane node() {
    return node;
  }
}
