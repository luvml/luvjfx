package luvjfx;

import java.lang.Override;
import javafx.scene.layout.FlowPane;

public final class FxFlowPane implements FlowPaneCaps<FxFlowPane, FlowPane>, FxPane<FxFlowPane, FlowPane> {
  public final FlowPane node;

  FxFlowPane(FlowPane node) {
    this.node = node;
  }

  @Override
  public FlowPane node() {
    return node;
  }
}
