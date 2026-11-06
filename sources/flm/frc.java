package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class frc implements frb {
    private static final drf a;
    private static final drf b;
    private static final drf c;
    private static final drf d;

    @Override // flm.frb
    public final String a() {
        return (String) a.b();
    }

    @Override // flm.frb
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // flm.frb
    public final boolean c() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // flm.frb
    public final boolean d() {
        return ((Boolean) d.b()).booleanValue();
    }

    static {
        drn drnVarA = new drn(dre.a("com.google.android.gms.kids")).a();
        a = drnVarA.a("TimeLimitFeature__additional_suspension_whitelist", "");
        b = drnVarA.a("TimeLimitFeature__detect_foreground_app_with_usage_stats", false);
        c = drnVarA.a("TimeLimitFeature__enable_app_suspension", false);
        d = drnVarA.a("gms:kids:time_limit_whitelist_apps", false);
    }
}
