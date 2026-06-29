package luvjfx;

import java.lang.Override;
import javafx.scene.layout.BorderPane;

public final class FxBorderPane implements BorderPaneCaps<FxBorderPane, BorderPane> {
  public final BorderPane node;

  FxBorderPane(BorderPane node) {
    this.node = node;
  }

  @Override
  public BorderPane node() {
    return node;
  }
}
