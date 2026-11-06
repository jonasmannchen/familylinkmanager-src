package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fne {
    public static final int[] a = new int[0];
    public static final long[] b = new long[0];
    public static final String[] c = new String[0];
    public static final byte[] d = new byte[0];

    public static final int a(fms fmsVar, int i) throws fna {
        int i2 = 1;
        int i3 = fmsVar.i();
        fmsVar.b(i);
        while (fmsVar.a() == i) {
            fmsVar.b(i);
            i2++;
        }
        fmsVar.a(i3, i);
        return i2;
    }
}
