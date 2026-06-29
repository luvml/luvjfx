package luvjfx;

import javafx.scene.control.CheckBox;
import luvjfx.cap.HasAllowIndeterminate;
import luvjfx.cap.HasIndeterminate;
import luvjfx.cap.HasSelectedCheckBox;

public interface CheckBoxCaps<S extends CheckBoxCaps<S, N>, N extends CheckBox> extends ButtonBaseCaps<S, N>, HasAllowIndeterminate<S, N>, HasIndeterminate<S, N>, HasSelectedCheckBox<S, N> {
}
