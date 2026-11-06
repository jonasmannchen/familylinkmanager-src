package flm;

import android.view.Menu;
import android.view.Window;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class wr implements zz {
    private final /* synthetic */ wb a;

    wr(wb wbVar) {
        this.a = wbVar;
    }

    @Override // flm.zz
    public final void a(zi ziVar, boolean z) {
        zi ziVarL = ziVar.l();
        boolean z2 = ziVarL != ziVar;
        wb wbVar = this.a;
        if (z2) {
            ziVar = ziVarL;
        }
        wq wqVarA = wbVar.a((Menu) ziVar);
        if (wqVarA != null) {
            if (z2) {
                this.a.a(wqVarA.a, wqVarA, ziVarL);
                this.a.a(wqVarA, true);
            } else {
                this.a.a(wqVarA, z);
            }
        }
    }

    @Override // flm.zz
    public final boolean a(zi ziVar) {
        Window.Callback callback;
        if (ziVar == null && this.a.l && (callback = this.a.c.getCallback()) != null && !this.a.n) {
            callback.onMenuOpened(108, ziVar);
            return true;
        }
        return true;
    }
}
