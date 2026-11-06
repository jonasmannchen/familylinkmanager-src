package flm;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfi {
    private static final boolean a = bav.APK_IS_DEBUG_APK;
    private static ayt b = null;

    static ayt a() {
        if (b == null) {
            b = ayt.a();
        }
        return b;
    }

    static int b() {
        int iA = bil.a((Context) a());
        if (iA == -1) {
            return 7;
        }
        return iA;
    }

    public static int a(int i) {
        return (b() << 28) | i;
    }
}
