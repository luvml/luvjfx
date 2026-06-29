package luvjfx;

import javafx.scene.control.ButtonBase;
import luvjfx.cap.HasOnActionButtonBase;

public interface ButtonBaseCaps<S extends ButtonBaseCaps<S, N>, N extends ButtonBase> extends LabeledCaps<S, N>, HasOnActionButtonBase<S, N> {
}
