package flm;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimeraresources.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbd {
    public static final String TAG = "GoogleApiAvailability";
    public static final so sCache = new so();

    public static String getErrorTitle(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e(TAG, "An invalid account was specified when connecting. Please provide a valid account.");
                return getRemoteString(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e(TAG, "Network error occurred. Please retry request later.");
                return getRemoteString(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e(TAG, "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e(TAG, "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e(TAG, "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e(TAG, "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e(TAG, new StringBuilder(33).append("Unexpected error code ").append(i).toString());
                return null;
            case 16:
                Log.e(TAG, "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e(TAG, "The specified account could not be signed in.");
                return getRemoteString(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e(TAG, "The current user profile is restricted and could not use authenticated features.");
                return getRemoteString(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String getErrorNotificationTitle(Context context, int i) {
        String errorTitle;
        if (i == 6) {
            errorTitle = getRemoteString(context, "common_google_play_services_resolution_required_title");
        } else {
            errorTitle = getErrorTitle(context, i);
        }
        if (errorTitle == null) {
            return context.getResources().getString(R.string.common_google_play_services_notification_ticker);
        }
        return errorTitle;
    }

    public static String getErrorMessage(Context context, int i) {
        Resources resources = context.getResources();
        String appName = getAppName(context);
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_text, appName);
            case 2:
                if (bik.b(context)) {
                    return resources.getString(R.string.common_google_play_services_wear_update_text);
                }
                return resources.getString(R.string.common_google_play_services_update_text, appName);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_text, appName);
            case 4:
            case 6:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, appName);
            case 5:
                return getRemoteMessage(context, "common_google_play_services_invalid_account_text", appName);
            case 7:
                return getRemoteMessage(context, "common_google_play_services_network_error_text", appName);
            case 9:
                return resources.getString(R.string.common_google_play_services_unsupported_text, appName);
            case 16:
                return getRemoteMessage(context, "common_google_play_services_api_unavailable_text", appName);
            case 17:
                return getRemoteMessage(context, "common_google_play_services_sign_in_failed_text", appName);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, appName);
            case 20:
                return getRemoteMessage(context, "common_google_play_services_restricted_profile_text", appName);
        }
    }

    public static String getErrorNotificationMessage(Context context, int i) {
        return i == 6 ? getRemoteMessage(context, "common_google_play_services_resolution_required_text", getAppName(context)) : getErrorMessage(context, i);
    }

    public static String getErrorDialogButtonMessage(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_button);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_button);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_button);
            default:
                return resources.getString(android.R.string.ok);
        }
    }

    public static String getAppName(Context context) {
        String packageName = context.getPackageName();
        try {
            return bjj.a.a(context).b(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            String str = context.getApplicationInfo().name;
            return !TextUtils.isEmpty(str) ? str : packageName;
        }
    }

    private static String getRemoteMessage(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String remoteString = getRemoteString(context, str);
        if (remoteString == null) {
            remoteString = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, remoteString, str2);
    }

    private static String getRemoteString(Context context, String str) {
        synchronized (sCache) {
            String str2 = (String) sCache.get(str);
            if (str2 == null) {
                Resources resourcesA = aqw.a(context);
                if (resourcesA == null) {
                    return null;
                }
                int identifier = resourcesA.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    String strValueOf = String.valueOf(str);
                    Log.w(TAG, strValueOf.length() != 0 ? "Missing resource: ".concat(strValueOf) : new String("Missing resource: "));
                    return null;
                }
                String string = resourcesA.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    String strValueOf2 = String.valueOf(str);
                    Log.w(TAG, strValueOf2.length() != 0 ? "Got empty resource: ".concat(strValueOf2) : new String("Got empty resource: "));
                    return null;
                }
                sCache.put(str, string);
                return string;
            }
            return str2;
        }
    }

    public static String getDefaultNotificationChannelName(Context context) {
        return context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
    }

    private bbd() {
    }
}
