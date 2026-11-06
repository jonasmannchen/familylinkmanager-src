package flm;

import android.view.Window;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class wj implements zz {
    private final /* synthetic */ wb a;

    wj(wb wbVar) {
        this.a = wbVar;
    }

    @Override // flm.zz
    public final boolean a(zi ziVar) {
        Window.Callback callback = this.a.c.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, ziVar);
            return true;
        }
        return true;
    }

    @Override // flm.zz
    public final void a(zi ziVar, boolean z) {
        this.a.b(ziVar);
    }
}
