package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aw implements ba {
    private final /* synthetic */ au a;

    aw(au auVar) {
        this.a = auVar;
    }

    @Override // flm.ba
    public final void a() {
    }

    @Override // flm.ba
    public final void b() {
        au auVar = this.a;
        auVar.a++;
        if (auVar.a == 1 && auVar.d) {
            auVar.f.a(y.ON_START);
            auVar.d = false;
        }
    }

    @Override // flm.ba
    public final void c() {
        au auVar = this.a;
        auVar.b++;
        if (auVar.b == 1) {
            if (auVar.c) {
                auVar.f.a(y.ON_RESUME);
                auVar.c = false;
            } else {
                auVar.e.removeCallbacks(auVar.g);
            }
        }
    }
}
