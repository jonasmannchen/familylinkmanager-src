package flm;

import android.content.ContextWrapper;
import android.graphics.Typeface;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aiu extends ClickableSpan {
    private static final Typeface a = Typeface.create("sans-serif-medium", 0);

    public aiu(String str) {
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        boolean z;
        aiv aivVar;
        boolean zA = view instanceof aiw ? ((aiw) view).a(this) : false;
        if (zA) {
            z = zA;
        } else {
            Object context = view.getContext();
            while (true) {
                if (context instanceof aiv) {
                    aivVar = (aiv) context;
                    break;
                } else if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    aivVar = null;
                    break;
                }
            }
            if (aivVar != null) {
                aivVar.a();
                z = true;
            } else {
                z = zA;
            }
        }
        if (z) {
            view.cancelPendingInputEvents();
        } else {
            Log.w("LinkSpan", "Dropping click event. No listener attached.");
        }
        if (view instanceof TextView) {
            CharSequence text = ((TextView) view).getText();
            if (text instanceof Spannable) {
                Selection.setSelection((Spannable) text, 0);
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setTypeface(a);
    }
}
