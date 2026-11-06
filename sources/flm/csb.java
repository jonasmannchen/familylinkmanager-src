package flm;

import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class csb implements ctb {
    private final /* synthetic */ csa a;

    csb(csa csaVar) {
        this.a = csaVar;
    }

    @Override // flm.ctb
    public final void a() {
        this.a.checkConnected();
    }

    @Override // flm.ctb
    public final /* synthetic */ IInterface b() {
        return (csn) this.a.getService();
    }
}
