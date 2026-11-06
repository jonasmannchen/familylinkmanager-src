package flm;

import android.text.SpannableString;
import android.text.style.BulletSpan;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class coh {
    public static SpannableString a(CharSequence charSequence, int i) {
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new BulletSpan(60, i), 0, charSequence.length(), 0);
        return spannableString;
    }
}
