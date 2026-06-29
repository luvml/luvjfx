package luvjfx;

import java.lang.Override;
import javafx.scene.control.ScrollBar;

public final class FxScrollBar implements ScrollBarCaps<FxScrollBar, ScrollBar> {
  public final ScrollBar node;

  FxScrollBar(ScrollBar node) {
    this.node = node;
  }

  @Override
  public ScrollBar node() {
    return node;
  }
}
