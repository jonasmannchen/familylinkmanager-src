package flm;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bei {
    private static aon a;
    private final String b;

    public static bei a(Context context, String str) {
        synchronized (bei.class) {
            if (a == null) {
                aob aobVar = new aob(context, "GMSCORE_NOTIFICATION_COUNTERS", null);
                aobVar.a(fnk.UNMETERED_OR_DAILY);
                a = new aon(aobVar, "GMSCORE_NOTIFICATION_COUNTERS", 1024);
            }
        }
        return new bei(str);
    }

    private static synchronized void a(String str) {
        if (((fpe) fpd.a.a()).b()) {
            a.b(str).a(0L, 1L);
            a.c();
        }
    }

    private bei(String str) {
        this.b = (String) bdi.checkNotNull(str);
    }

    public final void a() {
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf("-notified");
        a(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
    }

    public final void b() {
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf("-cancelled");
        a(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
    }

    public final void c() {
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf("-blocked");
        a(strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
    }
}
