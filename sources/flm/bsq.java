package flm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsq {
    public static bsr a(Context context) {
        bsr bsrVar = new bsr();
        context.getApplicationContext().bindService(new Intent("com.google.android.gms.kids.service.START").setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.kids.chimera.KidsServiceProxy")).setData(new Uri.Builder().scheme("kids").opaquePart("v2").build()), bsrVar, 1);
        return bsrVar;
    }

    public static void a(Context context, bsr bsrVar) {
        context.getApplicationContext().unbindService(bsrVar);
    }
}
