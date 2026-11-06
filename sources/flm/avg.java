package flm;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class avg implements atr, ats {
    public final asw a;
    public avh b;
    private final boolean c;

    public avg(asw aswVar, boolean z) {
        this.a = aswVar;
        this.c = z;
    }

    @Override // flm.atr
    public final void a(Bundle bundle) {
        a();
        this.b.a(bundle);
    }

    @Override // flm.atr
    public final void a(int i) {
        a();
        this.b.a(i);
    }

    @Override // flm.ats
    public final void a(apx apxVar) {
        a();
        this.b.a(apxVar, this.a, this.c);
    }

    private final void a() {
        bdi.checkNotNull(this.b, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }
}
