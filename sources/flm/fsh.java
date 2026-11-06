package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fsh {
    public final Object a;
    private final String b;

    fsh(String str) {
        this(str, null);
    }

    private fsh(String str, Object obj) {
        this.b = (String) fsc.a(str, "name");
        this.a = null;
    }

    public final String toString() {
        return this.b;
    }
}
