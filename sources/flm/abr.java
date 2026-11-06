package flm;

import android.graphics.PorterDuff;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class abr extends sb {
    public abr(int i) {
        super(6);
    }

    static int a(int i, PorterDuff.Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }
}
