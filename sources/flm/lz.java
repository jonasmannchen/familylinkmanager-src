package flm;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lz implements Runnable {
    private final /* synthetic */ ly a;

    lz(ly lyVar) {
        this.a = lyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a.G() != null) {
            this.a.a.a((View) null);
            this.a.b.a(this.a.a, this.a.a.I(), 0, 0, false);
        }
    }
}
