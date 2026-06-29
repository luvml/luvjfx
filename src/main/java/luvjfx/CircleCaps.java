package luvjfx;

import javafx.scene.shape.Circle;
import luvjfx.cap.HasCenterXCircle;
import luvjfx.cap.HasCenterYCircle;
import luvjfx.cap.HasRadius;

public interface CircleCaps<S extends CircleCaps<S, N>, N extends Circle> extends ShapeCaps<S, N>, HasCenterXCircle<S, N>, HasCenterYCircle<S, N>, HasRadius<S, N> {
}
