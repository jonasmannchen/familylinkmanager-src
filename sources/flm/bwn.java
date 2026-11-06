package flm;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwn extends bwj {
    private final cn b;
    private final ch c;
    private final ch d;
    private final ct e;

    public bwn(cn cnVar) {
        super(cnVar);
        this.b = cnVar;
        this.c = new bwo(cnVar);
        this.d = new bwp(cnVar);
        this.e = new bwq(cnVar);
    }

    @Override // flm.bwj
    public final void a(List list) {
        this.b.d();
        try {
            this.c.a((Iterable) list);
            this.b.f();
        } finally {
            this.b.e();
        }
    }

    @Override // flm.bwj
    protected final void a(bwr bwrVar) {
        this.b.d();
        try {
            this.d.a(bwrVar);
            this.b.f();
        } finally {
            this.b.e();
        }
    }

    @Override // flm.bwj
    public final void a(long j) {
        bw bwVarB = this.e.b();
        this.b.d();
        try {
            bwVarB.a(1, j);
            bwVarB.c();
            this.b.f();
        } finally {
            this.b.e();
            this.e.a(bwVarB);
        }
    }

    @Override // flm.bwj
    public final List a() {
        cs csVarA = cs.a("SELECT * FROM TimeLimitLocalOverrideEntity", 0);
        Cursor cursorA = this.b.a(csVarA);
        try {
            int columnIndexOrThrow = cursorA.getColumnIndexOrThrow("uuid");
            int columnIndexOrThrow2 = cursorA.getColumnIndexOrThrow("action");
            int columnIndexOrThrow3 = cursorA.getColumnIndexOrThrow("timestamp");
            int columnIndexOrThrow4 = cursorA.getColumnIndexOrThrow("entryVersion");
            int columnIndexOrThrow5 = cursorA.getColumnIndexOrThrow("entryId");
            ArrayList arrayList = new ArrayList(cursorA.getCount());
            while (cursorA.moveToNext()) {
                bws bwsVar = new bws(fej.a(cursorA.getInt(columnIndexOrThrow2)), cursorA.getLong(columnIndexOrThrow3), cursorA.getLong(columnIndexOrThrow4), cursorA.getString(columnIndexOrThrow5));
                bwsVar.a = cursorA.getString(columnIndexOrThrow);
                arrayList.add(bwsVar);
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

    @Override // flm.bwj
    protected final String a(String str) {
        String string;
        cs csVarA = cs.a("SELECT value FROM TimeLimitKeyValueEntity WHERE `key` = ?", 1);
        csVarA.a(1, str);
        Cursor cursorA = this.b.a(csVarA);
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.bwj
    public final Long b(String str) {
        Long lValueOf = null;
        cs csVarA = cs.a("SELECT value FROM TimeLimitKeyValueEntity WHERE `key` = ?", 1);
        if (str == null) {
            csVarA.a[1] = 1;
        } else {
            csVarA.a(1, str);
        }
        Cursor cursorA = this.b.a(csVarA);
        try {
            if (cursorA.moveToFirst() && !cursorA.isNull(0)) {
                lValueOf = Long.valueOf(cursorA.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorA.close();
            csVarA.c();
        }
    }

    @Override // flm.bwj
    public final void a(Set set) {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM TimeLimitLocalOverrideEntity WHERE uuid IN (");
        cv.a(sb, set.size());
        sb.append(")");
        bw bwVarA = this.b.a(sb.toString());
        int i = 1;
        Iterator it = set.iterator();
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
                this.b.d();
                try {
                    bwVarA.c();
                    this.b.f();
                    return;
                } finally {
                    this.b.e();
                }
            }
        }
    }
}
