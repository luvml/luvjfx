package luvjfx;

import java.lang.Override;
import javafx.scene.control.TabPane;

public final class FxTabPane implements TabPaneCaps<FxTabPane, TabPane> {
  public final TabPane node;

  FxTabPane(TabPane node) {
    this.node = node;
  }

  @Override
  public TabPane node() {
    return node;
  }
}
