package flm;

import java.io.EOFException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gul implements gue {
    private final guc a = new guc();
    private final guq b;
    private boolean c;

    gul(guq guqVar) {
        if (guqVar == null) {
            throw new NullPointerException("source == null");
        }
        this.b = guqVar;
    }

    @Override // flm.gue
    public final guc a() {
        return this.a;
    }

    @Override // flm.guq
    public final long a(guc gucVar, long j) {
        if (gucVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (this.a.c == 0 && this.b.a(this.a, 8192L) == -1) {
            return -1L;
        }
        return this.a.a(gucVar, Math.min(j, this.a.c));
    }

    @Override // flm.gue
    public final boolean b() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        return this.a.b() && this.b.a(this.a, 8192L) == -1;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a A[RETURN] */
    @Override // flm.gue
    public final void a(long j) throws EOFException {
        boolean z;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (this.a.c < j) {
            if (this.b.a(this.a, 8192L) == -1) {
                z = false;
                if (!z) {
                    throw new EOFException();
                }
            }
        }
        z = true;
        if (!z) {
            throw new EOFException();
        }
    }

    @Override // flm.gue
    public final byte c() throws EOFException {
        a(1L);
        return this.a.c();
    }

    @Override // flm.gue
    public final guf c(long j) throws EOFException {
        a(j);
        return this.a.c(j);
    }

    @Override // flm.gue
    public final byte[] e(long j) throws EOFException {
        a(j);
        return this.a.e(j);
    }

    @Override // flm.gue
    public final short d() throws EOFException {
        a(2L);
        return this.a.d();
    }

    @Override // flm.gue
    public final int e() throws EOFException {
        a(4L);
        return this.a.e();
    }

    @Override // flm.gue
    public final void f(long j) throws EOFException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (this.a.c == 0 && this.b.a(this.a, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, this.a.c);
            this.a.f(jMin);
            j -= jMin;
        }
    }

    @Override // flm.guq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.c) {
            this.c = true;
            this.b.close();
            this.a.i();
        }
    }

    public final String toString() {
        return "buffer(" + this.b + ")";
    }
}
