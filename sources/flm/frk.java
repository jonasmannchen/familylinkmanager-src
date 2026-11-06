package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class frk {
    public final Object a = null;
    private final String b;

    private frk(String str, Object obj) {
        this.b = str;
    }

    public final String toString() {
        return this.b;
    }

    public static frk a(String str) {
        dvl.a(str, "debugString");
        return new frk(str, null);
    }
}
