package flm;

import android.database.DataSetObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aeu extends DataSetObserver {
    private final /* synthetic */ aeq a;

    aeu(aeq aeqVar) {
        this.a = aeqVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        if (this.a.s.isShowing()) {
            this.a.b();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.c();
    }
}
