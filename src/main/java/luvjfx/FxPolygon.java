package luvjfx;

import java.lang.Override;
import javafx.scene.shape.Polygon;

public final class FxPolygon implements PolygonCaps<FxPolygon, Polygon> {
  public final Polygon node;

  FxPolygon(Polygon node) {
    this.node = node;
  }

  @Override
  public Polygon node() {
    return node;
  }
}
