package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fqc implements dvz {
    public static fqc a = new fqc();
    private final dvz b;

    public static boolean b() {
        return ((fqd) a.a()).a();
    }

    public static boolean c() {
        return ((fqd) a.a()).c();
    }

    public static long d() {
        return ((fqd) a.a()).e();
    }

    private fqc(dvz dvzVar) {
        this.b = dwa.a(dvzVar);
    }

    public fqc() {
        this(dwa.a(new fqe()));
    }

    @Override // flm.dvz
    public final /* synthetic */ Object a() {
        return (fqd) this.b.a();
    }
}
