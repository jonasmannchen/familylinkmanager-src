package flm;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class biu {
    public static NetworkInfo a(Context context) {
        ConnectivityManager connectivityManagerC = c(context);
        if (connectivityManagerC == null) {
            return null;
        }
        return connectivityManagerC.getActiveNetworkInfo();
    }

    @TargetApi(21)
    public static boolean b(Context context) {
        ConnectivityManager connectivityManagerC = c(context);
        if (connectivityManagerC != null) {
            return connectivityManagerC.isDefaultNetworkActive();
        }
        if (connectivityManagerC != null) {
            NetworkInfo activeNetworkInfo = connectivityManagerC.getActiveNetworkInfo();
            int type = activeNetworkInfo == null ? -1 : activeNetworkInfo.getType();
            if (type == 0 || type == 1) {
                return true;
            }
        }
        return false;
    }

    private static ConnectivityManager c(Context context) {
        try {
            return (ConnectivityManager) context.getSystemService("connectivity");
        } catch (SecurityException e) {
            Log.e("NetworkUtils", "Couldn't retrieve ConnectivityManager.", e);
            return null;
        }
    }

    @TargetApi(14)
    private static Method a() {
        Method method = null;
        try {
            method = ConnectivityManager.class.getMethod("isNetworkSupported", Integer.TYPE);
            method.setAccessible(true);
            return method;
        } catch (Exception e) {
            return method;
        }
    }

    static {
        a();
    }
}
