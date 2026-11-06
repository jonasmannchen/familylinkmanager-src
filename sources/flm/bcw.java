package flm;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bcw {
    public static final String KEY_METADATA_APP_ID = "com.google.app.id";
    public static final String TAG = "MetadataValueReader";
    public static String sGoogleAppId;
    public static int sGooglePlayServicesVersion;
    public static boolean sInitialized;
    public static Object sLock = new Object();

    public static String getGoogleAppId(Context context) {
        ensureMetadataRead(context);
        return sGoogleAppId;
    }

    public static int getGooglePlayServicesVersion(Context context) {
        ensureMetadataRead(context);
        return sGooglePlayServicesVersion;
    }

    public static void resetForTesting() {
        synchronized (sLock) {
            sInitialized = false;
        }
    }

    public static void setValuesForTesting(String str, int i) {
        synchronized (sLock) {
            sGoogleAppId = str;
            sGooglePlayServicesVersion = i;
            sInitialized = true;
        }
    }

    private static void ensureMetadataRead(Context context) {
        synchronized (sLock) {
            if (!sInitialized) {
                sInitialized = true;
                try {
                    Bundle bundle = bjj.a.a(context).a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        sGoogleAppId = bundle.getString(KEY_METADATA_APP_ID);
                        sGooglePlayServicesVersion = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf(TAG, "This should never happen.", e);
                }
            }
        }
    }
}
