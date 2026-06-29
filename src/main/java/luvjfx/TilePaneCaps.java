package luvjfx;

import javafx.scene.layout.TilePane;
import luvjfx.cap.HasAlignmentTilePane;
import luvjfx.cap.HasHgapTilePane;
import luvjfx.cap.HasOrientationTilePane;
import luvjfx.cap.HasPrefColumns;
import luvjfx.cap.HasPrefRows;
import luvjfx.cap.HasPrefTileHeight;
import luvjfx.cap.HasPrefTileWidth;
import luvjfx.cap.HasTileAlignment;
import luvjfx.cap.HasVgapTilePane;

public interface TilePaneCaps<S extends TilePaneCaps<S, N>, N extends TilePane> extends PaneCaps<S, N>, HasAlignmentTilePane<S, N>, HasHgapTilePane<S, N>, HasOrientationTilePane<S, N>, HasPrefColumns<S, N>, HasPrefRows<S, N>, HasPrefTileHeight<S, N>, HasPrefTileWidth<S, N>, HasTileAlignment<S, N>, HasVgapTilePane<S, N> {
}
