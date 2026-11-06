package flm;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dle implements dgb, dlx {
    private final dge a;
    private final dmb b;
    private final dmb c;
    private final dlf d;

    dle(dge dgeVar, dmb dmbVar, dmb dmbVar2, dvi dviVar) {
        this.a = dgeVar;
        this.a.a(this);
        this.b = dmbVar;
        this.c = dmbVar2;
        if (!dviVar.a() || !((dlp) dviVar.b()).a) {
            this.d = null;
            return;
        }
        this.d = new dlf(((dlp) dviVar.b()).c);
        dla dlaVar = dla.c;
        dlf dlfVar = this.d;
        synchronized (dlaVar.o) {
            if (dlaVar.g > 0) {
                try {
                    dlfVar.a();
                } catch (RuntimeException e) {
                    dkm.a("PrimesStartupMeasure", "Error running onActivityInit listener", e, new Object[0]);
                }
            } else {
                if (dlaVar.m == dla.a) {
                    dlaVar.m = new ArrayList();
                }
                dlaVar.m.add(dlfVar);
            }
        }
        dla dlaVar2 = dla.c;
        dlf dlfVar2 = this.d;
        synchronized (dlaVar2.p) {
            if (dlaVar2.j > 0) {
                try {
                    dlfVar2.b();
                } catch (RuntimeException e2) {
                    dkm.a("PrimesStartupMeasure", "Error running onDraw listener", e2, new Object[0]);
                }
            } else {
                if (dlaVar2.n == dla.b) {
                    dlaVar2.n = new ArrayList();
                }
                dlaVar2.n.add(dlfVar2);
            }
        }
    }

    @Override // flm.dgb
    public final void b() {
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        this.a.b(this);
        dla dlaVar = dla.c;
        if (dlaVar.j > 0) {
            if (this.b.a() != null && a(dlaVar) > 0) {
                long j = dlaVar.j;
                boolean z2 = dlaVar.d;
                long jA = a(dlaVar);
                if (z2) {
                    str2 = "Cold startup";
                } else {
                    str2 = "Warm startup";
                }
                a(dlaVar, jA, j, str2);
                long j2 = dlaVar.k;
                if (dlaVar.k < dlaVar.j) {
                    if (z2) {
                        str4 = "Cold startup interactive before onDraw";
                    } else {
                        str4 = "Warm startup interactive before onDraw";
                    }
                    str3 = str4;
                } else {
                    str3 = z2 ? "Cold startup interactive" : "Warm startup interactive";
                }
                a(dlaVar, jA, j2, str3);
                long j3 = dlaVar.h;
                long j4 = dlaVar.j;
                if (!z2 && j3 != 0) {
                    a(dlaVar, j3, j4, "Warm startup activity onStart");
                }
            }
            if (!((dvi) this.c.a()).a() || a(dlaVar) <= 0) {
                return;
            }
            if (dlaVar.j >= a(dlaVar)) {
                long id = Looper.getMainLooper().getThread().getId();
                ArrayList arrayList = new ArrayList();
                boolean z3 = dlaVar.d;
                dlb[] dlbVarArrA = dlaVar.a();
                if (z3) {
                    arrayList.add(dps.a(dlo.a, "App create", dp.R, dlaVar.e, dlaVar.f, id, dp.W));
                    dlo dloVar = dlo.a;
                    String strValueOf = String.valueOf(dlbVarArrA[0].a);
                    String strValueOf2 = String.valueOf(": onCreate");
                    dps dpsVarA = dps.a(dloVar, strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf), dp.R, dlaVar.f, dlbVarArrA[0].b, id, dp.W);
                    arrayList.add(dpsVarA);
                    if (dlaVar.g > 0) {
                        dlo dloVar2 = dlo.a;
                        dlo dloVar3 = dlo.a;
                        String strValueOf3 = String.valueOf(dlbVarArrA[0].a);
                        String strValueOf4 = String.valueOf(": init");
                        dpsVarA.a(dloVar2, dps.a(dloVar3, strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3), dp.R, dlaVar.f, dlaVar.g, id, dp.W));
                    }
                } else {
                    dlo dloVar4 = dlo.a;
                    String strValueOf5 = String.valueOf(dlbVarArrA[0].a);
                    String strValueOf6 = String.valueOf(": onCreate");
                    arrayList.add(dps.a(dloVar4, strValueOf6.length() != 0 ? strValueOf5.concat(strValueOf6) : new String(strValueOf5), dp.R, dlaVar.g, dlbVarArrA[0].b, id, dp.W));
                }
                long j5 = dlbVarArrA[0].b;
                for (int i = 1; i < dlbVarArrA.length; i++) {
                    long j6 = dlbVarArrA[i].b;
                    dlo dloVar5 = dlo.a;
                    String strValueOf7 = String.valueOf(dlbVarArrA[i].a);
                    String strValueOf8 = String.valueOf(": onCreate");
                    arrayList.add(dps.a(dloVar5, strValueOf8.length() != 0 ? strValueOf7.concat(strValueOf8) : new String(strValueOf7), dp.R, 0L, 0L, id, dp.W));
                }
                long j7 = dlbVarArrA[dlbVarArrA.length - 1].b;
                String str5 = dlbVarArrA[dlbVarArrA.length - 1].a;
                dlo dloVar6 = dlo.a;
                String strValueOf9 = String.valueOf((Object) null);
                String strValueOf10 = String.valueOf(": onStart");
                arrayList.add(dps.a(dloVar6, strValueOf10.length() != 0 ? strValueOf9.concat(strValueOf10) : new String(strValueOf9), dp.R, 0L, dlaVar.h, id, dp.W));
                dlo dloVar7 = dlo.a;
                String strValueOf11 = String.valueOf((Object) null);
                String strValueOf12 = String.valueOf(": onResume");
                arrayList.add(dps.a(dloVar7, strValueOf12.length() != 0 ? strValueOf11.concat(strValueOf12) : new String(strValueOf11), dp.R, dlaVar.h, dlaVar.i, id, dp.W));
                dlo dloVar8 = dlo.a;
                String strValueOf13 = String.valueOf((Object) null);
                String strValueOf14 = String.valueOf(": onDraw");
                arrayList.add(dps.a(dloVar8, strValueOf14.length() != 0 ? strValueOf13.concat(strValueOf14) : new String(strValueOf13), dp.R, dlaVar.i, dlaVar.j, id, dp.W));
                dlo dloVar9 = dlo.a;
                if (dlaVar.d) {
                    str = "Cold startup";
                } else {
                    str = "Warm startup";
                }
                dps dpsVarA2 = dps.a(dloVar9, str, dp.R, ((dps) arrayList.get(0)).c, -1L, id, dp.V);
                dse.a(dlo.a);
                dpsVarA2.a(arrayList);
                dpu dpuVar = null;
                if (this.d != null) {
                    dpuVar = this.d.a;
                }
                if (dpuVar != null) {
                    dse.a(dlo.a);
                    dps dpsVarA3 = dpuVar.a();
                    dlo dloVar10 = dlo.a;
                    int i2 = dp.W;
                    dse.a(dloVar10);
                    dpsVarA3.f = i2;
                    dse.a(dlo.a);
                    boolean z4 = false;
                    Iterator it = dpsVarA3.g.iterator();
                    while (true) {
                        z = z4;
                        if (!it.hasNext()) {
                            break;
                        }
                        dps dpsVar = (dps) it.next();
                        z4 = ((dpsVar.a() && dpsVar.g.isEmpty()) ? false : true) | z;
                    }
                    if (z) {
                        dpsVarA2.a(dlo.a, dpsVarA3);
                    }
                }
                dse.a(dlo.a);
                dpt dptVar = new dpt(dpsVarA2);
                dse.a(dlo.a);
                grj[] grjVarArrA = dptVar.a();
                dmi dmiVar = (dmi) ((dvi) this.c.a()).b();
                grh grhVar = (grh) ((fin) ((gri) ((fio) grh.d.a(dp.au, (Object) null))).a(UUID.randomUUID().getLeastSignificantBits()).a(Arrays.asList(grjVarArrA)).h());
                String strA = dim.a(dlaVar.l);
                gtr gtrVar = (gtr) ((fin) ((gts) ((fio) gtr.y.a(dp.au, (Object) null))).a(grhVar).h());
                Object[] objArr = new Object[2];
                objArr[0] = (grhVar.a & 1) == 1 ? Long.valueOf(grhVar.b) : null;
                objArr[1] = ((grj) grhVar.c.get(0)).b;
                dkm.a(3, "BaseTraceMetricService", "Recording trace %d: %s", objArr);
                dmiVar.a(null, true, gtrVar, null, strA);
            }
        }
    }

    private static long a(dla dlaVar) {
        if (dlaVar.d) {
            return dlaVar.e;
        }
        return dlaVar.g;
    }

    private final void a(dla dlaVar, long j, long j2, String str) {
        if (j2 >= j) {
            dmf dmfVar = (dmf) this.b.a();
            dme dmeVar = new dme(j, j2);
            String strA = dim.a(dlaVar.l);
            if (dmfVar.c.a() && dmfVar.h_()) {
                dmfVar.b(str, true, dmf.a(dmeVar, strA), null);
            }
        }
    }

    @Override // flm.dlx
    public final void g_() {
        this.a.b(this);
        if (this.d != null) {
            this.d.c();
        }
    }
}
