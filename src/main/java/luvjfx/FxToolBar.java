package luvjfx;

import java.lang.Override;
import javafx.scene.control.ToolBar;

public final class FxToolBar implements ToolBarCaps<FxToolBar, ToolBar> {
  public final ToolBar node;

  FxToolBar(ToolBar node) {
    this.node = node;
  }

  @Override
  public ToolBar node() {
    return node;
  }
}
