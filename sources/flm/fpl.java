package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpl implements fpk {
    private static final drf a;
    private static final drf b;

    @Override // flm.fpk
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // flm.fpk
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }

    static {
        drn drnVar = new drn(dre.a("com.google.android.gms"));
        drnVar.a("Providence__enable_on_get_service_tracing", false);
        a = drnVar.a("Providence__include_gcore_dimensions_in_api_counter", false);
        b = drnVar.a("Providence__skip_global_processors", true);
        drnVar.a("Providence__use_noop_synchronizer_persistent_process", false);
    }
}
