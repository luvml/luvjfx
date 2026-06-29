package luvjfx;

import javafx.scene.control.Labeled;
import luvjfx.cap.HasAlignmentLabeled;
import luvjfx.cap.HasContentDisplay;
import luvjfx.cap.HasEllipsisString;
import luvjfx.cap.HasFontLabeled;
import luvjfx.cap.HasGraphic;
import luvjfx.cap.HasGraphicTextGap;
import luvjfx.cap.HasLineSpacingLabeled;
import luvjfx.cap.HasMnemonicParsing;
import luvjfx.cap.HasTextAlignmentLabeled;
import luvjfx.cap.HasTextFill;
import luvjfx.cap.HasTextLabeled;
import luvjfx.cap.HasTextOverrun;
import luvjfx.cap.HasUnderlineLabeled;
import luvjfx.cap.HasWrapTextLabeled;

public interface LabeledCaps<S extends LabeledCaps<S, N>, N extends Labeled> extends ControlCaps<S, N>, HasAlignmentLabeled<S, N>, HasContentDisplay<S, N>, HasEllipsisString<S, N>, HasFontLabeled<S, N>, HasGraphic<S, N>, HasGraphicTextGap<S, N>, HasLineSpacingLabeled<S, N>, HasMnemonicParsing<S, N>, HasTextLabeled<S, N>, HasTextAlignmentLabeled<S, N>, HasTextFill<S, N>, HasTextOverrun<S, N>, HasUnderlineLabeled<S, N>, HasWrapTextLabeled<S, N> {
}
