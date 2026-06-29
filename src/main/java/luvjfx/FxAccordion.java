package luvjfx;

import java.lang.Override;
import javafx.scene.control.Accordion;

public final class FxAccordion implements AccordionCaps<FxAccordion, Accordion> {
  public final Accordion node;

  FxAccordion(Accordion node) {
    this.node = node;
  }

  @Override
  public Accordion node() {
    return node;
  }
}
