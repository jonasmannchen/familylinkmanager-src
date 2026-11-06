package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fop implements dvz {
    private static fop a = new fop();
    private final dvz b;

    public static boolean b() {
        return ((foq) a.a()).a();
    }

    private fop(dvz dvzVar) {
        this.b = dwa.a(dvzVar);
    }

    public fop() {
        this(dwa.a(new Cfor()));
    }

    @Override // flm.dvz
    public final /* synthetic */ Object a() {
        return (foq) this.b.a();
    }
}
