package flm;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gbm implements fzb {
    private final /* synthetic */ fzb a;
    private final /* synthetic */ fru b;

    gbm(fzb fzbVar, fru fruVar) {
        this.a = fzbVar;
        this.b = fruVar;
    }

    @Override // flm.fzb
    public final fyz a(fuf fufVar, ftv ftvVar, frj frjVar) {
        return this.a.a(fufVar, ftvVar, frjVar.a(this.b));
    }

    @Override // flm.fzb
    public final void a(fzc fzcVar, Executor executor) {
        this.a.a(fzcVar, executor);
    }

    @Override // flm.ftk
    public final ftg b() {
        return this.a.b();
    }
}
