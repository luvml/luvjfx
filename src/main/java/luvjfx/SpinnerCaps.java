package luvjfx;

import javafx.scene.control.Spinner;
import luvjfx.cap.HasEditableSpinner;
import luvjfx.cap.HasInitialDelay;
import luvjfx.cap.HasPromptTextSpinner;
import luvjfx.cap.HasRepeatDelay;
import luvjfx.cap.HasValueFactory;

public interface SpinnerCaps<S extends SpinnerCaps<S, N, T>, N extends Spinner<T>, T> extends ControlCaps<S, N>, HasEditableSpinner<S, N, T>, HasInitialDelay<S, N, T>, HasPromptTextSpinner<S, N, T>, HasRepeatDelay<S, N, T>, HasValueFactory<S, N, T> {
}
