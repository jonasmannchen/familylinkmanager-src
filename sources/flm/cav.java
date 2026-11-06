package flm;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cav {
    public static void a(euz euzVar) {
        if (a("REPORT_DEVICE_STATES", caw.e(euzVar))) {
            caw.a(euzVar);
        }
    }

    public static void b(euz euzVar) {
        if (a("SYNC_AND_APPLY_POLICY", caw.e(euzVar))) {
            caw.c(euzVar);
        }
    }

    public static void c(euz euzVar) {
        if (a("APPLY_POLICY", caw.e(euzVar))) {
            caw.d(euzVar);
        }
    }

    public static void a(int i, String str, String str2) {
        if (a("FINISH_DEVICE_SETUP", caw.b(i, str, str2))) {
            caw.a(i, str, str2);
        }
    }

    public static boolean a(String str, Bundle bundle) {
        return cau.a(str, bundle) == 1;
    }
}
