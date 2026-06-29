package luvjfx;

import javafx.scene.Parent;

public interface ParentCaps<S extends ParentCaps<S, N>, N extends Parent> extends NodeCaps<S, N> {
}
