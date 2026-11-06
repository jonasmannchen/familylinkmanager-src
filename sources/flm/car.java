package flm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class car {
    public static fuf b;
    public static fuf c;
    public static fuf d;
    public static fuf e;
    public static fuf f;
    public static fuf g;
    public static fuf h;
    public static fuf i;
    public static fuf j;
    public static fuf k;
    public static fuf l;
    public static fuf m;
    public static fuf n;
    private static fuf o;
    private static fuf p;
    private static fuf q;
    public final bfg a;

    public car(bfg bfgVar) {
        this.a = bfgVar;
    }

    public final eyu a(baw bawVar, eys eysVar) {
        if (o == null) {
            o = fuf.a(fuh.UNARY, "google.kidsmanagement.v1.KidsManagementService/InitializeDeviceSetup", gkn.a(eys.d), gkn.a(eyu.d));
        }
        return (eyu) this.a.a(o, bawVar, eysVar, 10000L, TimeUnit.MILLISECONDS);
    }

    public final eyy a(baw bawVar, eyw eywVar) {
        if (p == null) {
            p = fuf.a(fuh.UNARY, "google.kidsmanagement.v1.KidsManagementService/InitializeSupervision", gkn.a(eyw.f), gkn.a(eyy.a));
        }
        return (eyy) this.a.a(p, bawVar, eywVar, 10000L, TimeUnit.MILLISECONDS);
    }

    public final evz a(baw bawVar, evx evxVar) {
        if (q == null) {
            q = fuf.a(fuh.UNARY, "google.kidsmanagement.v1.KidsManagementService/CreateConsentForSecondaryAccount", gkn.a(evx.d), gkn.a(evz.a));
        }
        return (evz) this.a.a(q, bawVar, evxVar, 10000L, TimeUnit.MILLISECONDS);
    }
}
