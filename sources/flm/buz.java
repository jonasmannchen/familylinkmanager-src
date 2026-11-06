package flm;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class buz extends buy {
    private final cn a;
    private final ch b;
    private final ch c;
    private final ct d;
    private final ct e;

    public buz(cn cnVar) {
        this.a = cnVar;
        this.b = new bva(cnVar);
        this.c = new bvb(cnVar);
        this.d = new bvc(cnVar);
        this.e = new bvd(cnVar);
    }

    @Override // flm.buy
    final void a(bve bveVar) {
        this.a.d();
        try {
            this.b.a(bveVar);
            this.a.f();
        } finally {
            this.a.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // flm.buy
    public final void a(bux buxVar) {
        this.a.d();
        try {
            this.c.a(buxVar);
            this.a.f();
        } finally {
            this.a.e();
        }
    }

    @Override // flm.buy
    final int b(String str, long j, long j2) {
        bw bwVarB = this.d.b();
        this.a.d();
        try {
            bwVarB.a(1, j2);
            bwVarB.a(2, j);
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

    @Override // flm.buy
    public final void f(String str) {
        bw bwVarB = this.e.b();
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
            this.e.a(bwVarB);
        } catch (Throwable th) {
            this.a.e();
            this.e.a(bwVarB);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // flm.buy
    public final long d(String str) {
        long j;
        cs csVarA = cs.a("SELECT flags FROM AppStateEntity WHERE packageName = ?", 1);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // flm.buy
    public final List a(long j) {
        cs csVarA = cs.a("SELECT packageName FROM AppStateEntity WHERE (flags & ?) = ?", 2);
        csVarA.a(1, 8L);
        csVarA.a(2, 8L);
        Cursor cursorA = this.a.a(csVarA);
        try {
            ArrayList arrayList = new ArrayList(cursorA.getCount());
            while (cursorA.moveToNext()) {
                arrayList.add(cursorA.getString(0));
            }
            cursorA.close();
            csVarA.c();
            return arrayList;
        } catch (Throwable th) {
            cursorA.close();
            csVarA.c();
            throw th;
        }
    }

    @Override // flm.buy
    public final long e(String str) {
        long j;
        cs csVarA = cs.a("SELECT pendingTimestamp FROM AppPendingDisableEntity WHERE packageName = ?", 1);
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
}
