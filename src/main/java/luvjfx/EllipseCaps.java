package luvjfx;

import javafx.scene.shape.Ellipse;
import luvjfx.cap.HasCenterXEllipse;
import luvjfx.cap.HasCenterYEllipse;
import luvjfx.cap.HasRadiusXEllipse;
import luvjfx.cap.HasRadiusYEllipse;

public interface EllipseCaps<S extends EllipseCaps<S, N>, N extends Ellipse> extends ShapeCaps<S, N>, HasCenterXEllipse<S, N>, HasCenterYEllipse<S, N>, HasRadiusXEllipse<S, N>, HasRadiusYEllipse<S, N> {
}
