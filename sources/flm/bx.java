package flm;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bx implements bo {
    private static final String[] a = new String[0];
    private final SQLiteDatabase b;

    bx(SQLiteDatabase sQLiteDatabase) {
        this.b = sQLiteDatabase;
    }

    @Override // flm.bo
    public final bw a(String str) {
        return new ce(this.b.compileStatement(str));
    }

    @Override // flm.bo
    public final void a() {
        this.b.beginTransaction();
    }

    @Override // flm.bo
    public final void b() {
        this.b.endTransaction();
    }

    @Override // flm.bo
    public final void c() {
        this.b.setTransactionSuccessful();
    }

    @Override // flm.bo
    public final boolean d() {
        return this.b.inTransaction();
    }

    @Override // flm.bo
    public final Cursor b(String str) {
        return a(new bn(str));
    }

    @Override // flm.bo
    public final Cursor a(bv bvVar) {
        return this.b.rawQueryWithFactory(new by(this, bvVar), bvVar.a(), a, null);
    }

    @Override // flm.bo
    public final void c(String str) {
        this.b.execSQL(str);
    }

    @Override // flm.bo
    public final boolean e() {
        return this.b.isOpen();
    }

    @Override // flm.bo
    public final String f() {
        return this.b.getPath();
    }

    @Override // flm.bo
    public final List g() {
        return this.b.getAttachedDbs();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    static {
        String[] strArr = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    }
}
