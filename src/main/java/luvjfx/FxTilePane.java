package luvjfx;

import java.lang.Override;
import javafx.scene.layout.TilePane;

public final class FxTilePane implements TilePaneCaps<FxTilePane, TilePane>, FxPane<FxTilePane, TilePane> {
  public final TilePane node;

  FxTilePane(TilePane node) {
    this.node = node;
  }

  @Override
  public TilePane node() {
    return node;
  }
}
