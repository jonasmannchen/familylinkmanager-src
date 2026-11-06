package flm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbz {
    public static final String ACTION_FITNESS_APP_DISCONNECTED = "com.google.android.gms.fitness.app_disconnected";
    public static final String ACTION_ICING_CONTACT_CHANGED = "com.google.android.gms.icing.action.CONTACT_CHANGED";
    public static final String ACTION_SET_GMS_ACCOUNT = "com.google.android.gms.common.SET_GMS_ACCOUNT";
    public static final String ACTION_UDC_SETTING_CHANGED = "com.google.android.gms.udc.action.SETTING_CHANGED";
    public static final String ANDROID_WEAR_PACKAGE = "com.google.android.wearable.app";
    public static final String BROADCAST_CIRCLES_CHANGED = "com.google.android.gms.people.BROADCAST_CIRCLES_CHANGED";
    public static final String COMMON_SIGN_IN_ACTION = "com.google.android.gms.signin.action.SIGN_IN";
    public static final String COMMON_SIGN_IN_EXTRA_PACKAGE_NAME = "SIGN_IN_PACKAGE_NAME";
    public static final String COMMON_SIGN_IN_EXTRA_SAVE_DEFAULT_ACCOUNT = "SIGN_IN_SAVE_DEFAULT_ACCOUNT";
    public static final String COMMON_SIGN_IN_EXTRA_SCOPE_ARRAY = "SIGN_IN_SCOPE_ARRAY";
    public static final String EXTRA_ACCOUNT = "com.google.android.gms.fitness.disconnected_account";
    public static final String EXTRA_APP = "com.google.android.gms.fitness.disconnected_app";
    public static final String EXTRA_ICING_CONTACT_CHANGED_IS_SIGNIFICANT = "com.google.android.gms.icing.extra.isSignificant";
    public static final String EXTRA_SET_GMS_ACCOUNT_NAME = "ACCOUNT_NAME";
    public static final String EXTRA_SET_GMS_ACCOUNT_PACKAGE_NAME = "PACKAGE_NAME";
    public static final String EXTRA_UDC_ACCOUNT_NAME = "com.google.android.gms.udc.extra.accountName";
    public static final String EXTRA_UDC_SETTING_ID_LIST = "com.google.android.gms.udc.extra.settingIdList";
    public static final Uri FIND_PEOPLE_URI;
    public static final String GOOGLE_NOW_PACKAGE_NAME = "com.google.android.googlequicksearchbox";
    public static final String MARKET_URI_BASE_INTERNAL = "market://details";
    public static final String MARKET_URI_BASE_PUBLIC = "https://play.google.com/store/apps/details";
    public static final String MARKET_URI_PARAM_CAMPAIGN_ID = "pcampaignid";
    public static final String MARKET_URI_PARAM_ID = "id";
    public static final String MIME_ACTIVITY_DISCONNECT_TYPE = "vnd.google.android.fitness/app_disconnect";
    public static final String PACKAGE_SCHEME = "package";
    public static final String PERMISSION_GMS_INTERNAL_BROADCAST = "com.google.android.gms.permission.INTERNAL_BROADCAST";
    public static final Uri PLUS_BASE_URI;
    public static final String PLUS_PACKAGE = "com.google.android.apps.plus";
    public static final String TAG = "GmsIntents";
    public static final String UPDATE_ANDROID_WEAR_ACTION = "com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION";
    public static final String VIEW_PROFILE_URI_STRING = "https://plus.google.com/%s/about";

    private bbz() {
    }

    public static Intent createSettingsIntent(String str) {
        Uri uriFromParts = Uri.fromParts(PACKAGE_SCHEME, str, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(uriFromParts);
        return intent;
    }

    public static Intent createDateSettingsIntent() {
        return new Intent("android.settings.DATE_SETTINGS");
    }

    public static Uri getPlayStoreUri(String str) {
        return Uri.parse(MARKET_URI_BASE_PUBLIC).buildUpon().appendQueryParameter(MARKET_URI_PARAM_ID, str).build();
    }

    private static Uri getInternalPlayStoreUri(String str, String str2) {
        Uri.Builder builderAppendQueryParameter = Uri.parse(MARKET_URI_BASE_INTERNAL).buildUpon().appendQueryParameter(MARKET_URI_PARAM_ID, str);
        if (!TextUtils.isEmpty(str2)) {
            builderAppendQueryParameter.appendQueryParameter(MARKET_URI_PARAM_CAMPAIGN_ID, str2);
        }
        return builderAppendQueryParameter.build();
    }

    public static Intent createPlayStoreIntent(String str) {
        return createPlayStoreIntent(str, null);
    }

    public static Intent createPlayStoreIntent(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(getInternalPlayStoreUri(str, str2));
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    public static Intent createPlayStoreLightPurchaseFlowIntent(Context context, String str, String str2) {
        Intent intent = new Intent("com.android.vending.billing.PURCHASE");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setPackage("com.android.vending");
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("authAccount", str);
        }
        intent.putExtra("backend", 3);
        intent.putExtra("document_type", 1);
        intent.putExtra("full_docid", str2);
        intent.putExtra("backend_docid", str2);
        intent.putExtra("offer_type", 1);
        if (!isIntentResolvable(context.getPackageManager(), intent)) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(String.format(Locale.US, "https://play.google.com/store/apps/details?id=%1$s&rdid=%1$s&rdot=%2$d", str2, 1)));
            intent2.setPackage("com.android.vending");
            intent2.putExtra("use_direct_purchase", true);
            return intent2;
        }
        return intent;
    }

    public static Intent createPlayStoreGamesIntent(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://play.google.com/store/apps/category/GAME"));
        intent.addFlags(524288);
        intent.setPackage("com.android.vending");
        return makeResolvableIntent(context.getPackageManager(), intent);
    }

    public static Intent createAndroidWearUpdateIntent() {
        Intent intent = new Intent(UPDATE_ANDROID_WEAR_ACTION);
        intent.setPackage(ANDROID_WEAR_PACKAGE);
        return intent;
    }

    public static void sendUdcSettingsChangedBroadcast(Context context, String str, int[] iArr) {
        sendUdcChangeBroadcastForPackage("com.google.android.gms", context, str, iArr);
        if (!aqy.a(context).b(GOOGLE_NOW_PACKAGE_NAME)) {
            if (Log.isLoggable(TAG, 5)) {
                Log.w(TAG, "Google now certificate not valid. UDC settings broadcast will not be sent.");
                return;
            }
            return;
        }
        sendUdcChangeBroadcastForPackage(GOOGLE_NOW_PACKAGE_NAME, context, str, iArr);
    }

    private static void sendUdcChangeBroadcastForPackage(String str, Context context, String str2, int[] iArr) {
        context.sendBroadcast(new Intent(ACTION_UDC_SETTING_CHANGED).setPackage(str).putExtra(EXTRA_UDC_ACCOUNT_NAME, str2).putExtra(EXTRA_UDC_SETTING_ID_LIST, iArr));
    }

    public static void sendIcingContactChangedBroadcast(Context context, boolean z) {
        context.sendBroadcast(new Intent(ACTION_ICING_CONTACT_CHANGED).setPackage("com.google.android.gms").putExtra(EXTRA_ICING_CONTACT_CHANGED_IS_SIGNIFICANT, z));
    }

    public static Intent createFindPeopleIntent(Context context) {
        return createPlusIntent(context, FIND_PEOPLE_URI);
    }

    public static Intent createShowProfileIntent(Context context, String str) {
        return createPlusIntent(context, Uri.parse(String.format(VIEW_PROFILE_URI_STRING, str)));
    }

    private static Intent createPlusIntent(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.setPackage(PLUS_PACKAGE);
        return isIntentResolvable(context.getPackageManager(), intent) ? intent : createPlayStoreIntent(PLUS_PACKAGE);
    }

    public static Intent createShareOnPlusIntent(Activity activity, String str, String str2) {
        og ogVar = new og(activity);
        ogVar.a.putExtra("android.intent.extra.SUBJECT", str);
        ogVar.a.putExtra("android.intent.extra.TEXT", (CharSequence) str2);
        ogVar.a.setType("text/plain");
        if (ogVar.a.getAction().equals("android.intent.action.SEND_MULTIPLE")) {
            ogVar.a.setAction("android.intent.action.SEND");
            ogVar.a.removeExtra("android.intent.extra.STREAM");
            ogVar.b = null;
        }
        Intent intent = ogVar.a;
        intent.setPackage(PLUS_PACKAGE);
        return isIntentResolvable(activity.getPackageManager(), intent) ? intent : createPlayStoreIntent(PLUS_PACKAGE);
    }

    public static Intent createChooseGmsAccountIntent() {
        Intent intent = new Intent();
        bdi.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", (Serializable) null);
        intent.putExtra("allowableAccountTypes", new String[]{"com.google"});
        intent.putExtra("addAccountOptions", (Bundle) null);
        intent.putExtra("selectedAccount", (Parcelable) null);
        intent.putExtra("alwaysPromptForAccount", true);
        intent.putExtra("descriptionTextOverride", (String) null);
        intent.putExtra("authTokenType", (String) null);
        intent.putExtra("addAccountRequiredFeatures", (String[]) null);
        intent.putExtra("setGmsCoreAccount", true);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (String) null);
        return intent;
    }

    public static Intent createChooseGmsAccountWithConsentIntent(String str, Scope[] scopeArr, boolean z) {
        Intent intent = new Intent(COMMON_SIGN_IN_ACTION);
        intent.putExtra(COMMON_SIGN_IN_EXTRA_PACKAGE_NAME, str);
        intent.putExtra(COMMON_SIGN_IN_EXTRA_SCOPE_ARRAY, scopeArr);
        intent.putExtra(COMMON_SIGN_IN_EXTRA_SAVE_DEFAULT_ACCOUNT, z);
        return intent;
    }

    public static void sendSetGmsAccountIntent(Context context, String str, String str2) {
        Intent intent = new Intent(ACTION_SET_GMS_ACCOUNT);
        intent.putExtra(EXTRA_SET_GMS_ACCOUNT_NAME, str);
        intent.putExtra(EXTRA_SET_GMS_ACCOUNT_PACKAGE_NAME, str2);
        intent.setPackage("com.google.android.gms");
        context.sendBroadcast(intent, PERMISSION_GMS_INTERNAL_BROADCAST);
    }

    private static Intent makeResolvableIntent(PackageManager packageManager, Intent intent) {
        if (packageManager.resolveActivity(intent, 65536) == null) {
            Intent intent2 = new Intent(intent.getAction(), intent.getData());
            intent2.setFlags(intent.getFlags());
            return intent2;
        }
        return intent;
    }

    public static boolean isIntentResolvable(PackageManager packageManager, Intent intent) {
        return packageManager.resolveActivity(intent, 65536) != null;
    }

    public static Intent getFitnessAppDisconnectedIntent(String str, String str2) {
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(ACTION_FITNESS_APP_DISCONNECTED);
        intent.setType(MIME_ACTIVITY_DISCONNECT_TYPE);
        intent.putExtra(EXTRA_APP, str);
        intent.putExtra(EXTRA_ACCOUNT, str2);
        return intent;
    }

    static {
        Uri uri = Uri.parse("https://plus.google.com/");
        PLUS_BASE_URI = uri;
        FIND_PEOPLE_URI = uri.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
