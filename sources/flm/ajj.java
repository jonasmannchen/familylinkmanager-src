package flm;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ajj extends ur {
    private final Rect g;
    private final TextView h;

    ajj(TextView textView) {
        super(textView);
        this.g = new Rect();
        this.h = textView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.ur
    public final int a(float f, float f2) {
        int offsetForHorizontal;
        CharSequence text = this.h.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            TextView textView = this.h;
            if (textView.getLayout() == null) {
                offsetForHorizontal = -1;
            } else {
                offsetForHorizontal = textView.getLayout().getOffsetForHorizontal(textView.getLayout().getLineForVertical((int) (Math.min((textView.getHeight() - textView.getTotalPaddingBottom()) - 1, Math.max(0.0f, f2 - textView.getTotalPaddingTop())) + textView.getScrollY())), Math.min((textView.getWidth() - textView.getTotalPaddingRight()) - 1, Math.max(0.0f, f - textView.getTotalPaddingLeft())) + textView.getScrollX());
            }
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length == 1) {
                return spanned.getSpanStart(clickableSpanArr[0]);
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.ur
    public final void a(List list) {
        CharSequence text = this.h.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            for (ClickableSpan clickableSpan : (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class)) {
                list.add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.ur
    public final void a(int i, AccessibilityEvent accessibilityEvent) {
        ClickableSpan clickableSpanE = e(i);
        if (clickableSpanE != null) {
            accessibilityEvent.setContentDescription(a(clickableSpanE));
        } else {
            Log.e("LinkAccessibilityHelper", new StringBuilder(40).append("LinkSpan is null for offset: ").append(i).toString());
            accessibilityEvent.setContentDescription(this.h.getText());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.ur
    public final void a(int i, ua uaVar) {
        Layout layout;
        ClickableSpan clickableSpanE = e(i);
        if (clickableSpanE != null) {
            uaVar.c(a(clickableSpanE));
        } else {
            Log.e("LinkAccessibilityHelper", new StringBuilder(40).append("LinkSpan is null for offset: ").append(i).toString());
            uaVar.c(this.h.getText());
        }
        uaVar.b(true);
        uaVar.a.setClickable(true);
        Rect rect = this.g;
        CharSequence text = this.h.getText();
        rect.setEmpty();
        if ((text instanceof Spanned) && (layout = this.h.getLayout()) != null) {
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(clickableSpanE);
            int spanEnd = spanned.getSpanEnd(clickableSpanE);
            float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            layout.getLineBounds(lineForOffset, rect);
            if (lineForOffset2 == lineForOffset) {
                rect.left = (int) Math.min(primaryHorizontal, primaryHorizontal2);
                rect.right = (int) Math.max(primaryHorizontal, primaryHorizontal2);
            } else if (layout.getParagraphDirection(lineForOffset) == -1) {
                rect.right = (int) primaryHorizontal;
            } else {
                rect.left = (int) primaryHorizontal;
            }
            rect.offset(this.h.getTotalPaddingLeft(), this.h.getTotalPaddingTop());
        }
        if (this.g.isEmpty()) {
            Log.e("LinkAccessibilityHelper", new StringBuilder(41).append("LinkSpan bounds is empty for: ").append(i).toString());
            this.g.set(0, 0, 1, 1);
        }
        uaVar.b(this.g);
        uaVar.a(16);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.ur
    public final boolean b(int i, int i2) {
        if (i2 == 16) {
            ClickableSpan clickableSpanE = e(i);
            if (clickableSpanE != null) {
                clickableSpanE.onClick(this.h);
                return true;
            }
            Log.e("LinkAccessibilityHelper", new StringBuilder(40).append("LinkSpan is null for offset: ").append(i).toString());
        }
        return false;
    }

    private final ClickableSpan e(int i) {
        CharSequence text = this.h.getText();
        if (text instanceof Spanned) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(i, i, ClickableSpan.class);
            if (clickableSpanArr.length == 1) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    private final CharSequence a(ClickableSpan clickableSpan) {
        CharSequence text = this.h.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            return spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
        }
        return text;
    }
}
