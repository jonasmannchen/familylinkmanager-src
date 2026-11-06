package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dmg implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ gtr c;
    private final /* synthetic */ gpr d;
    private final /* synthetic */ dmf e;

    dmg(dmf dmfVar, String str, boolean z, gtr gtrVar, gpr gprVar) {
        this.e = dmfVar;
        this.a = str;
        this.b = z;
        this.c = gtrVar;
        this.d = gprVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.e.d.a()) {
            this.e.a(this.a, this.b, this.c, this.d);
        } else if (((dks) this.e.d.b()).a()) {
            this.e.a(this.a, this.b, this.c, this.d);
        }
    }
}
