package flm;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ftv {
    public static final ftz a;
    public byte[][] b;
    public int c;

    ftv(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    private ftv(int i, byte[]... bArr) {
        this.c = i;
        this.b = bArr;
    }

    private final byte[] a(int i) {
        return this.b[i << 1];
    }

    private final void a(int i, byte[] bArr) {
        this.b[i << 1] = bArr;
    }

    private final byte[] b(int i) {
        return this.b[(i << 1) + 1];
    }

    private final void b(int i, byte[] bArr) {
        this.b[(i << 1) + 1] = bArr;
    }

    final int a() {
        if (this.b != null) {
            return this.b.length;
        }
        return 0;
    }

    private final boolean b() {
        return this.c == 0;
    }

    public ftv() {
    }

    public final Object a(fuc fucVar) {
        for (int i = this.c - 1; i >= 0; i--) {
            if (Arrays.equals(fucVar.b, a(i))) {
                return fucVar.a(b(i));
            }
        }
        return null;
    }

    public final void a(fuc fucVar, Object obj) {
        dvl.a(fucVar, "key");
        dvl.a(obj, "value");
        if ((this.c << 1) == 0 || (this.c << 1) == a()) {
            c(Math.max((this.c << 1) << 1, 8));
        }
        a(this.c, fucVar.b);
        b(this.c, fucVar.a(obj));
        this.c++;
    }

    private final void c(int i) {
        byte[][] bArr = new byte[i][];
        if (!b()) {
            System.arraycopy(this.b, 0, bArr, 0, this.c << 1);
        }
        this.b = bArr;
    }

    public final void b(fuc fucVar) {
        if (!b()) {
            int i = 0;
            for (int i2 = 0; i2 < this.c; i2++) {
                if (!Arrays.equals(fucVar.b, a(i2))) {
                    a(i, a(i2));
                    b(i, b(i2));
                    i++;
                }
            }
            Arrays.fill(this.b, i << 1, this.c << 1, (Object) null);
            this.c = i;
        }
    }

    public final void a(ftv ftvVar) {
        if (!ftvVar.b()) {
            int iA = a() - (this.c << 1);
            if (b() || iA < (ftvVar.c << 1)) {
                c((this.c << 1) + (ftvVar.c << 1));
            }
            System.arraycopy(ftvVar.b, 0, this.b, this.c << 1, ftvVar.c << 1);
            this.c += ftvVar.c;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.c; i++) {
            if (i != 0) {
                sb.append(',');
            }
            String str = new String(a(i), dva.a);
            sb.append(str).append('=');
            if (str.endsWith("-bin")) {
                sb.append(eex.a.a(b(i)));
            } else {
                sb.append(new String(b(i), dva.a));
            }
        }
        return sb.append(')').toString();
    }

    static {
        new ftw();
        a = new ftx();
    }
}
