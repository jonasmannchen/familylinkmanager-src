package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class fws implements gez {
    @Override // flm.gez, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    protected final void a(int i) {
        if (a() < i) {
            throw new IndexOutOfBoundsException();
        }
    }
}
