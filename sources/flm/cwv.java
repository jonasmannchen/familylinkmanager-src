package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cwv implements cuz {
    private final Status a;
    private final cxn b;

    public cwv(Status status, cxn cxnVar) {
        this.a = status;
        this.b = cxnVar;
    }

    @Override // flm.cuz
    public final cxn c() {
        return this.b;
    }

    @Override // flm.aty
    public final Status b() {
        return this.a;
    }

    @Override // flm.atv
    public final void a() {
        if (this.b != null) {
            this.b.a();
        }
    }
}
