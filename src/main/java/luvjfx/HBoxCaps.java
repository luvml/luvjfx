package luvjfx;

import javafx.scene.layout.HBox;
import luvjfx.cap.HasAlignmentHBox;
import luvjfx.cap.HasFillHeight;
import luvjfx.cap.HasSpacingHBox;

public interface HBoxCaps<S extends HBoxCaps<S, N>, N extends HBox> extends PaneCaps<S, N>, HasAlignmentHBox<S, N>, HasFillHeight<S, N>, HasSpacingHBox<S, N> {
}
