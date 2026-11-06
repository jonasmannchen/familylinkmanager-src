package flm;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnj {
    static djz a(Context context, djz djzVar) {
        drn drnVarB = new drn("primes-ph").b("PrimesFlagsFeature__").a(String.format("primes:%s:", context.getPackageName())).b();
        drn drnVarB2 = new drn("primes-ph").b("PrimesFlagsFeature__").a("primes:").b();
        dnl[] dnlVarArr = {new dnl("enable_leak_detection", djzVar.a), new dnl("enable_leak_detection_v2", djzVar.b), new dnl("enable_magic_eye_log", djzVar.c), new dnl("enable_startup_trace", djzVar.e), new dnl("enable_url_auto_sanitization", djzVar.f), new dnl("enable_persist_crash_stats", djzVar.d), new dnl("enable_primes_for_primes", djzVar.g)};
        HashMap map = new HashMap();
        for (int i = 0; i < 7; i++) {
            dnl dnlVar = dnlVarArr[i];
            map.put(dnlVar.a, drf.a(drnVarB, dnlVar.a, dnlVar.b));
        }
        map.put("disable_memory_summary_metrics", drf.a(drnVarB2, "disable_memory_summary_metrics", false));
        drf.b(context);
        Boolean bool = (Boolean) ((drf) map.get("enable_leak_detection_v2")).b();
        Boolean bool2 = (Boolean) ((drf) map.get("disable_memory_summary_metrics")).b();
        Boolean bool3 = (Boolean) ((drf) map.get("enable_leak_detection")).b();
        Boolean bool4 = (Boolean) ((drf) map.get("enable_magic_eye_log")).b();
        Boolean bool5 = (Boolean) ((drf) map.get("enable_persist_crash_stats")).b();
        Boolean bool6 = (Boolean) ((drf) map.get("enable_startup_trace")).b();
        Boolean bool7 = (Boolean) ((drf) map.get("enable_url_auto_sanitization")).b();
        Boolean bool8 = (Boolean) ((drf) map.get("enable_primes_for_primes")).b();
        dka dkaVar = new dka();
        dkaVar.a = bool3.booleanValue();
        dkaVar.b = bool.booleanValue();
        dkaVar.c = bool2.booleanValue();
        dkaVar.d = bool4.booleanValue();
        dkaVar.e = bool5.booleanValue();
        dkaVar.f = bool6.booleanValue();
        dkaVar.g = bool7.booleanValue();
        dkaVar.h = bool8.booleanValue();
        return dkaVar.a();
    }
}
