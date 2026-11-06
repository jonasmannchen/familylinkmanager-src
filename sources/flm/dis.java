package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dis implements diu {
    private final /* synthetic */ dme a;
    private final /* synthetic */ String b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ gpr d;
    private final /* synthetic */ int e;

    dis(dme dmeVar, String str, boolean z, gpr gprVar, int i) {
        this.a = dmeVar;
        this.b = str;
        this.c = z;
        this.d = gprVar;
        this.e = i;
    }

    @Override // flm.diu
    public final void a(dgo dgoVar) {
        dgoVar.a(this.a, this.b, this.c, this.d, this.e);
    }
}
