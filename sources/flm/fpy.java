package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpy implements dvz {
    public static fpy a = new fpy();
    private final dvz b;

    public static boolean b() {
        return ((fpz) a.a()).a();
    }

    public static String c() {
        return ((fpz) a.a()).b();
    }

    public static boolean d() {
        return ((fpz) a.a()).c();
    }

    private fpy(dvz dvzVar) {
        this.b = dwa.a(dvzVar);
    }

    public fpy() {
        this(dwa.a(new fqa()));
    }

    @Override // flm.dvz
    public final /* synthetic */ Object a() {
        return (fpz) this.b.a();
    }
}
