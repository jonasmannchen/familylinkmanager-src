package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpf implements fpe {
    private static final drf a;
    private static final drf b;
    private static final drf c;

    @Override // flm.fpe
    public final String a() {
        return (String) a.b();
    }

    @Override // flm.fpe
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // flm.fpe
    public final boolean c() {
        return ((Boolean) c.b()).booleanValue();
    }

    static {
        drn drnVarA = new drn(dre.a("com.google.android.gms")).a();
        a = drnVarA.a("Notifications__blocked_modules", "");
        b = drnVarA.a("Notifications__counters_enabled", false);
        c = drnVarA.a("Notifications__manager_enabled", true);
    }
}
