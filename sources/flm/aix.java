package flm;

import android.text.Spannable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aix {
    public static void a(Spannable spannable, Object obj, Object obj2) {
        int spanStart = spannable.getSpanStart(obj);
        int spanEnd = spannable.getSpanEnd(obj);
        spannable.removeSpan(obj);
        spannable.setSpan(obj2, spanStart, spanEnd, 0);
    }
}
