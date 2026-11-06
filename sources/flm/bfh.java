package flm;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bfh {
    public static final bfh a = new bfh(ayt.a());
    private final aon b;

    private bfh(Context context) {
        aob aobVar = new aob(context, "GMSCORE_BACKEND_COUNTERS", null);
        aobVar.a(fnk.UNMETERED_OR_DAILY);
        this.b = new aon(aobVar, aobVar.e, 100);
        this.b.a();
        aon aonVar = this.b;
        bhc bhcVarB = bgy.b(1, 10);
        aonVar.h.writeLock().lock();
        try {
            aonVar.e = bhcVarB;
            if (aonVar.e != null) {
                aonVar.d = 3600000;
                aonVar.b();
            } else {
                aonVar.d = 0;
            }
        } finally {
            aonVar.h.writeLock().unlock();
        }
    }

    public final void a(fuf fufVar, fvc fvcVar) {
        String strConcat;
        if (((Boolean) azg.a.b()).booleanValue()) {
            if (fufVar != null) {
                String str = fufVar.b;
                String strValueOf = String.valueOf(str.substring(str.lastIndexOf(46) + 1));
                strConcat = strValueOf.length() != 0 ? "GRPC-".concat(strValueOf) : new String("GRPC-");
            } else {
                strConcat = "GRPC";
            }
            this.b.c(strConcat).a(fvcVar.m.r);
        }
    }

    public final void a() {
        if (((Boolean) azg.a.b()).booleanValue() && ((Boolean) azg.b.b()).booleanValue()) {
            this.b.c();
        }
    }
}
