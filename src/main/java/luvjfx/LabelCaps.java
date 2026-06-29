package luvjfx;

import javafx.scene.control.Label;
import luvjfx.cap.HasLabelFor;

public interface LabelCaps<S extends LabelCaps<S, N>, N extends Label> extends LabeledCaps<S, N>, HasLabelFor<S, N> {
}
