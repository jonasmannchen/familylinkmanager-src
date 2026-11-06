package flm;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bis {
    private static volatile Boolean a;

    public static bis a(Context context) {
        return new bit(context);
    }

    @TargetApi(17)
    public final boolean a() {
        try {
            return a(ActivityManager.getCurrentUser());
        } catch (Throwable th) {
            Log.wtf("MultiUserUtil", th);
            return true;
        }
    }

    @TargetApi(17)
    protected boolean a(int i) {
        try {
            return UserHandle.myUserId() == i;
        } catch (Throwable th) {
            Log.wtf("MultiUserUtil", th);
            return true;
        }
    }

    @TargetApi(17)
    private static Method b() {
        try {
            return UserHandle.class.getMethod("getUserId", Integer.TYPE);
        } catch (Exception e) {
            String strValueOf = String.valueOf(e);
            new StringBuilder(String.valueOf(strValueOf).length() + 33).append("Unable to find getUserId method: ").append(strValueOf);
            return null;
        }
    }

    static {
        b();
        a = null;
    }
}
