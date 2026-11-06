package flm;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class cd implements bu {
    private final SQLiteProgram a;

    cd(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    @Override // flm.bu
    public final void a(int i) {
        this.a.bindNull(i);
    }

    @Override // flm.bu
    public final void a(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // flm.bu
    public final void a(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // flm.bu
    public final void a(int i, String str) {
        this.a.bindString(i, str);
    }

    @Override // flm.bu
    public final void a(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }

    @Override // flm.bu
    public final void b() {
        this.a.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }
}
