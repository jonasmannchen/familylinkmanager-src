package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fov implements fou {
    public static final drf a;
    public static final drf b;
    public static final drf c;
    public static final drf d;
    public static final drf e;
    public static final drf f;
    public static final drf g;
    public static final drf h;
    public static final drf i;
    private static final drf j;

    @Override // flm.fou
    public final boolean a() {
        return ((Boolean) j.b()).booleanValue();
    }

    static {
        drn drnVarA = new drn(dre.a("com.google.android.gms")).a("gms:common:");
        a = drnVarA.a("Common__bind_pref_service_max_retries", 3L);
        b = drnVarA.a("Common__dump_open_files_on_oom", true);
        j = drnVarA.a("Common__enable_checkin_client_android_id", false);
        drnVarA.a("Common__enable_gms_flogger", false);
        c = drnVarA.a("Common__enable_gms_variant_logging", true);
        drnVarA.a("Common__enable_job_scheduler_schedule_as_package_in_gmscore", false);
        d = drnVarA.a("Common__enable_safe_shared_preferences", true);
        e = drnVarA.a("Common__enable_single_logger_for_opt_in_logging", false);
        f = drnVarA.a("Common__enable_tri_state_location_permission_monitor", false);
        g = drnVarA.a("Common__gcore_client_info_cache_size", 50L);
        h = drnVarA.a("Common__location_pending_intent_restriction", false);
        i = drnVarA.a("Common__use_watch_foreground_change_option", false);
    }
}
