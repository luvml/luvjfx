package luvjfx;

import javafx.scene.control.TitledPane;
import luvjfx.cap.HasAnimated;
import luvjfx.cap.HasCollapsible;
import luvjfx.cap.HasContentTitledPane;
import luvjfx.cap.HasExpanded;

public interface TitledPaneCaps<S extends TitledPaneCaps<S, N>, N extends TitledPane> extends LabeledCaps<S, N>, HasAnimated<S, N>, HasCollapsible<S, N>, HasContentTitledPane<S, N>, HasExpanded<S, N> {
}
