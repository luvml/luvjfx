package luvjfx;

import javafx.scene.control.ProgressIndicator;
import luvjfx.cap.HasProgress;

public interface ProgressIndicatorCaps<S extends ProgressIndicatorCaps<S, N>, N extends ProgressIndicator> extends ControlCaps<S, N>, HasProgress<S, N> {
}
