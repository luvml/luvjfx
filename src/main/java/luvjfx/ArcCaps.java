package luvjfx;

import javafx.scene.shape.Arc;
import luvjfx.cap.HasCenterXArc;
import luvjfx.cap.HasCenterYArc;
import luvjfx.cap.HasLength;
import luvjfx.cap.HasRadiusXArc;
import luvjfx.cap.HasRadiusYArc;
import luvjfx.cap.HasStartAngle;
import luvjfx.cap.HasType;

public interface ArcCaps<S extends ArcCaps<S, N>, N extends Arc> extends ShapeCaps<S, N>, HasCenterXArc<S, N>, HasCenterYArc<S, N>, HasLength<S, N>, HasRadiusXArc<S, N>, HasRadiusYArc<S, N>, HasStartAngle<S, N>, HasType<S, N> {
}
