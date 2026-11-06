package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class u implements w {
    private final t a;

    u(t tVar) {
        this.a = tVar;
    }

    @Override // flm.w
    public final void a(af afVar, y yVar) {
        switch (yVar.ordinal()) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                this.a.a();
                return;
            case 1:
                this.a.a(afVar);
                return;
            case 2:
                this.a.b(afVar);
                return;
            case 3:
                this.a.c(afVar);
                return;
            case 4:
                this.a.d(afVar);
                return;
            case 5:
                this.a.b();
                return;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
