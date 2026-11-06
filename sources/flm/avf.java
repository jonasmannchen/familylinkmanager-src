package flm;

import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class avf implements Runnable {
    private final /* synthetic */ LifecycleCallback a;
    private final /* synthetic */ String b;
    private final /* synthetic */ ave c;

    avf(ave aveVar, LifecycleCallback lifecycleCallback, String str) {
        this.c = aveVar;
        this.a = lifecycleCallback;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.a > 0) {
            this.a.a(this.c.b != null ? this.c.b.getBundle(this.b) : null);
        }
        if (this.c.a >= 2) {
            this.a.a();
        }
        if (this.c.a >= 3) {
            this.a.e();
        }
        if (this.c.a >= 4) {
            this.a.b();
        }
        int i = this.c.a;
    }
}
