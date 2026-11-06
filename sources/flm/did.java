package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class did implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ gtr c;
    private final /* synthetic */ gpr d;
    private final /* synthetic */ String e;
    private final /* synthetic */ dic f;

    did(dic dicVar, String str, boolean z, gtr gtrVar, gpr gprVar, String str2) {
        this.f = dicVar;
        this.a = str;
        this.b = z;
        this.c = gtrVar;
        this.d = gprVar;
        this.e = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.a(this.a, this.b, this.c, this.d, this.e);
    }
}
