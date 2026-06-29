package luvjfx;

import javafx.scene.layout.VBox;
import luvjfx.cap.HasAlignmentVBox;
import luvjfx.cap.HasFillWidth;
import luvjfx.cap.HasSpacingVBox;

public interface VBoxCaps<S extends VBoxCaps<S, N>, N extends VBox> extends PaneCaps<S, N>, HasAlignmentVBox<S, N>, HasFillWidth<S, N>, HasSpacingVBox<S, N> {
}
