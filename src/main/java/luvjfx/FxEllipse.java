package luvjfx;

import java.lang.Override;
import javafx.scene.shape.Ellipse;

public final class FxEllipse implements EllipseCaps<FxEllipse, Ellipse> {
  public final Ellipse node;

  FxEllipse(Ellipse node) {
    this.node = node;
  }

  @Override
  public Ellipse node() {
    return node;
  }
}
