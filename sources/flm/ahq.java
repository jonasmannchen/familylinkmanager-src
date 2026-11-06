package flm;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahq {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        if (ahr.b != null && ahr.b.a == view) {
            ahr.a((ahr) null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ahr(view, charSequence);
            return;
        }
        if (ahr.c != null && ahr.c.a == view) {
            ahr.c.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
