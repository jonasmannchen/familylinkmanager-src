package flm;

import android.database.Cursor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvy extends bvx {
    private final cn a;
    private final ch b;
    private final ct c;

    public bvy(cn cnVar) {
        this.a = cnVar;
        this.b = new bvz(cnVar);
        this.c = new bwa(cnVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bvx
    public final void a(bvw bvwVar) {
        this.a.d();
        try {
            this.b.a(bvwVar);
            this.a.f();
        } finally {
            this.a.e();
        }
    }

    @Override // flm.bvx
    public final void a(String str) {
        bw bwVarB = this.c.b();
        this.a.d();
        try {
            if (str == null) {
                bwVarB.a(1);
            } else {
                bwVarB.a(1, str);
            }
            bwVarB.c();
            this.a.f();
            this.a.e();
            this.c.a(bwVarB);
        } catch (Throwable th) {
            this.a.e();
            this.c.a(bwVarB);
            throw th;
        }
    }

    @Override // flm.bvx
    public final bvw a() {
        bvw bvwVar;
        cs csVarA = cs.a("SELECT * FROM PartialConsentForSecondaryAccountSignIn LIMIT 1", 0);
        Cursor cursorA = this.a.a(csVarA);
        try {
            int columnIndexOrThrow = cursorA.getColumnIndexOrThrow("key");
            int columnIndexOrThrow2 = cursorA.getColumnIndexOrThrow("parentObfuscatedGaiaId");
            int columnIndexOrThrow3 = cursorA.getColumnIndexOrThrow("reauthProofToken");
            int columnIndexOrThrow4 = cursorA.getColumnIndexOrThrow("consentTextVersion");
            int columnIndexOrThrow5 = cursorA.getColumnIndexOrThrow("timestamp");
            if (cursorA.moveToFirst()) {
                bvwVar = new bvw();
                bvwVar.a = cursorA.getInt(columnIndexOrThrow);
                bvwVar.b = cursorA.getString(columnIndexOrThrow2);
                bvwVar.c = cursorA.getString(columnIndexOrThrow3);
                bvwVar.d = cursorA.getString(columnIndexOrThrow4);
                bvwVar.e = cursorA.getLong(columnIndexOrThrow5);
            } else {
                bvwVar = null;
            }
            return bvwVar;
        } finally {
            cursorA.close();
            csVarA.c();
        }
    }
}
