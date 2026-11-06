package flm;

import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gdi extends gfi {
    private final /* synthetic */ fuf t;
    private final /* synthetic */ frj u;
    private final /* synthetic */ fsc v;
    private final /* synthetic */ gdg w;

    /* JADX WARN: Illegal instructions before constructor call */
    gdi(gdg gdgVar, fuf fufVar, ftv ftvVar, frj frjVar, fsc fscVar) {
        this.w = gdgVar;
        this.t = fufVar;
        this.u = frjVar;
        this.v = fscVar;
        gfz gfzVar = gdgVar.a.M;
        long j = gdgVar.a.O;
        long j2 = gdgVar.a.P;
        gda gdaVar = gdgVar.a;
        Executor executor = frjVar.c;
        super(fufVar, ftvVar, gfzVar, j, j2, executor == null ? gdaVar.f : executor, gdgVar.a.e.a(), (ggj) frjVar.a(ggp.h), (gbu) frjVar.a(ggp.i), gdgVar.a.N);
    }

    @Override // flm.gfi
    final fvc a() {
        return this.w.a.B.a(this);
    }

    @Override // flm.gfi
    final void b() {
        gdz gdzVar = this.w.a.B;
        synchronized (gdzVar.a) {
            gdzVar.b.remove(this);
            if (gdzVar.b.isEmpty()) {
                gdzVar.b = new HashSet();
            }
        }
    }

    @Override // flm.gfi
    final fyz a(fru fruVar, ftv ftvVar) {
        frj frjVarA = this.u.a(fruVar);
        fzb fzbVarA = this.w.a(new ger(this.t, ftvVar, frjVarA));
        fsc fscVarC = this.v.c();
        try {
            return fzbVarA.a(this.t, ftvVar, frjVarA);
        } finally {
            this.v.a(fscVarC);
        }
    }
}
