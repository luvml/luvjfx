package luvjfx;

import javafx.scene.control.Hyperlink;
import luvjfx.cap.HasVisited;

public interface HyperlinkCaps<S extends HyperlinkCaps<S, N>, N extends Hyperlink> extends ButtonBaseCaps<S, N>, HasVisited<S, N> {
}
