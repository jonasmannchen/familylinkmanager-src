package flm;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ach extends adx {
    private final /* synthetic */ acj c;
    private final /* synthetic */ acg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ach(acg acgVar, View view, acj acjVar) {
        super(view);
        this.d = acgVar;
        this.c = acjVar;
    }

    @Override // flm.adx
    public final aae a() {
        return this.c;
    }

    @Override // flm.adx
    public final boolean b() {
        if (!this.d.a.s.isShowing()) {
            this.d.a.b();
            return true;
        }
        return true;
    }
}
