package flm;

import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class dsv extends dsl {
    public final dtn c;

    dsv(String str, UUID uuid, dtn dtnVar) {
        super(str, uuid);
        dvl.a(dtnVar.c);
        this.c = dtnVar;
    }

    dsv(String str, dtq dtqVar, dtn dtnVar) {
        super(str, dtqVar);
        dvl.a(dtnVar.c);
        this.c = dtnVar;
    }

    @Override // flm.dtq
    public final dtl a(dtm dtmVar) {
        return dtn.a(dtmVar, this.c, duo.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
    }
}
