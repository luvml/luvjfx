package luvjfx;

import javafx.scene.control.ScrollPane;
import luvjfx.cap.HasContentScrollPane;
import luvjfx.cap.HasFitToHeight;
import luvjfx.cap.HasFitToWidth;
import luvjfx.cap.HasHbarPolicy;
import luvjfx.cap.HasHmax;
import luvjfx.cap.HasHmin;
import luvjfx.cap.HasHvalue;
import luvjfx.cap.HasMinViewportHeight;
import luvjfx.cap.HasMinViewportWidth;
import luvjfx.cap.HasPannable;
import luvjfx.cap.HasPrefViewportHeight;
import luvjfx.cap.HasPrefViewportWidth;
import luvjfx.cap.HasVbarPolicy;
import luvjfx.cap.HasViewportBounds;
import luvjfx.cap.HasVmax;
import luvjfx.cap.HasVmin;
import luvjfx.cap.HasVvalue;

public interface ScrollPaneCaps<S extends ScrollPaneCaps<S, N>, N extends ScrollPane> extends ControlCaps<S, N>, HasContentScrollPane<S, N>, HasFitToHeight<S, N>, HasFitToWidth<S, N>, HasHbarPolicy<S, N>, HasHmax<S, N>, HasHmin<S, N>, HasHvalue<S, N>, HasMinViewportHeight<S, N>, HasMinViewportWidth<S, N>, HasPannable<S, N>, HasPrefViewportHeight<S, N>, HasPrefViewportWidth<S, N>, HasVbarPolicy<S, N>, HasViewportBounds<S, N>, HasVmax<S, N>, HasVmin<S, N>, HasVvalue<S, N> {
}
