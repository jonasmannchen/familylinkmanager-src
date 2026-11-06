package flm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fyb extends fsx {
    private final /* synthetic */ fya a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fyb(fya fyaVar, frn frnVar) {
        super(frnVar);
        this.a = fyaVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020  */
    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0070  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    @Override // flm.fsw, flm.fup, flm.frn
    public final void a(fvc fvcVar, ftv ftvVar) {
        fxy fxyVar;
        gld gldVarA;
        fxx fxxVar = this.a.a;
        if (fxx.a != null) {
            if (fxx.a.getAndSet(fxxVar, 1) == 0) {
                if (fxxVar.g) {
                    dvw dvwVar = fxxVar.c;
                    long jA = dvwVar.a.a();
                    dvl.b(dvwVar.b, "This stopwatch is already stopped.");
                    dvwVar.b = false;
                    dvwVar.c = (jA - dvwVar.d) + dvwVar.c;
                    fxxVar.c.a(TimeUnit.NANOSECONDS);
                    fxyVar = fxxVar.d;
                    if (fxyVar == null) {
                        fxyVar = fxv.c;
                    }
                    gldVarA = fxxVar.b.e.a().a();
                    double d = fxv.b;
                    if (gldVarA == null) {
                        throw null;
                    }
                    long j = fxyVar.a;
                    if (gldVarA == null) {
                        throw null;
                    }
                    long j2 = fxyVar.b;
                    if (gldVarA == null) {
                        throw null;
                    }
                    long j3 = fxyVar.c;
                    if (gldVarA == null) {
                        throw null;
                    }
                    long j4 = fxyVar.d;
                    if (gldVarA == null) {
                        throw null;
                    }
                    long j5 = fxyVar.e;
                    if (gldVarA == null) {
                        throw null;
                    }
                    long j6 = fxyVar.f;
                    if (gldVarA == null) {
                        throw null;
                    }
                    if (fvcVar.a() && gldVarA == null) {
                        throw null;
                    }
                    gldVarA.a(fxxVar.b.d.a(fxxVar.f).a(gku.a, gly.a(fvcVar.m.toString())).a());
                }
            }
        } else if (fxxVar.e == 0) {
            fxxVar.e = 1;
            if (fxxVar.g) {
                dvw dvwVar2 = fxxVar.c;
                long jA2 = dvwVar2.a.a();
                dvl.b(dvwVar2.b, "This stopwatch is already stopped.");
                dvwVar2.b = false;
                dvwVar2.c = (jA2 - dvwVar2.d) + dvwVar2.c;
                fxxVar.c.a(TimeUnit.NANOSECONDS);
                fxyVar = fxxVar.d;
                if (fxyVar == null) {
                    fxyVar = fxv.c;
                }
                gldVarA = fxxVar.b.e.a().a();
                double d2 = fxv.b;
                if (gldVarA == null) {
                    throw null;
                }
                long j7 = fxyVar.a;
                if (gldVarA == null) {
                    throw null;
                }
                long j8 = fxyVar.b;
                if (gldVarA == null) {
                    throw null;
                }
                long j9 = fxyVar.c;
                if (gldVarA == null) {
                    throw null;
                }
                long j10 = fxyVar.d;
                if (gldVarA == null) {
                    throw null;
                }
                long j11 = fxyVar.e;
                if (gldVarA == null) {
                    throw null;
                }
                long j12 = fxyVar.f;
                if (gldVarA == null) {
                    throw null;
                }
                if (fvcVar.a()) {
                }
                gldVarA.a(fxxVar.b.d.a(fxxVar.f).a(gku.a, gly.a(fvcVar.m.toString())).a());
            }
        }
        super.a(fvcVar, ftvVar);
    }
}
