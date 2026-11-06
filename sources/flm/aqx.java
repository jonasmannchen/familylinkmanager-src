package flm;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.chimeraresources.R;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class aqx {

    @Deprecated
    public static final int a = bav.JAR_BUILD_VERSION_CODE;
    public static boolean b = false;
    public static boolean c = false;
    private static boolean e = false;
    private static boolean f = false;
    public static final AtomicBoolean d = new AtomicBoolean();
    private static final AtomicBoolean g = new AtomicBoolean();

    @Deprecated
    public static String a(int i) {
        return apx.a(i);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    @Deprecated
    public static int a(Context context, int i) {
        boolean z;
        if (bav.IS_PACKAGE_SIDE) {
            return 0;
        }
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable th) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !g.get()) {
            int googlePlayServicesVersion = bcw.getGooglePlayServicesVersion(context);
            if (googlePlayServicesVersion == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
            if (googlePlayServicesVersion != a) {
                throw new IllegalStateException(new StringBuilder(320).append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ").append(a).append(" but found ").append(googlePlayServicesVersion).append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version").append("\" android:value=\"@integer/google_play_services_version\" />").toString());
            }
        }
        if (!bik.b(context)) {
            if (bik.b == null) {
                bik.b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            z = bik.b.booleanValue() ? false : true;
        }
        return a(context, z, i);
    }

    private static int a(Context context, boolean z, int i) {
        bdi.checkArgument(i >= 0);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
                return 9;
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            aqy aqyVarA = aqy.a(context);
            if (!aqyVarA.a(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            if (z && (!aqyVarA.a(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                return 9;
            }
            if (bip.a(packageInfo2.versionCode) < bip.a(i)) {
                Log.w("GooglePlayServicesUtil", new StringBuilder(77).append("Google Play services out of date.  Requires ").append(i).append(" but found ").append(packageInfo2.versionCode).toString());
                return 2;
            }
            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
            if (applicationInfo == null) {
                try {
                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                } catch (PackageManager.NameNotFoundException e3) {
                    Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e3);
                    return 1;
                }
            }
            return !applicationInfo.enabled ? 3 : 0;
        } catch (PackageManager.NameNotFoundException e4) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }

    @Deprecated
    public static void b(Context context, int i) {
        int iA = aqf.d.a(context, i);
        if (iA != 0) {
            Intent intentA = aqf.d.a(context, iA, "e");
            Log.e("GooglePlayServicesUtil", new StringBuilder(57).append("GooglePlayServices not available due to error ").append(iA).toString());
            if (intentA == null) {
                throw new aqu(iA);
            }
            throw new aqv(iA, "Google Play Services not available", intentA);
        }
    }

    @Deprecated
    public static boolean c(Context context, int i) {
        return bjb.a(context, i);
    }

    @TargetApi(19)
    @Deprecated
    public static boolean a(Context context, int i, String str) {
        return bjb.a(context, i, str);
    }

    public static boolean c(Context context) {
        if (!f) {
            a(context);
        }
        return e || !"user".equals(Build.TYPE);
    }

    @Deprecated
    public static boolean b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 9:
                return true;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                return false;
        }
    }

    public static Resources d(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }

    public static Context e(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }

    @Deprecated
    public static boolean d(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return a(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(21)
    static boolean a(Context context, String str) {
        boolean zEquals = str.equals("com.google.android.gms");
        if (zEquals && bif.a()) {
            return false;
        }
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
                if (zEquals) {
                    return applicationInfo.enabled;
                }
                if (applicationInfo.enabled) {
                    Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
                    if (!(applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile")))) {
                        return true;
                    }
                }
                return false;
            } catch (PackageManager.NameNotFoundException e2) {
                return false;
            }
        } catch (Exception e3) {
            return false;
        }
    }

    private static void a(Context context) {
        try {
            PackageInfo packageInfoB = bjj.a.a(context).b("com.google.android.gms", 64);
            aqy aqyVarA = aqy.a(context);
            if (packageInfoB != null && !aqyVarA.a(packageInfoB, false) && aqyVarA.a(packageInfoB, true)) {
                e = true;
            } else {
                e = false;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
        } finally {
            f = true;
        }
    }
}
