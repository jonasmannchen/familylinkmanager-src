package flm;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fhx implements fmp {
    private final fhp a;

    fhx(fhp fhpVar) {
        this.a = (fhp) fiv.a((Object) fhpVar, "output");
        this.a.b = this;
    }

    @Override // flm.fmp
    public final int a() {
        return dp.aB;
    }

    @Override // flm.fmp
    public final void a(int i, int i2) {
        this.a.e(i, i2);
    }

    @Override // flm.fmp
    public final void a(int i, long j) {
        this.a.a(i, j);
    }

    @Override // flm.fmp
    public final void b(int i, long j) {
        this.a.c(i, j);
    }

    @Override // flm.fmp
    public final void a(int i, float f) {
        this.a.a(i, f);
    }

    @Override // flm.fmp
    public final void a(int i, double d) {
        this.a.a(i, d);
    }

    @Override // flm.fmp
    public final void b(int i, int i2) {
        this.a.b(i, i2);
    }

    @Override // flm.fmp
    public final void c(int i, long j) {
        this.a.a(i, j);
    }

    @Override // flm.fmp
    public final void c(int i, int i2) {
        this.a.b(i, i2);
    }

    @Override // flm.fmp
    public final void d(int i, long j) {
        this.a.c(i, j);
    }

    @Override // flm.fmp
    public final void d(int i, int i2) {
        this.a.e(i, i2);
    }

    @Override // flm.fmp
    public final void a(int i, boolean z) {
        this.a.a(i, z);
    }

    @Override // flm.fmp
    public final void a(int i, String str) {
        this.a.a(i, str);
    }

    @Override // flm.fmp
    public final void a(int i, fgy fgyVar) {
        this.a.a(i, fgyVar);
    }

    @Override // flm.fmp
    public final void e(int i, int i2) {
        this.a.c(i, i2);
    }

    @Override // flm.fmp
    public final void f(int i, int i2) {
        this.a.d(i, i2);
    }

    @Override // flm.fmp
    public final void e(int i, long j) {
        this.a.b(i, j);
    }

    @Override // flm.fmp
    public final void a(int i, Object obj, fky fkyVar) {
        this.a.a(i, (fke) obj, fkyVar);
    }

    @Override // flm.fmp
    public final void b(int i, Object obj, fky fkyVar) {
        fhp fhpVar = this.a;
        fhpVar.a(i, 3);
        fkyVar.a(obj, (fmp) fhpVar.b);
        fhpVar.a(i, 4);
    }

    @Override // flm.fmp
    public final void a(int i) {
        this.a.a(i, 3);
    }

    @Override // flm.fmp
    public final void b(int i) {
        this.a.a(i, 4);
    }

    @Override // flm.fmp
    public final void a(int i, Object obj) {
        if (obj instanceof fgy) {
            this.a.b(i, (fgy) obj);
        } else {
            this.a.b(i, (fke) obj);
        }
    }

    @Override // flm.fmp
    public final void a(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int iG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iG += fhp.g(((Integer) list.get(i3)).intValue());
            }
            this.a.c(iG);
            while (i2 < list.size()) {
                this.a.b(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // flm.fmp
    public final void b(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int iA = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                ((Integer) list.get(i3)).intValue();
                iA += fhp.a();
            }
            this.a.c(iA);
            while (i2 < list.size()) {
                this.a.e(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // flm.fmp
    public final void c(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int iD = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iD += fhp.d(((Long) list.get(i3)).longValue());
            }
            this.a.c(iD);
            while (i2 < list.size()) {
                this.a.a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // flm.fmp
    public final void d(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int iE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iE += fhp.e(((Long) list.get(i3)).longValue());
            }
            this.a.c(iE);
            while (i2 < list.size()) {
                this.a.a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // flm.fmp
    public final void e(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int iC = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                ((Long) list.get(i3)).longValue();
                iC += fhp.c();
            }
            this.a.c(iC);
            while (i2 < list.size()) {
                this.a.c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // flm.fmp
    public final void f(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int iE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                ((Float) list.get(i3)).floatValue();
                iE += fhp.e();
            }
            this.a.c(iE);
            while (i2 < list.size()) {
                this.a.a(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    @Override // flm.fmp
    public final void g(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int iF = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                ((Double) list.get(i3)).doubleValue();
                iF += fhp.f();
            }
            this.a.c(iF);
            while (i2 < list.size()) {
                this.a.a(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    @Override // flm.fmp
    public final void h(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int iJ = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iJ += fhp.j(((Integer) list.get(i3)).intValue());
            }
            this.a.c(iJ);
            while (i2 < list.size()) {
                this.a.b(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // flm.fmp
    public final void i(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int iG = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                ((Boolean) list.get(i3)).booleanValue();
                iG += fhp.g();
            }
            this.a.c(iG);
            while (i2 < list.size()) {
                this.a.a(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.a(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // flm.fmp
    public final void a(int i, List list) {
        int i2 = 0;
        if (list instanceof fjo) {
            fjo fjoVar = (fjo) list;
            while (true) {
                int i3 = i2;
                if (i3 < list.size()) {
                    Object objB = fjoVar.b(i3);
                    if (objB instanceof String) {
                        this.a.a(i, (String) objB);
                    } else {
                        this.a.a(i, (fgy) objB);
                    }
                    i2 = i3 + 1;
                } else {
                    return;
                }
            }
        } else {
            while (i2 < list.size()) {
                this.a.a(i, (String) list.get(i2));
                i2++;
            }
        }
    }

    @Override // flm.fmp
    public final void b(int i, List list) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < list.size()) {
                this.a.a(i, (fgy) list.get(i3));
                i2 = i3 + 1;
            } else {
                return;
            }
        }
    }

    @Override // flm.fmp
    public final void j(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int iH = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iH += fhp.h(((Integer) list.get(i3)).intValue());
            }
            this.a.c(iH);
            while (i2 < list.size()) {
                this.a.c(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.c(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // flm.fmp
    public final void k(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int iB = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                ((Integer) list.get(i3)).intValue();
                iB += fhp.b();
            }
            this.a.c(iB);
            while (i2 < list.size()) {
                this.a.e(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // flm.fmp
    public final void l(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int iD = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                ((Long) list.get(i3)).longValue();
                iD += fhp.d();
            }
            this.a.c(iD);
            while (i2 < list.size()) {
                this.a.c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // flm.fmp
    public final void m(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += fhp.i(((Integer) list.get(i4)).intValue());
            }
            this.a.c(i3);
            while (i2 < list.size()) {
                this.a.d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.d(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // flm.fmp
    public final void n(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.a.a(i, 2);
            int iF = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iF += fhp.f(((Long) list.get(i3)).longValue());
            }
            this.a.c(iF);
            while (i2 < list.size()) {
                this.a.b(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.a.b(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // flm.fmp
    public final void a(int i, List list, fky fkyVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            a(i, list.get(i2), fkyVar);
        }
    }

    @Override // flm.fmp
    public final void b(int i, List list, fky fkyVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b(i, list.get(i2), fkyVar);
        }
    }

    @Override // flm.fmp
    public final void a(int i, fjx fjxVar, Map map) {
        fhp fhpVar = this.a;
        for (Map.Entry entry : map.entrySet()) {
            this.a.a(i, 2);
            this.a.c(fjw.a(fjxVar, entry.getKey(), entry.getValue()));
            fjw.a(this.a, fjxVar, entry.getKey(), entry.getValue());
        }
    }
}
