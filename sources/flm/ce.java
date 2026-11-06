package flm;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ce extends cd implements bw {
    private final SQLiteStatement a;

    ce(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.a = sQLiteStatement;
    }

    @Override // flm.bw
    public final void a() {
        this.a.execute();
    }

    @Override // flm.bw
    public final int c() {
        return this.a.executeUpdateDelete();
    }

    @Override // flm.bw
    public final long d() {
        return this.a.executeInsert();
    }
}
