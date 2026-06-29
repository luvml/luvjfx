package luvjfx;

import javafx.scene.control.ScrollBar;
import luvjfx.cap.HasBlockIncrementScrollBar;
import luvjfx.cap.HasMaxScrollBar;
import luvjfx.cap.HasMinScrollBar;
import luvjfx.cap.HasOrientationScrollBar;
import luvjfx.cap.HasUnitIncrement;
import luvjfx.cap.HasValueScrollBar;
import luvjfx.cap.HasVisibleAmount;

public interface ScrollBarCaps<S extends ScrollBarCaps<S, N>, N extends ScrollBar> extends ControlCaps<S, N>, HasBlockIncrementScrollBar<S, N>, HasMaxScrollBar<S, N>, HasMinScrollBar<S, N>, HasOrientationScrollBar<S, N>, HasUnitIncrement<S, N>, HasValueScrollBar<S, N>, HasVisibleAmount<S, N> {
}
