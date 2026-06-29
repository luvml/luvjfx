package luvjfx;

import javafx.scene.layout.GridPane;
import luvjfx.cap.HasAlignmentGridPane;
import luvjfx.cap.HasGridLinesVisible;
import luvjfx.cap.HasHgapGridPane;
import luvjfx.cap.HasVgapGridPane;

public interface GridPaneCaps<S extends GridPaneCaps<S, N>, N extends GridPane> extends PaneCaps<S, N>, HasAlignmentGridPane<S, N>, HasGridLinesVisible<S, N>, HasHgapGridPane<S, N>, HasVgapGridPane<S, N> {
}
