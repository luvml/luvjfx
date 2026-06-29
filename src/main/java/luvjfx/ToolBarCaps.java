package luvjfx;

import javafx.scene.control.ToolBar;
import luvjfx.cap.HasOrientationToolBar;

public interface ToolBarCaps<S extends ToolBarCaps<S, N>, N extends ToolBar> extends ControlCaps<S, N>, HasOrientationToolBar<S, N> {
}
