package luvjfx;

import javafx.scene.canvas.Canvas;
import luvjfx.cap.HasHeightCanvas;
import luvjfx.cap.HasWidthCanvas;

public interface CanvasCaps<S extends CanvasCaps<S, N>, N extends Canvas> extends NodeCaps<S, N>, HasHeightCanvas<S, N>, HasWidthCanvas<S, N> {
}
