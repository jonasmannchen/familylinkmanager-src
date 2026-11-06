package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cua implements ctf {
    private final Status a;
    private final ctl b;

    public cua(Status status, ctl ctlVar) {
        this.a = status;
        if (status.h == 0) {
            bdi.checkNotNull(ctlVar);
        }
        this.b = ctlVar;
    }

    @Override // flm.aty
    public final Status b() {
        return this.a;
    }

    @Override // flm.ctf
    public final boolean a() {
        d();
        return this.b.d;
    }

    @Override // flm.ctf
    public final boolean c() {
        d();
        ctl ctlVar = this.b;
        return cth.a(ctlVar.a) && cth.a(ctlVar.b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(strValueOf).length() + 52 + String.valueOf(strValueOf2).length()).append("ReportingStateResultImpl{mStatus=").append(strValueOf).append(", mReportingState=").append(strValueOf2).append('}').toString();
    }

    private final void d() {
        if (this.a.h != 0) {
            String strValueOf = String.valueOf(this.a);
            throw new IllegalStateException(new StringBuilder(String.valueOf(strValueOf).length() + 52).append("Illegal to call this method when status is failure: ").append(strValueOf).toString());
        }
    }
}
