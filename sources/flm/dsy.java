package flm;

import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dsy extends dsl implements dst {
    private final Exception c;

    dsy(String str, dst dstVar) {
        super(str, dstVar);
        this.c = dstVar.d();
    }

    dsy(String str) {
        super(str, UUID.randomUUID());
        this.c = new dsu();
    }

    @Override // flm.dtq
    public final dtq a(String str, dtn dtnVar) {
        return new dsy(str, this);
    }

    @Override // flm.dtq
    public final dtl a(dtm dtmVar) {
        return dtl.a(dp.Z);
    }

    @Override // flm.dtq
    public final void a(boolean z) {
    }

    @Override // flm.dtq
    public final void a(int i) {
    }

    @Override // flm.dtq
    public final boolean e() {
        return false;
    }

    @Override // flm.dst
    public final Exception d() {
        return this.c;
    }
}
