package flm;

import android.database.Cursor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvu extends bvt {
    private final cn a;
    private final ch b;

    public bvu(cn cnVar) {
        this.a = cnVar;
        this.b = new bvv(cnVar);
    }

    @Override // flm.bvt
    public final void a(bvs bvsVar) {
        this.a.d();
        try {
            this.b.a(bvsVar);
            this.a.f();
        } finally {
            this.a.e();
        }
    }

    @Override // flm.bvt
    public final bvs a() {
        bvs bvsVar;
        cs csVarA = cs.a("SELECT * FROM KidsModuleInfo LIMIT 1", 0);
        Cursor cursorA = this.a.a(csVarA);
        try {
            int columnIndexOrThrow = cursorA.getColumnIndexOrThrow("key");
            int columnIndexOrThrow2 = cursorA.getColumnIndexOrThrow("apkPackageName");
            int columnIndexOrThrow3 = cursorA.getColumnIndexOrThrow("apkVersionCode");
            int columnIndexOrThrow4 = cursorA.getColumnIndexOrThrow("moduleVersion");
            if (cursorA.moveToFirst()) {
                bvsVar = new bvs();
                bvsVar.a = cursorA.getInt(columnIndexOrThrow);
                bvsVar.b = cursorA.getString(columnIndexOrThrow2);
                bvsVar.c = cursorA.getInt(columnIndexOrThrow3);
                bvsVar.d = cursorA.getInt(columnIndexOrThrow4);
            } else {
                bvsVar = null;
            }
            return bvsVar;
        } finally {
            cursorA.close();
            csVarA.c();
        }
    }
}
