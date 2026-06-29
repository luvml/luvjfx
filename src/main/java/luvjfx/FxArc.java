package luvjfx;

import java.lang.Override;
import javafx.scene.shape.Arc;

public final class FxArc implements ArcCaps<FxArc, Arc> {
  public final Arc node;

  FxArc(Arc node) {
    this.node = node;
  }

  @Override
  public Arc node() {
    return node;
  }
}
