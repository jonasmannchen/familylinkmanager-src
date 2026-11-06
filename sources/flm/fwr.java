package flm;

import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fwr extends fui {
    private final /* synthetic */ fwq a;

    fwr(fwq fwqVar) {
        this.a = fwqVar;
    }

    @Override // flm.fui
    public final String a() {
        return this.a.c;
    }

    @Override // flm.fui
    public final void a(fuk fukVar) {
        fukVar.a(Collections.singletonList(new fss(this.a.b)), frd.b);
    }

    @Override // flm.fui
    public final void b() {
    }
}
