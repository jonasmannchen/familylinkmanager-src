package flm;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gkh implements gjy {
    private final gud a;
    private final boolean b;
    private final guc c = new guc();
    private final gkc d = new gkc(this.c);
    private int e = 16384;
    private boolean f;

    gkh(gud gudVar, boolean z) {
        this.a = gudVar;
        this.b = z;
    }

    @Override // flm.gjy
    public final synchronized void b() {
        if (this.f) {
            throw new IOException("closed");
        }
        this.a.flush();
    }

    @Override // flm.gjy
    public final synchronized void a(gkk gkkVar) {
        if (this.f) {
            throw new IOException("closed");
        }
        int i = this.e;
        if ((gkkVar.a & 32) != 0) {
            i = gkkVar.d[5];
        }
        this.e = i;
        a(0, 0, (byte) 4, (byte) 1);
        this.a.flush();
    }

    @Override // flm.gjy
    public final synchronized void a() {
        if (this.f) {
            throw new IOException("closed");
        }
        if (this.b) {
            if (gkd.a.isLoggable(Level.FINE)) {
                gkd.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "connectionPreface", String.format(">> CONNECTION %s", gkd.b.c()));
            }
            this.a.a(gkd.b.f());
            this.a.flush();
        }
    }

    @Override // flm.gjy
    public final synchronized void a(boolean z, boolean z2, int i, int i2, List list) {
        try {
            if (z2) {
                throw new UnsupportedOperationException();
            }
            if (this.f) {
                throw new IOException("closed");
            }
            if (this.f) {
                throw new IOException("closed");
            }
            gkc gkcVar = this.d;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                guf gufVarD = ((gjz) list.get(i3)).f.d();
                Integer num = (Integer) gka.b.get(gufVarD);
                if (num != null) {
                    gkcVar.a(num.intValue() + 1, 15, 0);
                    gkcVar.a(((gjz) list.get(i3)).g);
                } else {
                    guc gucVar = gkcVar.a;
                    gum gumVarA = gucVar.a(1);
                    byte[] bArr = gumVarA.a;
                    int i4 = gumVarA.c;
                    gumVarA.c = i4 + 1;
                    bArr[i4] = (byte) 0;
                    gucVar.c++;
                    gkcVar.a(gufVarD);
                    gkcVar.a(((gjz) list.get(i3)).g);
                }
            }
            long j = this.c.c;
            int iMin = (int) Math.min(this.e, j);
            byte b = j == ((long) iMin) ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            a(i, iMin, (byte) 1, b);
            this.a.a_(this.c, iMin);
            if (j > iMin) {
                long j2 = j - ((long) iMin);
                while (j2 > 0) {
                    int iMin2 = (int) Math.min(this.e, j2);
                    long j3 = j2 - ((long) iMin2);
                    a(i, iMin2, (byte) 9, j3 == 0 ? (byte) 4 : (byte) 0);
                    this.a.a_(this.c, iMin2);
                    j2 = j3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // flm.gjy
    public final synchronized void a(int i, gjv gjvVar) {
        if (this.f) {
            throw new IOException("closed");
        }
        if (gjvVar.n == -1) {
            throw new IllegalArgumentException();
        }
        a(i, 4, (byte) 3, (byte) 0);
        this.a.b(gjvVar.n);
        this.a.flush();
    }

    @Override // flm.gjy
    public final int c() {
        return this.e;
    }

    @Override // flm.gjy
    public final synchronized void a(boolean z, int i, guc gucVar, int i2) {
        synchronized (this) {
            if (this.f) {
                throw new IOException("closed");
            }
            a(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
            if (i2 > 0) {
                this.a.a_(gucVar, i2);
            }
        }
    }

    @Override // flm.gjy
    public final synchronized void b(gkk gkkVar) {
        int i;
        int i2 = 0;
        synchronized (this) {
            if (this.f) {
                throw new IOException("closed");
            }
            a(0, Integer.bitCount(gkkVar.a) * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (gkkVar.a(i2)) {
                    if (i2 == 4) {
                        i = 3;
                    } else {
                        i = i2 == 7 ? 4 : i2;
                    }
                    this.a.c(i);
                    this.a.b(gkkVar.d[i2]);
                }
                i2++;
            }
            this.a.flush();
        }
    }

    @Override // flm.gjy
    public final synchronized void a(boolean z, int i, int i2) {
        synchronized (this) {
            if (this.f) {
                throw new IOException("closed");
            }
            a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.a.b(i);
            this.a.b(i2);
            this.a.flush();
        }
    }

    @Override // flm.gjy
    public final synchronized void a(int i, gjv gjvVar, byte[] bArr) {
        if (this.f) {
            throw new IOException("closed");
        }
        if (gjvVar.n == -1) {
            throw gkd.a("errorCode.httpCode == -1", new Object[0]);
        }
        a(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.a.b(i);
        this.a.b(gjvVar.n);
        if (bArr.length > 0) {
            this.a.a(bArr);
        }
        this.a.flush();
    }

    @Override // flm.gjy
    public final synchronized void a(int i, long j) {
        if (this.f) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw gkd.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        }
        a(i, 4, (byte) 8, (byte) 0);
        this.a.b((int) j);
        this.a.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f = true;
        this.a.close();
    }

    private final void a(int i, int i2, byte b, byte b2) {
        if (gkd.a.isLoggable(Level.FINE)) {
            gkd.a.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$Writer", "frameHeader", gkf.a(false, i, i2, b, b2));
        }
        if (i2 > this.e) {
            throw gkd.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(this.e), Integer.valueOf(i2));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw gkd.a("reserved bit set: %s", Integer.valueOf(i));
        }
        gkd.a(this.a, i2);
        this.a.d(b & 255);
        this.a.d(b2 & 255);
        this.a.b(Integer.MAX_VALUE & i);
    }
}
