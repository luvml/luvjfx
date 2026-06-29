package luvjfx;

import javafx.scene.control.Separator;
import luvjfx.cap.HasHalignment;
import luvjfx.cap.HasOrientationSeparator;
import luvjfx.cap.HasValignment;

public interface SeparatorCaps<S extends SeparatorCaps<S, N>, N extends Separator> extends ControlCaps<S, N>, HasHalignment<S, N>, HasOrientationSeparator<S, N>, HasValignment<S, N> {
}
