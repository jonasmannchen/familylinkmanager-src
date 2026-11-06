package com.google.android.gms.kids.job;

import flm.bpr;
import flm.bqj;
import flm.btt;
import flm.btv;
import flm.bum;
import flm.cau;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class KidsChimeraJobService extends bpr {
    @Override // flm.bpr
    public final void onCreate() {
        super.onCreate();
    }

    @Override // flm.bpr
    public final void onInitializeTasks() {
        super.onInitializeTasks();
    }

    @Override // flm.bpr
    public final int onRunTask(bqj bqjVar) {
        String str = bqjVar.a;
        btv.a("Job", "onRunTask:%s", str);
        int iB = bum.b();
        if (iB == 0) {
            return cau.a(str, bqjVar.b);
        }
        if (iB == 3 && ("GRADUATION".equals(str) || "SYNC_AND_APPLY_POLICY".equals(str))) {
            return cau.a(str, bqjVar.b);
        }
        if (iB == 1 && "FINISH_DEVICE_SETUP".equals(str)) {
            return cau.a(str, bqjVar.b);
        }
        if ("DEVICE_SETUP_SAFETY_NET".equals(str)) {
            return cau.a(str, bqjVar.b);
        }
        btt.a("Job", str, "Unexpected supervision status: %s", Integer.valueOf(iB));
        bum.a(iB);
        return 2;
    }
}
