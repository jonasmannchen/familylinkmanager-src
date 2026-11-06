package flm;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cs implements bu, bv {
    private static final TreeMap i = new TreeMap();
    public final int[] a;
    private volatile String b;
    private final long[] c;
    private final double[] d;
    private final String[] e;
    private final byte[][] f;
    private final int g;
    private int h;

    public static cs a(String str, int i2) {
        synchronized (i) {
            Map.Entry entryCeilingEntry = i.ceilingEntry(Integer.valueOf(i2));
            if (entryCeilingEntry == null) {
                cs csVar = new cs(i2);
                csVar.b(str, i2);
                return csVar;
            }
            i.remove(entryCeilingEntry.getKey());
            cs csVar2 = (cs) entryCeilingEntry.getValue();
            csVar2.b(str, i2);
            return csVar2;
        }
    }

    private cs(int i2) {
        this.g = i2;
        int i3 = i2 + 1;
        this.a = new int[i3];
        this.c = new long[i3];
        this.d = new double[i3];
        this.e = new String[i3];
        this.f = new byte[i3][];
    }

    private final void b(String str, int i2) {
        this.b = str;
        this.h = i2;
    }

    public final void c() {
        synchronized (i) {
            i.put(Integer.valueOf(this.g), this);
            if (i.size() > 15) {
                int size = i.size() - 10;
                Iterator it = i.descendingKeySet().iterator();
                while (true) {
                    int i2 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i2;
                }
            }
        }
    }

    @Override // flm.bv
    public final String a() {
        return this.b;
    }

    @Override // flm.bv
    public final void a(bu buVar) {
        for (int i2 = 1; i2 <= this.h; i2++) {
            switch (this.a[i2]) {
                case 1:
                    buVar.a(i2);
                    break;
                case 2:
                    buVar.a(i2, this.c[i2]);
                    break;
                case 3:
                    buVar.a(i2, this.d[i2]);
                    break;
                case 4:
                    buVar.a(i2, this.e[i2]);
                    break;
                case 5:
                    buVar.a(i2, this.f[i2]);
                    break;
            }
        }
    }

    @Override // flm.bu
    public final void a(int i2) {
        this.a[i2] = 1;
    }

    @Override // flm.bu
    public final void a(int i2, long j) {
        this.a[i2] = 2;
        this.c[i2] = j;
    }

    @Override // flm.bu
    public final void a(int i2, double d) {
        this.a[i2] = 3;
        this.d[i2] = d;
    }

    @Override // flm.bu
    public final void a(int i2, String str) {
        this.a[i2] = 4;
        this.e[i2] = str;
    }

    @Override // flm.bu
    public final void a(int i2, byte[] bArr) {
        this.a[i2] = 5;
        this.f[i2] = bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // flm.bu
    public final void b() {
        Arrays.fill(this.a, 1);
        Arrays.fill(this.e, (Object) null);
        Arrays.fill(this.f, (Object) null);
        this.b = null;
    }
}
