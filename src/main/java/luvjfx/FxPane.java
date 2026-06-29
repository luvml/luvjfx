package luvjfx;

import javafx.scene.Node;
import javafx.scene.layout.Pane;

public interface FxPane<S extends FxPane<S, N>, N extends Pane> extends FxNodeOps<S, N> {
    default S add(Node child)            { node().getChildren().add(child); return self(); }
    default S add(FxNodeOps<?, ?> child) { node().getChildren().add(child.node()); return self(); }

    default S nodes(FxNodeOps<?, ?>... children) {
        for (var c : children) node().getChildren().add(c.node());
        return self();
    }
}
