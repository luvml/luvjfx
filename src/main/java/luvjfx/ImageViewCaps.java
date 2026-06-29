package luvjfx;

import javafx.scene.image.ImageView;
import luvjfx.cap.HasFitHeight;
import luvjfx.cap.HasFitWidth;
import luvjfx.cap.HasImage;
import luvjfx.cap.HasPreserveRatio;
import luvjfx.cap.HasSmoothImageView;
import luvjfx.cap.HasViewport;
import luvjfx.cap.HasXImageView;
import luvjfx.cap.HasYImageView;

public interface ImageViewCaps<S extends ImageViewCaps<S, N>, N extends ImageView> extends NodeCaps<S, N>, HasFitHeight<S, N>, HasFitWidth<S, N>, HasImage<S, N>, HasPreserveRatio<S, N>, HasSmoothImageView<S, N>, HasViewport<S, N>, HasXImageView<S, N>, HasYImageView<S, N> {
}
