package luvjfx;

import java.lang.Override;
import javafx.scene.control.ScrollPane;

public final class FxScrollPane implements ScrollPaneCaps<FxScrollPane, ScrollPane> {
  public final ScrollPane node;

  FxScrollPane(ScrollPane node) {
    this.node = node;
  }

  @Override
  public ScrollPane node() {
    return node;
  }
}
