package flm;

import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aay extends adx {
    private final /* synthetic */ aax c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aay(aax aaxVar, View view, aat aatVar) {
        super(view);
        this.c = aaxVar;
    }

    @Override // flm.adx
    public final aae a() {
        if (this.c.a.i == null) {
            return null;
        }
        return this.c.a.i.a();
    }

    @Override // flm.adx
    public final boolean b() {
        this.c.a.b();
        return true;
    }

    @Override // flm.adx
    public final boolean c() {
        if (this.c.a.k != null) {
            return false;
        }
        this.c.a.c();
        return true;
    }
}
