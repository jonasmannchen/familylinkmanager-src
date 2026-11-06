package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fra implements dvz {
    public static fra a = new fra();
    private final dvz b;

    public static boolean b() {
        return ((frb) a.a()).b();
    }

    public static boolean c() {
        return ((frb) a.a()).c();
    }

    public static boolean d() {
        return ((frb) a.a()).d();
    }

    private fra(dvz dvzVar) {
        this.b = dwa.a(dvzVar);
    }

    public fra() {
        this(dwa.a(new frc()));
    }

    @Override // flm.dvz
    public final /* synthetic */ Object a() {
        return (frb) this.b.a();
    }
}
