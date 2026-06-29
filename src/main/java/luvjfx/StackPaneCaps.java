package luvjfx;

import javafx.scene.layout.StackPane;
import luvjfx.cap.HasAlignmentStackPane;

public interface StackPaneCaps<S extends StackPaneCaps<S, N>, N extends StackPane> extends PaneCaps<S, N>, HasAlignmentStackPane<S, N> {
}
