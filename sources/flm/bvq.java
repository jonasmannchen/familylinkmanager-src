package flm;

import android.database.Cursor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvq extends bvp {
    private final cn a;
    private final ch b;

    public bvq(cn cnVar) {
        this.a = cnVar;
        this.b = new bvr(cnVar);
    }

    @Override // flm.bvp
    protected final void a(bvo bvoVar) {
        this.a.d();
        try {
            this.b.a(bvoVar);
            this.a.f();
        } finally {
            this.a.e();
        }
    }

    @Override // flm.bvp
    public final long c(String str) {
        this.a.d();
        try {
            long jC = super.c(str);
            this.a.f();
            return jC;
        } finally {
            this.a.e();
        }
    }

    @Override // flm.bvp
    public final boolean b(String str, long j) {
        this.a.d();
        try {
            boolean zB = super.b(str, j);
            this.a.f();
            return zB;
        } finally {
            this.a.e();
        }
    }

    @Override // flm.bvp
    public final void a(long j, long j2, boolean z) {
        this.a.d();
        try {
            super.a(j, j2, z);
            this.a.f();
        } finally {
            this.a.e();
        }
    }

    @Override // flm.bvp
    public final void a() {
        this.a.d();
        try {
            super.a();
            this.a.f();
        } finally {
            this.a.e();
        }
    }

    @Override // flm.bvp
    public final String a(String str) {
        String string;
        cs csVarA = cs.a("SELECT value FROM KeyValue WHERE `key` = ?", 1);
        csVarA.a(1, str);
        Cursor cursorA = this.a.a(csVarA);
        try {
            if (cursorA.moveToFirst()) {
                string = cursorA.getString(0);
            } else {
                string = null;
            }
            return string;
        } finally {
            cursorA.close();
            csVarA.c();
        }
    }

    @Override // flm.bvp
    public final long b(String str) {
        long j;
        cs csVarA = cs.a("SELECT value FROM KeyValue WHERE `key` = ?", 1);
        if (str == null) {
            csVarA.a[1] = 1;
        } else {
            csVarA.a(1, str);
        }
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

    @Override // flm.bvp
    public final int d(String str) {
        cs csVarA = cs.a("SELECT value FROM KeyValue WHERE `key` = ?", 1);
        csVarA.a(1, str);
        Cursor cursorA = this.a.a(csVarA);
        try {
            return cursorA.moveToFirst() ? cursorA.getInt(0) : 0;
        } finally {
            cursorA.close();
            csVarA.c();
        }
    }

    @Override // flm.bvp
    public final Integer e(String str) {
        Integer numValueOf = null;
        cs csVarA = cs.a("SELECT value FROM KeyValue WHERE `key` = ?", 1);
        csVarA.a(1, str);
        Cursor cursorA = this.a.a(csVarA);
        try {
            if (cursorA.moveToFirst() && !cursorA.isNull(0)) {
                numValueOf = Integer.valueOf(cursorA.getInt(0));
            }
            return numValueOf;
        } finally {
            cursorA.close();
            csVarA.c();
        }
    }
}
