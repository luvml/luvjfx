package luvjfx;

import javafx.scene.control.TextField;
import luvjfx.cap.HasAlignmentTextField;
import luvjfx.cap.HasOnActionTextField;
import luvjfx.cap.HasPrefColumnCountTextField;

public interface TextFieldCaps<S extends TextFieldCaps<S, N>, N extends TextField> extends TextInputControlCaps<S, N>, HasAlignmentTextField<S, N>, HasOnActionTextField<S, N>, HasPrefColumnCountTextField<S, N> {
}
