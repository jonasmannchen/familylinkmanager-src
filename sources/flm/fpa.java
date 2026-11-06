package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpa implements dvz {
    public static fpa a = new fpa();
    private final dvz b;

    public static boolean b() {
        return ((fpb) a.a()).a();
    }

    private fpa(dvz dvzVar) {
        this.b = dwa.a(dvzVar);
    }

    public fpa() {
        this(dwa.a(new fpc()));
    }

    @Override // flm.dvz
    public final /* synthetic */ Object a() {
        return (fpb) this.b.a();
    }
}
