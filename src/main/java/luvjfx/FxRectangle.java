package luvjfx;

import java.lang.Override;
import javafx.scene.shape.Rectangle;

public final class FxRectangle implements RectangleCaps<FxRectangle, Rectangle> {
  public final Rectangle node;

  FxRectangle(Rectangle node) {
    this.node = node;
  }

  @Override
  public Rectangle node() {
    return node;
  }
}
