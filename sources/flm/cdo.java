package flm;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdo extends cdc {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.content.Context, flm.ayt] */
    @Override // flm.cdc
    public final int a(bwg bwgVar, cdb cdbVar) {
        fcg fcgVar = (fcg) fin.b(fcg.c, bwgVar.f);
        long jB = btj.b();
        long j = fcgVar.b;
        Long l = (Long) buw.b.b();
        if (jB >= l.longValue() + j) {
            btv.d("Policy", "Ringing expired %s ago", Long.valueOf((jB - j) - l.longValue()));
            return 4;
        }
        ?? A = ayt.a();
        bui.a("Policy", "android.permission.READ_EXTERNAL_STORAGE");
        if (!bis.a((Context) A).a()) {
            btv.d("Policy", "Wrong profile for ringing, wait for profile switching", new Object[0]);
            return 1;
        }
        A.startService(new Intent().setClassName((Context) A, "com.google.android.gms.mdm.services.RingService"));
        btt.d();
        return 4;
    }

    @Override // flm.cdc
    public final void a(bwg bwgVar) {
    }
}
