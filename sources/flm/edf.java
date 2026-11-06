package flm;

import android.os.Build;
import android.util.Log;
import dalvik.system.VMStack;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class edf extends eck {
    public static final boolean e = edh.a();
    public static final boolean f;
    public static final ecm g;

    static boolean j() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new Class[0]);
            return edh.class.getName().equals(k());
        } catch (Throwable th) {
            return false;
        }
    }

    static String k() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable th) {
            return null;
        }
    }

    static Class l() {
        return VMStack.getStackClass2();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.eck
    public final ecm b() {
        return g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.eck
    public final ecg b(String str) {
        if (edi.b.get() != null) {
            return ((edc) edi.b.get()).a(str);
        }
        edi ediVar = new edi(str.replace('$', '.'));
        edj.a.offer(ediVar);
        if (edi.b.get() != null) {
            edi.b();
            return ediVar;
        }
        return ediVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // flm.eck
    public final String h() {
        return "platform: Android";
    }

    static {
        f = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        Log.class.getName();
        g = new edg();
    }
}
