package flm;

import android.os.Binder;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class dqz {
    public static Object a(dra draVar) {
        try {
            return draVar.a();
        } catch (SecurityException e) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return draVar.a();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
