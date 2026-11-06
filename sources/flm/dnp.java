package flm;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnp extends dnt {
    public static dnp a;
    public int[] b;
    public int[] c;
    public int[] d;
    public int[] e;
    public int f;
    public dnp g;
    public int h;
    public int i;
    public int j;
    private final int u;

    public dnp(int i, int i2) {
        super(i);
        this.h = -1;
        this.u = i2;
    }

    @Override // flm.dnt
    public final int a(dod dodVar) {
        return this.b.length;
    }

    @Override // flm.dnt
    public final int a(dod dodVar, int i) {
        return this.b[i];
    }

    @Override // flm.dnt
    public final String b(dod dodVar, int i) {
        return dodVar.a(this.c[i]);
    }

    @Override // flm.dnt
    public final String c(dod dodVar, int i) {
        if (i < 0 || i >= this.b.length) {
            String strValueOf = String.valueOf(c(dodVar));
            return strValueOf.length() != 0 ? "static ".concat(strValueOf) : new String("static ");
        }
        String strC = c(dodVar);
        String strB = b(dodVar, i);
        return new StringBuilder(String.valueOf(strC).length() + 8 + String.valueOf(strB).length()).append("static ").append(strC).append("#").append(strB).toString();
    }

    @Override // flm.dnt
    public final int b(dod dodVar) {
        return this.j + a.i;
    }

    final String d(dod dodVar, int i) {
        String strA;
        while (true) {
            int i2 = this.h;
            if (i < 0 || i >= i2) {
                if (i < 0) {
                    strA = dse.a("%s (%s) must not be negative", "index", Integer.valueOf(i));
                } else {
                    if (i2 < 0) {
                        throw new IllegalArgumentException(new StringBuilder(26).append("negative size: ").append(i2).toString());
                    }
                    strA = dse.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
                }
                throw new IndexOutOfBoundsException(strA);
            }
            if (i < this.d.length) {
                return dodVar.a(this.d[i]);
            }
            dnp dnpVar = this.g;
            i -= this.d.length;
            this = dnpVar;
        }
    }

    final dnp a(int i) {
        String strA;
        while (true) {
            int i2 = this.h;
            if (i < 0 || i >= i2) {
                if (i < 0) {
                    strA = dse.a("%s (%s) must not be negative", "index", Integer.valueOf(i));
                } else {
                    if (i2 < 0) {
                        throw new IllegalArgumentException(new StringBuilder(26).append("negative size: ").append(i2).toString());
                    }
                    strA = dse.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
                }
                throw new IndexOutOfBoundsException(strA);
            }
            if (i < this.d.length) {
                return this;
            }
            dnp dnpVar = this.g;
            i -= this.d.length;
            this = dnpVar;
        }
    }

    final void c() {
        if (this.h == -1) {
            this.h = this.d.length;
            if (this.g != null) {
                this.g.c();
                this.h += this.g.h;
                if ((this.g.o & 2) != 0) {
                    this.o |= 2;
                }
            }
        }
    }

    public final String c(dod dodVar) {
        return dodVar.a(this.u);
    }

    final int a(dod dodVar, int i, int i2) {
        while (i2 >= this.d.length) {
            dnp dnpVar = this.g;
            i += this.f;
            i2 -= this.d.length;
            this = dnpVar;
        }
        return dodVar.d(this.e[i2] + i);
    }

    static void d(dod dodVar) {
        ByteBuffer byteBuffer = dodVar.a;
        int i = 65535 & byteBuffer.getShort();
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.getShort();
            dodVar.c(dodVar.b(byteBuffer.get()));
        }
    }
}
