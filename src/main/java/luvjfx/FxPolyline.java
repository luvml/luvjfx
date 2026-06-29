package luvjfx;

import java.lang.Override;
import javafx.scene.shape.Polyline;

public final class FxPolyline implements PolylineCaps<FxPolyline, Polyline> {
  public final Polyline node;

  FxPolyline(Polyline node) {
    this.node = node;
  }

  @Override
  public Polyline node() {
    return node;
  }
}
