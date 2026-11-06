package flm;

import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dsx extends dsl implements dst {
    private static final dsu c = new dsu();
    private final dsu d;

    dsx() {
        super("", UUID.randomUUID());
        if (dtr.a()) {
            this.d = new dsu();
        } else {
            this.d = c;
        }
    }

    @Override // flm.dtq
    public final dtq a(String str, dtn dtnVar) {
        duj.a(true);
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
    public final /* synthetic */ Exception d() {
        return this.d;
    }
}
