package luvjfx;

import javafx.scene.text.Text;
import luvjfx.cap.HasBoundsType;
import luvjfx.cap.HasCaretBias;
import luvjfx.cap.HasCaretPosition;
import luvjfx.cap.HasFontSmoothingType;
import luvjfx.cap.HasFontText;
import luvjfx.cap.HasLineSpacingText;
import luvjfx.cap.HasSelectionEnd;
import luvjfx.cap.HasSelectionFill;
import luvjfx.cap.HasSelectionStart;
import luvjfx.cap.HasStrikethrough;
import luvjfx.cap.HasTabSize;
import luvjfx.cap.HasTextAlignmentText;
import luvjfx.cap.HasTextOrigin;
import luvjfx.cap.HasTextText;
import luvjfx.cap.HasUnderlineText;
import luvjfx.cap.HasWrappingWidth;
import luvjfx.cap.HasXText;
import luvjfx.cap.HasYText;

public interface TextCaps<S extends TextCaps<S, N>, N extends Text> extends ShapeCaps<S, N>, HasBoundsType<S, N>, HasCaretBias<S, N>, HasCaretPosition<S, N>, HasFontText<S, N>, HasFontSmoothingType<S, N>, HasLineSpacingText<S, N>, HasSelectionEnd<S, N>, HasSelectionFill<S, N>, HasSelectionStart<S, N>, HasStrikethrough<S, N>, HasTabSize<S, N>, HasTextText<S, N>, HasTextAlignmentText<S, N>, HasTextOrigin<S, N>, HasUnderlineText<S, N>, HasWrappingWidth<S, N>, HasXText<S, N>, HasYText<S, N> {
}
