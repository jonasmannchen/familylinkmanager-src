package flm;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aer implements Runnable {
    private final /* synthetic */ aeq a;

    aer(aeq aeqVar) {
        this.a = aeqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.a.m;
        if (view == null || view.getWindowToken() == null) {
            return;
        }
        this.a.b();
    }
}
