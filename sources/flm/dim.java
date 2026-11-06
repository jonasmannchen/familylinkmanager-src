package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dim {
    private final String a;

    dim(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }

    public static String a(dim dimVar) {
        if (dimVar == null) {
            return null;
        }
        return dimVar.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dim) {
            return this.a.equals(((dim) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
