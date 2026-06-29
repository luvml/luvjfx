package luvjfx;

import java.lang.Override;
import javafx.scene.image.ImageView;

public final class FxImageView implements ImageViewCaps<FxImageView, ImageView> {
  public final ImageView node;

  FxImageView(ImageView node) {
    this.node = node;
  }

  @Override
  public ImageView node() {
    return node;
  }
}
