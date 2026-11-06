package flm;

import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ka extends jx {
    private final /* synthetic */ rt a;
    private final /* synthetic */ jz b;

    ka(jz jzVar, rt rtVar) {
        this.b = jzVar;
        this.a = rtVar;
    }

    @Override // flm.jx, flm.jw
    public final void a(jq jqVar) {
        ((ArrayList) this.a.get(this.b.a)).remove(jqVar);
    }
}
