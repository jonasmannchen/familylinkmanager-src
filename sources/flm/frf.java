package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class frf {
    private final String a;

    private frf(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }

    public static frf a(String str) {
        return new frf(str);
    }
}
