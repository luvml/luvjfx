package luvjfx;

import javafx.scene.control.Accordion;
import luvjfx.cap.HasExpandedPane;

public interface AccordionCaps<S extends AccordionCaps<S, N>, N extends Accordion> extends ControlCaps<S, N>, HasExpandedPane<S, N> {
}
