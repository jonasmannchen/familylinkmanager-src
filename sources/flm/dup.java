package flm;

import android.util.SparseArray;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dup implements dsz {
    private final fol a;
    private final duh b;
    private final AtomicInteger c = new AtomicInteger();

    public dup(fol folVar, duh duhVar) {
        this.a = folVar;
        this.b = duhVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0044  */
    @Override // flm.dsz
    public final void a(duf dufVar, SparseArray sparseArray) {
        boolean z;
        if (!((dvi) this.a.a()).a()) {
            z = false;
        } else {
            dll dllVar = (dll) ((dvi) this.a.a()).b();
            if (dllVar.a) {
                duh duhVar = this.b;
                if (duh.a(dufVar.c, dllVar.b)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        if (z && (dufVar.a & 8) != 8) {
            gri griVar = (gri) ((fio) grh.d.a(dp.au, (Object) null));
            long j = (dufVar.b ^ dufVar.c) >>> 1;
            if (j == 0) {
                j = 1;
            }
            gri griVarA = griVar.a(j);
            int size = dufVar.d.size();
            String str = null;
            long j2 = dufVar.e;
            long j3 = dufVar.e;
            gpr gprVar = null;
            for (int i = 0; i < size; i++) {
                dtf dtfVar = (dtf) dufVar.d.get(i);
                grk grkVarD = ((grk) ((fio) grj.l.a(dp.au, (Object) null))).a(dtfVar.b).a(((long) dtfVar.c) + 1).b(((long) dtfVar.d) + 1).c(dtfVar.e + j2).d(dtfVar.f);
                if ((dtfVar.a & 32) == 32) {
                    int i2 = dtfVar.g;
                    grkVarD.c();
                    grj grjVar = (grj) grkVarD.a;
                    grjVar.a |= 128;
                    grjVar.i = i2;
                }
                griVarA.c();
                grh grhVar = (grh) griVarA.a;
                if (!grhVar.c.a()) {
                    grhVar.c = fin.a(grhVar.c);
                }
                grhVar.c.add((grj) ((fin) grkVarD.h()));
                if (dtfVar.d == -1) {
                    str = dtfVar.b;
                    dtl dtlVarA = dtn.a(duq.a, (dtn) sparseArray.get(dtfVar.c, dtp.d), duo.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
                    if (dtlVarA.b()) {
                        gprVar = (gpr) dtlVarA.a();
                    }
                }
                long j4 = ((grj) grkVarD.a).h + ((grj) grkVarD.a).g;
                if (j4 > j3) {
                    j3 = j4;
                }
            }
            this.c.incrementAndGet();
            div.a().a.a(dmd.a, (grh) ((fin) griVarA.h()), gprVar);
            if (((dvi) this.a.a()).a() && ((dll) ((dvi) this.a.a()).b()).d) {
                div.a().a.a(dmm.a, str, true, j2, j3, gprVar);
            }
        }
    }
}
