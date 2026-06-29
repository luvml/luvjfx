package luvjfx;

import javafx.scene.control.TextArea;
import luvjfx.cap.HasPrefColumnCountTextArea;
import luvjfx.cap.HasPrefRowCount;
import luvjfx.cap.HasScrollLeft;
import luvjfx.cap.HasScrollTop;
import luvjfx.cap.HasWrapTextTextArea;

public interface TextAreaCaps<S extends TextAreaCaps<S, N>, N extends TextArea> extends TextInputControlCaps<S, N>, HasPrefColumnCountTextArea<S, N>, HasPrefRowCount<S, N>, HasScrollLeft<S, N>, HasScrollTop<S, N>, HasWrapTextTextArea<S, N> {
}
