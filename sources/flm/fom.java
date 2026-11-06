package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fom implements dvz {
    private static fom a = new fom();
    private final dvz b;

    public static boolean b() {
        return ((fon) a.a()).a();
    }

    private fom(dvz dvzVar) {
        this.b = dwa.a(dvzVar);
    }

    public fom() {
        this(dwa.a(new foo()));
    }

    @Override // flm.dvz
    public final /* synthetic */ Object a() {
        return (fon) this.b.a();
    }
}
