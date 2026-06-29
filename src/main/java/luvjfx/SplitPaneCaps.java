package luvjfx;

import javafx.scene.control.SplitPane;
import luvjfx.cap.HasOrientationSplitPane;

public interface SplitPaneCaps<S extends SplitPaneCaps<S, N>, N extends SplitPane> extends ControlCaps<S, N>, HasOrientationSplitPane<S, N> {
}
