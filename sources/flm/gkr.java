package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gkr extends gkt {
    private final long a;
    private final int b;

    public gkr(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // flm.gkt
    public final long a() {
        return this.a;
    }

    @Override // flm.gkt
    public final int b() {
        return this.b;
    }

    public final String toString() {
        long j = this.a;
        return new StringBuilder(58).append("Timestamp{seconds=").append(j).append(", nanos=").append(this.b).append("}").toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gkt)) {
            return false;
        }
        gkt gktVar = (gkt) obj;
        return this.a == gktVar.a() && this.b == gktVar.b();
    }

    public final int hashCode() {
        return ((((int) ((this.a >>> 32) ^ this.a)) ^ 1000003) * 1000003) ^ this.b;
    }
}
