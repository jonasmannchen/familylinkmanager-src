package flm;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class afh implements Runnable {
    private final /* synthetic */ RecyclerView a;

    public afh(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.y != null) {
            this.a.y.a();
        }
        this.a.H = false;
    }
}
