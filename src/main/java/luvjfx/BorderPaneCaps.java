package luvjfx;

import javafx.scene.layout.BorderPane;
import luvjfx.cap.HasBottom;
import luvjfx.cap.HasCenter;
import luvjfx.cap.HasLeft;
import luvjfx.cap.HasRight;
import luvjfx.cap.HasTop;

public interface BorderPaneCaps<S extends BorderPaneCaps<S, N>, N extends BorderPane> extends PaneCaps<S, N>, HasBottom<S, N>, HasCenter<S, N>, HasLeft<S, N>, HasRight<S, N>, HasTop<S, N> {
}
