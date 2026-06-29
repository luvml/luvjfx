package luvjfx;

import java.util.function.Consumer;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;

public interface FxNodeOps<S extends FxNodeOps<S, N>, N extends Node> extends Consumer<FxPane<?, ?>> {
    N node();

    @SuppressWarnings("unchecked") default S self() { return (S) this; }

    @Override default void accept(FxPane<?, ?> parent) { parent.node().getChildren().add(node()); }

    default S id(String v)            { node().setId(v); return self(); }
    default S styleClass(String... c) { node().getStyleClass().addAll(c); return self(); }
    default S style(String css)       { node().setStyle(css); return self(); }
    default S disable(boolean v)      { node().setDisable(v); return self(); }
    default S visible(boolean v)      { node().setVisible(v); return self(); }
    default S opacity(double v)       { node().setOpacity(v); return self(); }
    default S attr(Consumer<? super N> cfg) { cfg.accept(node()); return self(); }

    default S disable(ObservableValue<? extends Boolean> v) { node().disableProperty().bind(v); return self(); }
    default S visible(ObservableValue<? extends Boolean> v) { node().visibleProperty().bind(v); return self(); }
    default S opacity(ObservableValue<? extends Number> v)  { node().opacityProperty().bind(v); return self(); }
}
