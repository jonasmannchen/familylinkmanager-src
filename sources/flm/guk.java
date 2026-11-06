package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class guk implements gud {
    private final guc a = new guc();
    private final gup b;
    private boolean c;

    guk(gup gupVar) {
        if (gupVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.b = gupVar;
    }

    @Override // flm.gup
    public final void a_(guc gucVar, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.a_(gucVar, j);
        a();
    }

    @Override // flm.gud
    public final gud a(String str) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        return a();
    }

    @Override // flm.gud
    public final gud a(byte[] bArr) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        return a();
    }

    @Override // flm.gud
    public final gud d(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        return a();
    }

    @Override // flm.gud
    public final gud c(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        return a();
    }

    @Override // flm.gud
    public final gud b(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        return a();
    }

    private final gud a() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        guc gucVar = this.a;
        long j = gucVar.c;
        if (j == 0) {
            j = 0;
        } else {
            gum gumVar = gucVar.b.g;
            if (gumVar.c < 8192 && gumVar.e) {
                j -= (long) (gumVar.c - gumVar.b);
            }
        }
        if (j > 0) {
            this.b.a_(this.a, j);
        }
        return this;
    }

    @Override // flm.gud, flm.gup, java.io.Flushable
    public final void flush() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (this.a.c > 0) {
            this.b.a_(this.a, this.a.c);
        }
        this.b.flush();
    }

    @Override // flm.gup, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        if (!this.c) {
            Throwable th = null;
            try {
                if (this.a.c > 0) {
                    this.b.a_(this.a, this.a.c);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.c = true;
            if (th != null) {
                gut.a(th);
            }
        }
    }

    public final String toString() {
        return "buffer(" + this.b + ")";
    }
}
