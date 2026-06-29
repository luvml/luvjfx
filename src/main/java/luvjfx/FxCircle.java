package luvjfx;

import java.lang.Override;
import javafx.scene.shape.Circle;

public final class FxCircle implements CircleCaps<FxCircle, Circle> {
  public final Circle node;

  FxCircle(Circle node) {
    this.node = node;
  }

  @Override
  public Circle node() {
    return node;
  }
}
