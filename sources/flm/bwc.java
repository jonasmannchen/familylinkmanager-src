package flm;

import android.database.Cursor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwc extends bwb {
    private final cn a;
    private final cg b;
    private final ct c;
    private final ct d;

    public bwc(cn cnVar) {
        super(cnVar);
        this.a = cnVar;
        this.b = new bwd(cnVar);
        this.c = new bwe(cnVar);
        this.d = new bwf(cnVar);
    }

    @Override // flm.bwb
    public final void b(bwg bwgVar) {
        this.a.d();
        try {
            this.b.a(bwgVar);
            this.a.f();
        } finally {
            this.a.e();
        }
    }

    @Override // flm.bwb
    public final void a(long j) {
        bw bwVarB = this.c.b();
        this.a.d();
        try {
            bwVarB.a(1, j);
            bwVarB.c();
            this.a.f();
        } finally {
            this.a.e();
            this.c.a(bwVarB);
        }
    }

    @Override // flm.bwb
    public final int a(fdc fdcVar, String str, int i) {
        bw bwVarB = this.d.b();
        this.a.d();
        try {
            bwVarB.a(1, i);
            bwVarB.a(2, fdcVar.z);
            if (str == null) {
                bwVarB.a(3);
            } else {
                bwVarB.a(3, str);
            }
            int iC = bwVarB.c();
            this.a.f();
            return iC;
        } finally {
            this.a.e();
            this.d.a(bwVarB);
        }
    }

    @Override // flm.bwb
    public final fdc[] a() {
        int i = 0;
        cs csVarA = cs.a("SELECT DISTINCT type FROM PolicyEntity WHERE status IN (0,1,2)", 0);
        Cursor cursorA = this.a.a(csVarA);
        try {
            fdc[] fdcVarArr = new fdc[cursorA.getCount()];
            while (cursorA.moveToNext()) {
                fdcVarArr[i] = bwh.a(cursorA.getInt(0));
                i++;
            }
            cursorA.close();
            csVarA.c();
            return fdcVarArr;
        } catch (Throwable th) {
            cursorA.close();
            csVarA.c();
            throw th;
        }
    }

    @Override // flm.bwb
    public final bwg[] a(fdc fdcVar) {
        cs csVarA = cs.a("SELECT * FROM PolicyEntity WHERE type = ? AND status IN (0,1,2)", 1);
        csVarA.a(1, fdcVar.z);
        Cursor cursorA = this.a.a(csVarA);
        try {
            int columnIndexOrThrow = cursorA.getColumnIndexOrThrow("type");
            int columnIndexOrThrow2 = cursorA.getColumnIndexOrThrow("subKey");
            int columnIndexOrThrow3 = cursorA.getColumnIndexOrThrow("generation");
            int columnIndexOrThrow4 = cursorA.getColumnIndexOrThrow("version");
            int columnIndexOrThrow5 = cursorA.getColumnIndexOrThrow("status");
            int columnIndexOrThrow6 = cursorA.getColumnIndexOrThrow("value");
            bwg[] bwgVarArr = new bwg[cursorA.getCount()];
            int i = 0;
            while (cursorA.moveToNext()) {
                bwg bwgVar = new bwg(bwh.a(cursorA.getInt(columnIndexOrThrow)), cursorA.getString(columnIndexOrThrow2), cursorA.getLong(columnIndexOrThrow3), cursorA.getString(columnIndexOrThrow4), cursorA.getBlob(columnIndexOrThrow6));
                bwgVar.e = cursorA.getInt(columnIndexOrThrow5);
                bwgVarArr[i] = bwgVar;
                i++;
            }
            cursorA.close();
            csVarA.c();
            return bwgVarArr;
        } catch (Throwable th) {
            cursorA.close();
            csVarA.c();
            throw th;
        }
    }

    @Override // flm.bwb
    public final bwg[] b(fdc fdcVar) {
        cs csVarA = cs.a("SELECT * FROM PolicyEntity WHERE type = ? AND status IN (0,1)", 1);
        csVarA.a(1, fdcVar.z);
        Cursor cursorA = this.a.a(csVarA);
        try {
            int columnIndexOrThrow = cursorA.getColumnIndexOrThrow("type");
            int columnIndexOrThrow2 = cursorA.getColumnIndexOrThrow("subKey");
            int columnIndexOrThrow3 = cursorA.getColumnIndexOrThrow("generation");
            int columnIndexOrThrow4 = cursorA.getColumnIndexOrThrow("version");
            int columnIndexOrThrow5 = cursorA.getColumnIndexOrThrow("status");
            int columnIndexOrThrow6 = cursorA.getColumnIndexOrThrow("value");
            bwg[] bwgVarArr = new bwg[cursorA.getCount()];
            int i = 0;
            while (cursorA.moveToNext()) {
                bwg bwgVar = new bwg(bwh.a(cursorA.getInt(columnIndexOrThrow)), cursorA.getString(columnIndexOrThrow2), cursorA.getLong(columnIndexOrThrow3), cursorA.getString(columnIndexOrThrow4), cursorA.getBlob(columnIndexOrThrow6));
                bwgVar.e = cursorA.getInt(columnIndexOrThrow5);
                bwgVarArr[i] = bwgVar;
                i++;
            }
            cursorA.close();
            csVarA.c();
            return bwgVarArr;
        } catch (Throwable th) {
            cursorA.close();
            csVarA.c();
            throw th;
        }
    }

    @Override // flm.bwb
    public final bwg[] b() {
        cs csVarA = cs.a("SELECT * FROM PolicyEntity WHERE status = 3", 0);
        Cursor cursorA = this.a.a(csVarA);
        try {
            int columnIndexOrThrow = cursorA.getColumnIndexOrThrow("type");
            int columnIndexOrThrow2 = cursorA.getColumnIndexOrThrow("subKey");
            int columnIndexOrThrow3 = cursorA.getColumnIndexOrThrow("generation");
            int columnIndexOrThrow4 = cursorA.getColumnIndexOrThrow("version");
            int columnIndexOrThrow5 = cursorA.getColumnIndexOrThrow("status");
            int columnIndexOrThrow6 = cursorA.getColumnIndexOrThrow("value");
            bwg[] bwgVarArr = new bwg[cursorA.getCount()];
            int i = 0;
            while (cursorA.moveToNext()) {
                bwg bwgVar = new bwg(bwh.a(cursorA.getInt(columnIndexOrThrow)), cursorA.getString(columnIndexOrThrow2), cursorA.getLong(columnIndexOrThrow3), cursorA.getString(columnIndexOrThrow4), cursorA.getBlob(columnIndexOrThrow6));
                bwgVar.e = cursorA.getInt(columnIndexOrThrow5);
                bwgVarArr[i] = bwgVar;
                i++;
            }
            cursorA.close();
            csVarA.c();
            return bwgVarArr;
        } catch (Throwable th) {
            cursorA.close();
            csVarA.c();
            throw th;
        }
    }

    @Override // flm.bwb
    public final long c() {
        long j;
        cs csVarA = cs.a("SELECT MAX(generation) FROM PolicyEntity", 0);
        Cursor cursorA = this.a.a(csVarA);
        try {
            if (cursorA.moveToFirst()) {
                j = cursorA.getLong(0);
            } else {
                j = 0;
            }
            return j;
        } finally {
            cursorA.close();
            csVarA.c();
        }
    }

    @Override // flm.bwb
    public final bwg b(fdc fdcVar, String str) {
        bwg bwgVar;
        cs csVarA = cs.a("SELECT * FROM PolicyEntity WHERE type = ? AND subKey = ?", 2);
        csVarA.a(1, fdcVar.z);
        csVarA.a(2, str);
        Cursor cursorA = this.a.a(csVarA);
        try {
            int columnIndexOrThrow = cursorA.getColumnIndexOrThrow("type");
            int columnIndexOrThrow2 = cursorA.getColumnIndexOrThrow("subKey");
            int columnIndexOrThrow3 = cursorA.getColumnIndexOrThrow("generation");
            int columnIndexOrThrow4 = cursorA.getColumnIndexOrThrow("version");
            int columnIndexOrThrow5 = cursorA.getColumnIndexOrThrow("status");
            int columnIndexOrThrow6 = cursorA.getColumnIndexOrThrow("value");
            if (cursorA.moveToFirst()) {
                bwgVar = new bwg(bwh.a(cursorA.getInt(columnIndexOrThrow)), cursorA.getString(columnIndexOrThrow2), cursorA.getLong(columnIndexOrThrow3), cursorA.getString(columnIndexOrThrow4), cursorA.getBlob(columnIndexOrThrow6));
                bwgVar.e = cursorA.getInt(columnIndexOrThrow5);
            } else {
                bwgVar = null;
            }
            return bwgVar;
        } finally {
            cursorA.close();
            csVarA.c();
        }
    }

    @Override // flm.bwb
    public final bwg[] c(fdc fdcVar) {
        cs csVarA = cs.a("SELECT * FROM PolicyEntity WHERE type = ?", 1);
        csVarA.a(1, fdcVar.z);
        Cursor cursorA = this.a.a(csVarA);
        try {
            int columnIndexOrThrow = cursorA.getColumnIndexOrThrow("type");
            int columnIndexOrThrow2 = cursorA.getColumnIndexOrThrow("subKey");
            int columnIndexOrThrow3 = cursorA.getColumnIndexOrThrow("generation");
            int columnIndexOrThrow4 = cursorA.getColumnIndexOrThrow("version");
            int columnIndexOrThrow5 = cursorA.getColumnIndexOrThrow("status");
            int columnIndexOrThrow6 = cursorA.getColumnIndexOrThrow("value");
            bwg[] bwgVarArr = new bwg[cursorA.getCount()];
            int i = 0;
            while (cursorA.moveToNext()) {
                bwg bwgVar = new bwg(bwh.a(cursorA.getInt(columnIndexOrThrow)), cursorA.getString(columnIndexOrThrow2), cursorA.getLong(columnIndexOrThrow3), cursorA.getString(columnIndexOrThrow4), cursorA.getBlob(columnIndexOrThrow6));
                bwgVar.e = cursorA.getInt(columnIndexOrThrow5);
                bwgVarArr[i] = bwgVar;
                i++;
            }
            cursorA.close();
            csVarA.c();
            return bwgVarArr;
        } catch (Throwable th) {
            cursorA.close();
            csVarA.c();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bwb
    public final bwg[] c(fdc fdcVar, String str) {
        cs csVarA = cs.a("SELECT * FROM PolicyEntity WHERE type = ? AND subKey LIKE ?", 2);
        csVarA.a(1, fdcVar.z);
        if (str == null) {
            csVarA.a[2] = 1;
        } else {
            csVarA.a(2, str);
        }
        Cursor cursorA = this.a.a(csVarA);
        try {
            int columnIndexOrThrow = cursorA.getColumnIndexOrThrow("type");
            int columnIndexOrThrow2 = cursorA.getColumnIndexOrThrow("subKey");
            int columnIndexOrThrow3 = cursorA.getColumnIndexOrThrow("generation");
            int columnIndexOrThrow4 = cursorA.getColumnIndexOrThrow("version");
            int columnIndexOrThrow5 = cursorA.getColumnIndexOrThrow("status");
            int columnIndexOrThrow6 = cursorA.getColumnIndexOrThrow("value");
            bwg[] bwgVarArr = new bwg[cursorA.getCount()];
            int i = 0;
            while (cursorA.moveToNext()) {
                bwg bwgVar = new bwg(bwh.a(cursorA.getInt(columnIndexOrThrow)), cursorA.getString(columnIndexOrThrow2), cursorA.getLong(columnIndexOrThrow3), cursorA.getString(columnIndexOrThrow4), cursorA.getBlob(columnIndexOrThrow6));
                bwgVar.e = cursorA.getInt(columnIndexOrThrow5);
                bwgVarArr[i] = bwgVar;
                i++;
            }
            cursorA.close();
            csVarA.c();
            return bwgVarArr;
        } catch (Throwable th) {
            cursorA.close();
            csVarA.c();
            throw th;
        }
    }

    @Override // flm.bwb
    public final void a(fdc fdcVar, String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM PolicyEntity WHERE type = ");
        sb.append("?");
        sb.append(" AND subKey IN (");
        cv.a(sb, strArr.length);
        sb.append(") AND status = 3");
        bw bwVarA = this.a.a(sb.toString());
        bwVarA.a(1, fdcVar.z);
        int i = 2;
        for (String str : strArr) {
            if (str == null) {
                bwVarA.a(i);
            } else {
                bwVarA.a(i, str);
            }
            i++;
        }
        this.a.d();
        try {
            bwVarA.c();
            this.a.f();
        } finally {
            this.a.e();
        }
    }
}
