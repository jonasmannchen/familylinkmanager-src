package flm;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class caw {
    private static final long a = TimeUnit.DAYS.toSeconds(1);
    private static final long b = TimeUnit.MINUTES.toSeconds(24);
    private static final long c = TimeUnit.MINUTES.toSeconds(2);

    public static void a() {
        long j = a;
        btv.c("Job", "schedule job %s", "SANITY_CHECK");
        eoi eoiVar = eoi.JOB_SCHEDULED;
        elq elqVarA = ((elq) ((fio) elp.i.a(dp.au, (Object) null))).a("SANITY_CHECK").a(elr.PERIODIC);
        elqVarA.c();
        elp elpVar = (elp) elqVarA.a;
        elpVar.a |= 64;
        elpVar.h = j;
        btt.a(eoiVar, (elp) ((fin) elqVarA.h()));
        bqd bqdVar = new bqd();
        bqdVar.d = "com.google.android.gms.kids.JobService";
        bqdVar.e = "SANITY_CHECK";
        bqdVar.f = false;
        bqdVar.i = bqe.a;
        bqdVar.c = 2;
        bqdVar.a = j;
        bqdVar.g = true;
        bqdVar.c = 0;
        a(bqdVar);
    }

    public static void b() {
        bqa bqaVarA = a("GRADUATION", 0L, 5L);
        bqaVarA.c = 2;
        a(bqaVarA);
    }

    public static void a(euz euzVar) {
        bqa bqaVarA = a("REPORT_DEVICE_STATES", 10L, a);
        bqaVarA.c = 0;
        bqaVarA.j = e(euzVar);
        a(bqaVarA);
    }

    public static void b(euz euzVar) {
        bqa bqaVarA = a("REPORT_DEVICE_STATES", 10L, a);
        bqaVarA.c = 0;
        bqaVarA.j = f(euzVar);
        a(bqaVarA);
    }

    public static void c(euz euzVar) {
        a(euzVar, 0);
    }

    public static void a(euz euzVar, int i) {
        btt.a("Job", "syncPolicy", "Policy sync and apply scheduled", new Object[0]);
        bqa bqaVarA = a("SYNC_AND_APPLY_POLICY", i, a);
        bqaVarA.c = 0;
        bqaVarA.j = e(euzVar);
        a(bqaVarA);
    }

    public static void d(euz euzVar) {
        bqa bqaVarA = a("APPLY_POLICY", 0L, a);
        bqaVarA.j = e(euzVar);
        a(bqaVarA);
    }

    public static void a(int i, String str, String str2) {
        Bundle bundleB = b(i, str, str2);
        bqa bqaVarA = a("FINISH_DEVICE_SETUP", 0L, a);
        bqaVarA.j = bundleB;
        bqaVarA.c = i != 2 ? 0 : 2;
        a(bqaVarA);
    }

    public static void a(int i, String str, String str2, String str3, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("key_supervised_account_email", str);
        bundle.putInt("key_supervision_setup_state", i);
        bundle.putString("key_child_gaia_id", str2);
        bundle.putString("key_child_device_name", str3);
        long j = z ? 0L : b;
        bqa bqaVarA = a("DEVICE_SETUP_SAFETY_NET", j, c + j);
        bqaVarA.j = bundle;
        bqaVarA.c = i == 2 ? 2 : 0;
        a(bqaVarA);
    }

    public static void a(String str) {
        dvl.a(!TextUtils.isEmpty(str), "Invalid email passed to KidsJobScheduler");
        Bundle bundle = new Bundle();
        bundle.putString("key_supervised_account_email", str);
        bundle.putInt("key_supervision_setup_state", 2);
        bqa bqaVarA = a("DEVICE_SETUP_SAFETY_NET", b, b + c);
        bqaVarA.j = bundle;
        bqaVarA.f = false;
        bqaVarA.c = 2;
        a(bqaVarA);
    }

    public static void c() {
        bqa bqaVarA = a("SUPERVISION_EXIT_RECOVERY", TimeUnit.MINUTES.toSeconds(10L), TimeUnit.HOURS.toSeconds(2L));
        bqaVarA.c = 0;
        a(bqaVarA);
    }

    public static void d() {
        bqa bqaVarA = a("FETCH_CONSENT_STATUSES", 0L, a);
        bqaVarA.c = 0;
        bqaVarA.f = false;
        a(bqaVarA);
    }

    public static void a(long j) {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        a(a("DISMISS_SEVEN_DAY_NOTIFICATION", seconds, TimeUnit.HOURS.toSeconds(1L) + seconds));
    }

    public static void e() throws Throwable {
        Throwable th;
        Throwable th2 = null;
        btv.b("Job", "Cancelling all scheduled jobs", new Object[0]);
        bpq bpqVarA = bpq.a((Context) ayt.a());
        ComponentName componentName = new ComponentName(bpqVarA.a, "com.google.android.gms.kids.JobService");
        bqk bqkVar = new bqk("nts:client:cancelAll");
        try {
            bpqVarA.a(componentName.getClassName());
            bpqVarA.a().a(componentName);
            bpq.a((Throwable) null, bqkVar);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                th2 = th3;
                th = th4;
                bpq.a(th2, bqkVar);
                throw th;
            }
        }
    }

    static Bundle e(euz euzVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("key_sync_trigger", euzVar.n);
        return bundle;
    }

    public static Bundle f(euz euzVar) {
        Bundle bundleE = e(euzVar);
        bundleE.putBoolean("key_full_report", true);
        return bundleE;
    }

    public static Bundle b(int i, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putInt("key_supervision_setup_state", i);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("key_child_gaia_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("key_child_device_name", str2);
        }
        return bundle;
    }

    private static void a(bqi bqiVar) {
        bpq.a((Context) ayt.a()).a(bqiVar.b());
    }

    @SuppressLint({"MissingPermission"})
    private static bqa a(String str, long j, long j2) {
        btv.c("Job", "schedule job %s", str);
        eoi eoiVar = eoi.JOB_SCHEDULED;
        elq elqVarA = ((elq) ((fio) elp.i.a(dp.au, (Object) null))).a(str).a(elr.ONE_OFF);
        elqVarA.c();
        elp elpVar = (elp) elqVarA.a;
        elpVar.a |= 16;
        elpVar.f = j;
        elqVarA.c();
        elp elpVar2 = (elp) elqVarA.a;
        elpVar2.a |= 32;
        elpVar2.g = j2;
        btt.a(eoiVar, (elp) ((fin) elqVarA.h()));
        bqa bqaVar = new bqa();
        bqaVar.d = "com.google.android.gms.kids.JobService";
        bqaVar.e = str;
        bqaVar.f = true;
        bqaVar.i = bqe.a;
        bqaVar.c = 2;
        bqaVar.a = j;
        bqaVar.b = j2;
        bqaVar.g = true;
        return bqaVar;
    }
}
