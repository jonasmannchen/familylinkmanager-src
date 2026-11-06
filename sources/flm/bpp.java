package flm;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bpp {
    public static String a(Context context) {
        return context.getSharedPreferences("com.google.android.gcm", 4).getString("regId", null);
    }
}
