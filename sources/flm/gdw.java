package flm;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gdw extends frl {
    private final String a;
    private final /* synthetic */ gda b;

    gdw(gda gdaVar, String str) {
        this.b = gdaVar;
        this.a = (String) dvl.a(str, "authority");
    }

    @Override // flm.frl
    public final frm a(fuf fufVar, frj frjVar) {
        gda gdaVar = this.b;
        Executor executor = frjVar.c;
        if (executor == null) {
            executor = gdaVar.f;
        }
        fyo fyoVar = new fyo(fufVar, executor, frjVar, this.b.V, this.b.E ? null : this.b.e.a(), this.b.H, this.b.Q);
        fyoVar.g = this.b.l;
        fyoVar.h = this.b.m;
        fyoVar.i = this.b.n;
        return fyoVar;
    }

    @Override // flm.frl
    public final String a() {
        return this.a;
    }
}
