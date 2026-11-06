package flm;

import android.database.Cursor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvk extends bvj {
    private final cn a;
    private final ch b;
    private final cg c;

    public bvk(cn cnVar) {
        this.a = cnVar;
        this.b = new bvl(cnVar);
        this.c = new bvm(cnVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // flm.bvj
    public final void a(bvn... bvnVarArr) {
        this.a.d();
        try {
            ch chVar = this.b;
            bw bwVarB = chVar.b();
            try {
                for (bvn bvnVar : bvnVarArr) {
                    chVar.a(bwVarB, bvnVar);
                    bwVarB.d();
                }
                chVar.a(bwVarB);
                this.a.f();
                this.a.e();
            } catch (Throwable th) {
                chVar.a(bwVarB);
                throw th;
            }
        } catch (Throwable th2) {
            this.a.e();
            throw th2;
        }
    }

    @Override // flm.bvj
    public final void b(bvn[] bvnVarArr) {
        this.a.d();
        try {
            this.c.a((Object[]) bvnVarArr);
            this.a.f();
        } finally {
            this.a.e();
        }
    }

    @Override // flm.bvj
    public final bvn[] a() {
        int i = 0;
        cs csVarA = cs.a("SELECT * FROM DeviceEventEntity", 0);
        Cursor cursorA = this.a.a(csVarA);
        try {
            int columnIndexOrThrow = cursorA.getColumnIndexOrThrow(bbz.MARKET_URI_PARAM_ID);
            int columnIndexOrThrow2 = cursorA.getColumnIndexOrThrow("type");
            int columnIndexOrThrow3 = cursorA.getColumnIndexOrThrow("timestampMillis");
            int columnIndexOrThrow4 = cursorA.getColumnIndexOrThrow("packageName");
            int columnIndexOrThrow5 = cursorA.getColumnIndexOrThrow("value");
            bvn[] bvnVarArr = new bvn[cursorA.getCount()];
            while (true) {
                int i2 = i;
                if (cursorA.moveToNext()) {
                    bvn bvnVar = new bvn(cursorA.getInt(columnIndexOrThrow2), cursorA.getLong(columnIndexOrThrow3), cursorA.getString(columnIndexOrThrow4), cursorA.getBlob(columnIndexOrThrow5));
                    bvnVar.a = cursorA.getLong(columnIndexOrThrow);
                    bvnVarArr[i2] = bvnVar;
                    i = i2 + 1;
                } else {
                    cursorA.close();
                    csVarA.c();
                    return bvnVarArr;
                }
            }
        } catch (Throwable th) {
            cursorA.close();
            csVarA.c();
            throw th;
        }
    }
}
