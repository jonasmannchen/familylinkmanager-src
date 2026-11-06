package flm;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class afg implements Runnable {
    private final /* synthetic */ RecyclerView a;

    public afg(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a.q || this.a.isLayoutRequested()) {
            return;
        }
        if (!this.a.p) {
            this.a.requestLayout();
        } else if (this.a.s) {
            this.a.r = true;
        } else {
            this.a.c();
        }
    }
}
