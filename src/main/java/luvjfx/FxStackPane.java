package luvjfx;

import java.lang.Override;
import javafx.scene.layout.StackPane;

public final class FxStackPane implements StackPaneCaps<FxStackPane, StackPane>, FxPane<FxStackPane, StackPane> {
  public final StackPane node;

  FxStackPane(StackPane node) {
    this.node = node;
  }

  @Override
  public StackPane node() {
    return node;
  }
}
