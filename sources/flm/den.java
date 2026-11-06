package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class den {
    private static final drn a;
    private static final drf b;

    @Deprecated
    public static synchronized boolean a() {
        return ((Boolean) b.b()).booleanValue();
    }

    static {
        drn drnVarB = new drn(dre.a("com.google.android.gms.instantapps")).a("gms:wh:").b("Legacy__");
        a = drnVarB;
        b = drf.a(drnVarB, "enable_westinghouse_support", true);
    }
}
