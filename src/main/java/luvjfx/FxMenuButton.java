package luvjfx;

import java.lang.Override;
import javafx.scene.control.MenuButton;

public final class FxMenuButton implements MenuButtonCaps<FxMenuButton, MenuButton> {
  public final MenuButton node;

  FxMenuButton(MenuButton node) {
    this.node = node;
  }

  @Override
  public MenuButton node() {
    return node;
  }
}
