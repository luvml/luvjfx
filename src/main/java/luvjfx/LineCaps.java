package luvjfx;

import javafx.scene.shape.Line;
import luvjfx.cap.HasEndX;
import luvjfx.cap.HasEndY;
import luvjfx.cap.HasStartX;
import luvjfx.cap.HasStartY;

public interface LineCaps<S extends LineCaps<S, N>, N extends Line> extends ShapeCaps<S, N>, HasEndX<S, N>, HasEndY<S, N>, HasStartX<S, N>, HasStartY<S, N> {
}
