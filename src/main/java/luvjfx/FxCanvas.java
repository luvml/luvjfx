package luvjfx;

import java.lang.Override;
import javafx.scene.canvas.Canvas;

public final class FxCanvas implements CanvasCaps<FxCanvas, Canvas> {
  public final Canvas node;

  FxCanvas(Canvas node) {
    this.node = node;
  }

  @Override
  public Canvas node() {
    return node;
  }
}
