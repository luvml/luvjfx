package luvjfx;

import javafx.scene.Node;

public final class FxAny<N extends Node> implements FxNodeOps<FxAny<N>, N> {
    public final N node;
    FxAny(N node) { this.node = node; }
    @Override public N node() { return node; }
}
