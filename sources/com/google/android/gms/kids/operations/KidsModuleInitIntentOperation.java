package com.google.android.gms.kids.operations;

import android.content.Context;
import com.google.android.gms.common.app.BaseApplicationContext;
import com.google.android.gms.kids.database.SupervisionDatabase;
import flm.aoa;
import flm.ayt;
import flm.bte;
import flm.btj;
import flm.btt;
import flm.btv;
import flm.bty;
import flm.bue;
import flm.buk;
import flm.bum;
import flm.buw;
import flm.euz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class KidsModuleInitIntentOperation extends aoa {
    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // flm.aoa
    public final void a(int i) {
        BaseApplicationContext baseApplicationContextA = ayt.a();
        long jB = SupervisionDatabase.h().k().b("key_onboarded_disclaimer_notification_start_time_millis") + ((Long) buw.f.b()).longValue();
        long jB2 = btj.b();
        if (jB2 > jB) {
            bue.a(baseApplicationContextA);
        } else {
            bue.a(baseApplicationContextA, jB - jB2);
        }
        if (bum.a()) {
            bte.b((Context) this);
            if ((i & 2) != 0) {
                btv.b("System", "onBootCompleted", new Object[0]);
                btt.i();
                btj.d();
                SupervisionDatabase.h().m().a(10, btj.b());
            }
            if ((i & 4) != 0) {
                btv.c("System", "onInitRuntimeState()", new Object[0]);
                btt.l();
                bte.a((Context) baseApplicationContextA, true);
                SupervisionDatabase.h().m().a(4, btj.b());
            }
            bty.a(this);
            buk.a(euz.FORCED_SYNC);
        }
    }
}
