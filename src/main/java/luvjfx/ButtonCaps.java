package luvjfx;

import javafx.scene.control.Button;
import luvjfx.cap.HasCancelButton;
import luvjfx.cap.HasDefaultButton;

public interface ButtonCaps<S extends ButtonCaps<S, N>, N extends Button> extends ButtonBaseCaps<S, N>, HasCancelButton<S, N>, HasDefaultButton<S, N> {
}
