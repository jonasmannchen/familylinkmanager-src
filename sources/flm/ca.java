package flm;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ca extends SQLiteOpenHelper {
    private final bx[] a;
    private final bq b;

    ca(Context context, String str, bx[] bxVarArr, bq bqVar) {
        super(context, str, null, bqVar.a, new cb(bxVarArr, bqVar));
        this.b = bqVar;
        this.a = bxVarArr;
    }

    final bo a() {
        return a(super.getWritableDatabase());
    }

    private final bx a(SQLiteDatabase sQLiteDatabase) {
        if (this.a[0] == null) {
            this.a[0] = new bx(sQLiteDatabase);
        }
        return this.a[0];
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.b.a(a(sQLiteDatabase));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.b.a(a(sQLiteDatabase), i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.b.b(a(sQLiteDatabase), i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        this.b.b(a(sQLiteDatabase));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.a[0] = null;
    }
}
