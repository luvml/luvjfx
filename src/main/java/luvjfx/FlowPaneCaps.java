package luvjfx;

import javafx.scene.layout.FlowPane;
import luvjfx.cap.HasAlignmentFlowPane;
import luvjfx.cap.HasColumnHalignment;
import luvjfx.cap.HasHgapFlowPane;
import luvjfx.cap.HasOrientationFlowPane;
import luvjfx.cap.HasPrefWrapLength;
import luvjfx.cap.HasRowValignment;
import luvjfx.cap.HasVgapFlowPane;

public interface FlowPaneCaps<S extends FlowPaneCaps<S, N>, N extends FlowPane> extends PaneCaps<S, N>, HasAlignmentFlowPane<S, N>, HasColumnHalignment<S, N>, HasHgapFlowPane<S, N>, HasOrientationFlowPane<S, N>, HasPrefWrapLength<S, N>, HasRowValignment<S, N>, HasVgapFlowPane<S, N> {
}
