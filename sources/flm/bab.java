package flm;

import android.os.Binder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bab {
    public static long a(azl azlVar) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return ((Long) azlVar.b()).longValue();
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }
}
