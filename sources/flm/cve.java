package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cve implements ata {
    public final int a;

    public cve(cvf cvfVar) {
        this.a = cvfVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof cve) && this.a == ((cve) obj).a;
    }

    public final int hashCode() {
        return bcx.hashCode(Integer.valueOf(this.a));
    }
}
