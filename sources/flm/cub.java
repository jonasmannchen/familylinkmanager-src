package flm;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cub implements ctg {
    private final Status a;
    private final long b;

    public cub(Status status, long j) {
        this.a = status;
        this.b = j;
    }

    @Override // flm.aty
    public final Status b() {
        return this.a;
    }

    @Override // flm.ctg
    public final long a() {
        return this.b;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(strValueOf).length() + 68).append("ReportingUploadResultImpl{mStatus=").append(strValueOf).append(", mRequestId=").append(this.b).append('}').toString();
    }
}
