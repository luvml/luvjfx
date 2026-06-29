package luvjfx;

import javafx.scene.control.TextInputControl;
import luvjfx.cap.HasEditableTextInputControl;
import luvjfx.cap.HasFontTextInputControl;
import luvjfx.cap.HasPromptTextTextInputControl;
import luvjfx.cap.HasTextFormatter;
import luvjfx.cap.HasTextTextInputControl;

public interface TextInputControlCaps<S extends TextInputControlCaps<S, N>, N extends TextInputControl> extends ControlCaps<S, N>, HasEditableTextInputControl<S, N>, HasFontTextInputControl<S, N>, HasPromptTextTextInputControl<S, N>, HasTextTextInputControl<S, N>, HasTextFormatter<S, N> {
}
