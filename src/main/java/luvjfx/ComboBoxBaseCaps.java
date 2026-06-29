package luvjfx;

import javafx.scene.control.ComboBoxBase;
import luvjfx.cap.HasEditableComboBoxBase;
import luvjfx.cap.HasOnActionComboBoxBase;
import luvjfx.cap.HasOnHiddenComboBoxBase;
import luvjfx.cap.HasOnHidingComboBoxBase;
import luvjfx.cap.HasOnShowingComboBoxBase;
import luvjfx.cap.HasOnShownComboBoxBase;
import luvjfx.cap.HasPromptTextComboBoxBase;
import luvjfx.cap.HasValueComboBoxBase;

public interface ComboBoxBaseCaps<S extends ComboBoxBaseCaps<S, N, T>, N extends ComboBoxBase<T>, T> extends ControlCaps<S, N>, HasEditableComboBoxBase<S, N, T>, HasOnActionComboBoxBase<S, N, T>, HasOnHiddenComboBoxBase<S, N, T>, HasOnHidingComboBoxBase<S, N, T>, HasOnShowingComboBoxBase<S, N, T>, HasOnShownComboBoxBase<S, N, T>, HasPromptTextComboBoxBase<S, N, T>, HasValueComboBoxBase<S, N, T> {
}
