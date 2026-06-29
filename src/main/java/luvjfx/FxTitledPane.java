package luvjfx;

import java.lang.Override;
import javafx.scene.control.TitledPane;

public final class FxTitledPane implements TitledPaneCaps<FxTitledPane, TitledPane> {
  public final TitledPane node;

  FxTitledPane(TitledPane node) {
    this.node = node;
  }

  @Override
  public TitledPane node() {
    return node;
  }
}
