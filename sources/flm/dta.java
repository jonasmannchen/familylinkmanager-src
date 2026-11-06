package flm;

import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dta extends dsv {
    private static final UUID d = UUID.randomUUID();

    static dtq b(String str, dtn dtnVar) {
        return new dta(str, d, dtnVar);
    }

    private dta(String str, UUID uuid, dtn dtnVar) {
        super(str, uuid, dtnVar);
    }

    private dta(dta dtaVar, String str, dtn dtnVar) {
        super(str, dtaVar, dtnVar);
    }

    @Override // flm.dtq
    public final dtq a(String str, dtn dtnVar) {
        return new dta(this, str, dtnVar);
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
}
