package flm;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gaz implements fzb {
    public final fvc a;
    private final int b;

    gaz(fvc fvcVar, int i) {
        dvl.a(!fvcVar.a(), "error must not be OK");
        this.a = fvcVar;
        this.b = i;
    }

    @Override // flm.fzb
    public final fyz a(fuf fufVar, ftv ftvVar, frj frjVar) {
        return new gay(this.a, this.b);
    }

    @Override // flm.fzb
    public final void a(fzc fzcVar, Executor executor) {
        executor.execute(new gba(this, fzcVar));
    }

    @Override // flm.ftk
    public final ftg b() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
