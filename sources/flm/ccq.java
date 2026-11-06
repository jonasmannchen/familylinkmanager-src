package flm;

import android.app.ActivityManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ccq implements ActivityManager.OnUidImportanceListener {
    private final /* synthetic */ cco a;

    ccq(cco ccoVar) {
        this.a = ccoVar;
    }

    public final void onUidImportance(int i, int i2) {
        btv.a("TimeLimit", "Observer:observing callback:%s, %s", Integer.valueOf(i), Integer.valueOf(i2));
        this.a.b();
    }
}
