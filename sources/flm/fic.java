package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fic {
    private final Object a;
    private final int b;

    fic(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fic)) {
            return false;
        }
        fic ficVar = (fic) obj;
        return this.a == ficVar.a && this.b == ficVar.b;
    }
}
