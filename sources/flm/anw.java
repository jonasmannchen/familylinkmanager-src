package flm;

import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class anw {
    public static Context a;

    public static synchronized void a(Context context) {
        if (a == null) {
            a = context;
        } else {
            Log.e("DynamiteAppCtx", "Duplicated init of DynamiteApplicationContext");
        }
    }
}
