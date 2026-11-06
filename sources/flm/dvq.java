package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dvq extends dvu {
    private final /* synthetic */ dvp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dvq(dvp dvpVar, dvo dvoVar, CharSequence charSequence) {
        super(dvoVar, charSequence);
        this.c = dvpVar;
    }

    @Override // flm.dvu
    final int a(int i) {
        return this.c.a.a(this.b, i);
    }

    @Override // flm.dvu
    final int b(int i) {
        return i + 1;
    }
}
