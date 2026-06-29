package luvjfx;

import javafx.scene.control.ToggleButton;
import luvjfx.cap.HasSelectedToggleButton;
import luvjfx.cap.HasToggleGroup;

public interface ToggleButtonCaps<S extends ToggleButtonCaps<S, N>, N extends ToggleButton> extends ButtonBaseCaps<S, N>, HasSelectedToggleButton<S, N>, HasToggleGroup<S, N> {
}
