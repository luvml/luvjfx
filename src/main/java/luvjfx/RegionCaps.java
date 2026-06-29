package luvjfx;

import javafx.scene.layout.Region;
import luvjfx.cap.HasBackground;
import luvjfx.cap.HasBorder;
import luvjfx.cap.HasCacheShape;
import luvjfx.cap.HasCenterShape;
import luvjfx.cap.HasMaxHeight;
import luvjfx.cap.HasMaxWidth;
import luvjfx.cap.HasMinHeight;
import luvjfx.cap.HasMinWidth;
import luvjfx.cap.HasOpaqueInsets;
import luvjfx.cap.HasPadding;
import luvjfx.cap.HasPrefHeight;
import luvjfx.cap.HasPrefWidth;
import luvjfx.cap.HasScaleShape;
import luvjfx.cap.HasShape;
import luvjfx.cap.HasSnapToPixel;

public interface RegionCaps<S extends RegionCaps<S, N>, N extends Region> extends ParentCaps<S, N>, HasBackground<S, N>, HasBorder<S, N>, HasCacheShape<S, N>, HasCenterShape<S, N>, HasMaxHeight<S, N>, HasMaxWidth<S, N>, HasMinHeight<S, N>, HasMinWidth<S, N>, HasOpaqueInsets<S, N>, HasPadding<S, N>, HasPrefHeight<S, N>, HasPrefWidth<S, N>, HasScaleShape<S, N>, HasShape<S, N>, HasSnapToPixel<S, N> {
}
