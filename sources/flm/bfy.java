package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfy {
    public static final drf a = drf.a(bfv.a, "stats:wakeLocks:level", bgb.b);
    public static final drf b = drf.a(bfv.a, "stats:wakeLocks:time_out_duration", 600000L);
    public static final drf c;

    static {
        drf.a(bfv.a, "stats:wakeLocks:enable_log_calling_package_info", true);
        drf.a(bfv.a, "stats:wakeLocks:max_timeout_heldlock", Long.MAX_VALUE);
        drf.a(bfv.a, "stats_wakeLocks_enable_work_chains_pi", false);
        drf.a(bfv.a, "stats_wakeLocks_enable_synchronized_release", true);
        drf.a(bfv.a, "stats_wakeLocks_enable_timeout_cancellation", false);
        c = drf.a(bfv.a, "stats_wakeLocks_enable_floating_timeout", false);
        drf.a(bfv.a, "stats_wakeLocks_timeout_overrides", bfa.a, bfz.a);
    }
}
