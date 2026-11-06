package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class eeq {
    private static final char[] a = "0123456789abcdef".toCharArray();

    eeq() {
    }

    public abstract int a();

    abstract boolean a(eeq eeqVar);

    public abstract int b();

    public abstract byte[] c();

    public static eeq a(int i) {
        return new eer(i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eeq)) {
            return false;
        }
        eeq eeqVar = (eeq) obj;
        a();
        eeqVar.a();
        return a(eeqVar);
    }

    public final int hashCode() {
        a();
        return b();
    }

    public final String toString() {
        byte[] bArrC = c();
        StringBuilder sb = new StringBuilder(bArrC.length * 2);
        for (byte b : bArrC) {
            sb.append(a[(b >> 4) & 15]).append(a[b & 15]);
        }
        return sb.toString();
    }
}
