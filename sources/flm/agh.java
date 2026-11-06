package flm;

import android.support.v7.widget.RecyclerView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class agh extends afo {
    private final /* synthetic */ RecyclerView a;

    public agh(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // flm.afo
    public final void a() {
        this.a.a((String) null);
        this.a.C.f = true;
        this.a.c(true);
        if (!this.a.e.d()) {
            this.a.requestLayout();
        }
    }
}
