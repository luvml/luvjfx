package luvjfx;

import java.lang.Override;
import javafx.scene.shape.Line;

public final class FxLine implements LineCaps<FxLine, Line> {
  public final Line node;

  FxLine(Line node) {
    this.node = node;
  }

  @Override
  public Line node() {
    return node;
  }
}
