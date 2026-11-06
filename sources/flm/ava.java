package flm;

import android.app.Dialog;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ava extends axg {
    private final /* synthetic */ Dialog a;
    private final /* synthetic */ auz b;

    ava(auz auzVar, Dialog dialog) {
        this.b = auzVar;
        this.a = dialog;
    }

    @Override // flm.axg
    public final void a() {
        this.b.a.d();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
