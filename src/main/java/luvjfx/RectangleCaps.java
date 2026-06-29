package luvjfx;

import javafx.scene.shape.Rectangle;
import luvjfx.cap.HasArcHeight;
import luvjfx.cap.HasArcWidth;
import luvjfx.cap.HasHeightRectangle;
import luvjfx.cap.HasWidthRectangle;
import luvjfx.cap.HasXRectangle;
import luvjfx.cap.HasYRectangle;

public interface RectangleCaps<S extends RectangleCaps<S, N>, N extends Rectangle> extends ShapeCaps<S, N>, HasArcHeight<S, N>, HasArcWidth<S, N>, HasHeightRectangle<S, N>, HasWidthRectangle<S, N>, HasXRectangle<S, N>, HasYRectangle<S, N> {
}
