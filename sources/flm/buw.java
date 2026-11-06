package flm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class buw {
    public static final drf a;
    public static final drf b;
    public static final drf c;
    public static final drf d;
    public static final drf e;
    public static final drf f;
    public static final drf g;
    public static final drf h;
    public static final drf i;
    public static final drf j;
    public static final drf k;
    private static final drn l;

    static {
        String str;
        byte b2 = -1;
        switch ("com.google.android.gms.kids".hashCode()) {
            case 325967270:
                if ("com.google.android.gms.kids".equals("com.google.android.gms")) {
                    b2 = 0;
                }
                break;
        }
        switch (b2) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                str = "direct_boot:gms_chimera_phenotype_flags";
                break;
            default:
                String strValueOf = String.valueOf("com.google.android.gms.kids");
                String strValueOf2 = String.valueOf("_ph_flags");
                str = strValueOf2.length() == 0 ? new String(strValueOf) : strValueOf.concat(strValueOf2);
                break;
        }
        drn drnVarB = new drn(str).a("kids_").b("gms:kids:");
        l = drnVarB;
        a = drf.a(drnVarB, "graduation_gcm_sync_policy_delay_seconds", 10);
        b = drf.a(l, "ringing_expire_time_ms", TimeUnit.MINUTES.toMillis(5L));
        c = drf.a(l, "usage_report_interval_coarse_ms", TimeUnit.MINUTES.toMillis(15L));
        d = drf.a(l, "usage_report_interval_fine_ms", TimeUnit.MINUTES.toMillis(5L));
        e = drf.a(l, "enable_reset_password_with_token", false);
        f = drf.a(l, "member_sv_persistent_notification_duration_millis", TimeUnit.DAYS.toMillis(7L));
        g = drf.a(l, "recovery_task_rate_limit_millis", TimeUnit.MINUTES.toMillis(30L));
        h = drf.a(l, "enable_debug_activity_in_google_settings", true);
        i = drf.a(l, "enable_debug_location_refresh", false);
        j = drf.a(l, "parent_access_code_verification_failed_penalty_millis", bbx.DEFAULT_UNBIND_DELAY_MILLIS);
        k = drf.a(l, "test_only_throw_exception_in_hide_app_policy_processor", false);
    }
}
