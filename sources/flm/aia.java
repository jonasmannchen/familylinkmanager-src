package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aia {
    public static sk d = new sl(20);
    public int a;
    public aft b;
    public aft c;

    private aia() {
    }

    public static aia a() {
        aia aiaVar = (aia) d.a();
        return aiaVar == null ? new aia() : aiaVar;
    }

    public static void a(aia aiaVar) {
        aiaVar.a = 0;
        aiaVar.b = null;
        aiaVar.c = null;
        d.a(aiaVar);
    }
}
