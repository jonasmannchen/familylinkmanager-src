package flm;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.UserHandle;
import android.os.UserManager;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(21)
public final class bit extends bis {
    private final UserManager a;

    bit(Context context) {
        this.a = (UserManager) context.getSystemService("user");
    }

    @Override // flm.bis
    protected final boolean a(int i) {
        Iterator<UserHandle> it = this.a.getUserProfiles().iterator();
        while (it.hasNext()) {
            if (it.next().getIdentifier() == i) {
                return true;
            }
        }
        return false;
    }

    private static Method b() {
        try {
            return UserManager.class.getMethod("getProfiles", Integer.TYPE);
        } catch (Exception e) {
            String strValueOf = String.valueOf(e);
            Log.wtf("MultiUserUtil", new StringBuilder(String.valueOf(strValueOf).length() + 35).append("Unable to find getProfiles method: ").append(strValueOf).toString());
            return null;
        }
    }

    private static Field c() {
        try {
            return Class.forName("android.content.pm.UserInfo").getField(bbz.MARKET_URI_PARAM_ID);
        } catch (Exception e) {
            String strValueOf = String.valueOf(e);
            Log.wtf("MultiUserUtil", new StringBuilder(String.valueOf(strValueOf).length() + 34).append("Unable to find UserInfo.id field: ").append(strValueOf).toString());
            return null;
        }
    }

    static {
        b();
        c();
    }
}
