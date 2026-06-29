package luvjfx;

import java.lang.Override;
import javafx.scene.control.MenuBar;

public final class FxMenuBar implements MenuBarCaps<FxMenuBar, MenuBar> {
  public final MenuBar node;

  FxMenuBar(MenuBar node) {
    this.node = node;
  }

  @Override
  public MenuBar node() {
    return node;
  }
}
