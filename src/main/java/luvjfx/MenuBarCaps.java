package luvjfx;

import javafx.scene.control.MenuBar;
import luvjfx.cap.HasUseSystemMenuBar;

public interface MenuBarCaps<S extends MenuBarCaps<S, N>, N extends MenuBar> extends ControlCaps<S, N>, HasUseSystemMenuBar<S, N> {
}
