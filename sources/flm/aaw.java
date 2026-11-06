package flm;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aaw implements Runnable {
    private aaz a;
    private final /* synthetic */ aat b;

    public aaw(aat aatVar, aaz aazVar) {
        this.b = aatVar;
        this.a = aazVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.c != null) {
            zi ziVar = this.b.c;
            if (ziVar.b != null) {
                ziVar.b.a(ziVar);
            }
        }
        View view = (View) this.b.e;
        if (view != null && view.getWindowToken() != null && this.a.b()) {
            this.b.i = this.a;
        }
        this.b.k = null;
    }
}
