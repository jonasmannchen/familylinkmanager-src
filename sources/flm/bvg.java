package flm;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvg extends bvf {
    private final cn a;
    private final ch b;

    public bvg(cn cnVar) {
        this.a = cnVar;
        this.b = new bvh(cnVar);
    }

    @Override // flm.bvf
    public final void a(List list) {
        this.a.d();
        try {
            this.b.a((Iterable) list);
            this.a.f();
        } finally {
            this.a.e();
        }
    }

    @Override // flm.bvf
    public final List c(List list) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT secondaryAccountEmail FROM ConsentStatusEntity WHERE secondaryAccountEmail IN (");
        int size = list.size();
        cv.a(sb, size);
        sb.append(") AND isValid = 0");
        cs csVarA = cs.a(sb.toString(), size + 0);
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                csVarA.a[i] = 1;
            } else {
                csVarA.a(i, str);
            }
            i++;
        }
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bvf
    public final int a(String str, long j) {
        cs csVarA = cs.a("SELECT COUNT(*) FROM ConsentStatusEntity WHERE secondaryAccountEmail = ? AND timestamp > ?", 2);
        if (str == null) {
            csVarA.a[1] = 1;
        } else {
            csVarA.a(1, str);
        }
        csVarA.a(2, j);
        Cursor cursorA = this.a.a(csVarA);
        try {
            return cursorA.moveToFirst() ? cursorA.getInt(0) : 0;
        } finally {
            cursorA.close();
            csVarA.c();
        }
    }

    @Override // flm.bvf
    public final void b(List list) {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE from ConsentStatusEntity WHERE secondaryAccountEmail NOT IN (");
        cv.a(sb, list.size());
        sb.append(")");
        bw bwVarA = this.a.a(sb.toString());
        int i = 1;
        Iterator it = list.iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                String str = (String) it.next();
                if (str == null) {
                    bwVarA.a(i2);
                } else {
                    bwVarA.a(i2, str);
                }
                i = i2 + 1;
            } else {
                this.a.d();
                try {
                    bwVarA.c();
                    this.a.f();
                    return;
                } finally {
                    this.a.e();
                }
            }
        }
    }
}
