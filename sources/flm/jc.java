package flm;

import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jc extends jx {
    private boolean a = false;
    private final /* synthetic */ ViewGroup b;

    jc(iu iuVar, ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // flm.jx, flm.jw
    public final void a(jq jqVar) {
        kk.a(this.b, false);
        jqVar.b(this);
    }

    @Override // flm.jx, flm.jw
    public final void a() {
        kk.a(this.b, false);
    }

    @Override // flm.jx, flm.jw
    public final void b() {
        kk.a(this.b, true);
    }
}
