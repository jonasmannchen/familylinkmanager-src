package flm;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class cau {
    public static int a(String str, Bundle bundle) {
        cat cbjVar;
        switch (str) {
            case "SANITY_CHECK":
                cbjVar = new cbi();
                break;
            case "GRADUATION":
                cbjVar = new cbg();
                break;
            case "REPORT_DEVICE_STATES":
                cbjVar = new cbh();
                break;
            case "SYNC_AND_APPLY_POLICY":
                cbjVar = new cbk();
                break;
            case "APPLY_POLICY":
                cbjVar = new cax();
                break;
            case "DEVICE_SETUP_SAFETY_NET":
                cbjVar = new cay();
                break;
            case "FINISH_DEVICE_SETUP":
                cbjVar = new cbf();
                break;
            case "FETCH_CONSENT_STATUSES":
                cbjVar = new cba();
                break;
            case "DISMISS_SEVEN_DAY_NOTIFICATION":
                cbjVar = new caz();
                break;
            case "SUPERVISION_EXIT_RECOVERY":
                cbjVar = new cbj();
                break;
            default:
                cbjVar = null;
                break;
        }
        StringBuilder sb = new StringBuilder();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                sb.append("<").append(str2).append(": ").append(bundle.get(str2));
            }
        }
        Object[] objArr = {str, sb};
        elp elpVar = (elp) ((fin) ((elq) ((fio) elp.i.a(dp.au, (Object) null))).a(str).h());
        if (cbjVar == null) {
            btv.d("Job", "Unsupported job: %s", str);
            btt.a("Job", str, "Unsupported job", new Object[0]);
            return 2;
        }
        btt.a(eoi.JOB_TRIGGERED, (elp) ((fin) ((elq) ((fio) elp.i.a(dp.au, (Object) null))).a(str).h()));
        try {
            cbjVar.a(bundle);
            btt.a(eoi.JOB_FINISHED, elpVar);
            btv.c("Job", "Job:%s success", str);
            return 0;
        } catch (bxj e) {
            btv.b("Job", e, "Job:%s failed, retry", str);
            btt.a(elpVar, e, "Job failed, retry", new Object[0]);
            return 1;
        } catch (Throwable th) {
            btv.c("Job", th, "JobTag:%s failed", str);
            btt.a(elpVar, th, "Job failed", new Object[0]);
            return 2;
        }
    }
}
