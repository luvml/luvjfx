package luvjfx;

import javafx.scene.shape.Shape;
import luvjfx.cap.HasFill;
import luvjfx.cap.HasSmoothShape;
import luvjfx.cap.HasStroke;
import luvjfx.cap.HasStrokeDashOffset;
import luvjfx.cap.HasStrokeLineCap;
import luvjfx.cap.HasStrokeLineJoin;
import luvjfx.cap.HasStrokeMiterLimit;
import luvjfx.cap.HasStrokeType;
import luvjfx.cap.HasStrokeWidth;

public interface ShapeCaps<S extends ShapeCaps<S, N>, N extends Shape> extends NodeCaps<S, N>, HasFill<S, N>, HasSmoothShape<S, N>, HasStroke<S, N>, HasStrokeDashOffset<S, N>, HasStrokeLineCap<S, N>, HasStrokeLineJoin<S, N>, HasStrokeMiterLimit<S, N>, HasStrokeType<S, N>, HasStrokeWidth<S, N> {
}
