package flm;

import android.accounts.Account;
import android.annotation.TargetApi;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bte {
    private static final Object a = new Object();

    public static void a(DevicePolicyManager devicePolicyManager) {
        Bundle applicationRestrictions = devicePolicyManager.getApplicationRestrictions(btb.a, "com.google.android.gms");
        applicationRestrictions.putBoolean("disableFactoryResetProtectionAdmin", true);
        devicePolicyManager.setApplicationRestrictions(btb.a, "com.google.android.gms", applicationRestrictions);
        d();
    }

    public static void a(DevicePolicyManager devicePolicyManager, String[] strArr) {
        Bundle applicationRestrictions = devicePolicyManager.getApplicationRestrictions(btb.a, "com.google.android.gms");
        applicationRestrictions.putStringArray("factoryResetProtectionAdmin", strArr);
        devicePolicyManager.setApplicationRestrictions(btb.a, "com.google.android.gms", applicationRestrictions);
        d();
    }

    public static String[] b(DevicePolicyManager devicePolicyManager) {
        String[] stringArray = devicePolicyManager.getApplicationRestrictions(btb.a, "com.google.android.gms").getStringArray("factoryResetProtectionAdmin");
        return stringArray == null ? new String[0] : stringArray;
    }

    private static void d() {
        Intent intent = new Intent("com.google.android.gms.auth.FRP_CONFIG_CHANGED");
        intent.addFlags(268435456);
        intent.setPackage("com.google.android.gms");
        ayt.a().sendBroadcast(intent);
    }

    public static void a(Context context, boolean z) {
        if (a(context)) {
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
            try {
                context.getPackageManager().getPackageInfo("com.google.android.apps.kids.familylink", 0);
                Bundle applicationRestrictions = devicePolicyManager.getApplicationRestrictions(btb.a, "com.google.android.apps.kids.familylink");
                if (!applicationRestrictions.getBoolean("turn_off_familylink_supervision_key")) {
                    applicationRestrictions.putBoolean("turn_off_familylink_supervision_key", true);
                    devicePolicyManager.setApplicationRestrictions(btb.a, "com.google.android.apps.kids.familylink", applicationRestrictions);
                }
            } catch (PackageManager.NameNotFoundException e) {
                btv.d("System", "FamilyLink not found", new Object[0]);
            }
        }
    }

    public static void a() {
        a(btf.a);
    }

    public static void b() {
        a(btg.a);
    }

    public static void a(final Account account) {
        dvl.a(account);
        dvl.a(account.type.equals("com.google"));
        a(new bti(account) { // from class: flm.bth
            private final Account a;

            {
                this.a = account;
            }

            @Override // flm.bti
            public final void a(Bundle bundle) {
                bundle.putStringArray("whitelisted_google_account_names", new String[]{this.a.name});
            }
        });
    }

    public static void c() {
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) ayt.a().getSystemService("device_policy");
        synchronized (a) {
            devicePolicyManager.setApplicationRestrictions(btb.a, bbz.GOOGLE_NOW_PACKAGE_NAME, new Bundle());
        }
    }

    private static void a(bti btiVar) {
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) ayt.a().getSystemService("device_policy");
        synchronized (a) {
            Bundle applicationRestrictions = devicePolicyManager.getApplicationRestrictions(btb.a, bbz.GOOGLE_NOW_PACKAGE_NAME);
            btiVar.a(applicationRestrictions);
            devicePolicyManager.setApplicationRestrictions(btb.a, bbz.GOOGLE_NOW_PACKAGE_NAME, applicationRestrictions);
        }
    }

    public static void c(DevicePolicyManager devicePolicyManager) {
        Bundle applicationRestrictions = devicePolicyManager.getApplicationRestrictions(btb.a, "com.google.android.apps.kids.familylink");
        applicationRestrictions.putBoolean("EnableSecondaryAccountSignIn", bsy.c());
        devicePolicyManager.setApplicationRestrictions(btb.a, "com.google.android.apps.kids.familylink", applicationRestrictions);
        Bundle applicationRestrictions2 = devicePolicyManager.getApplicationRestrictions(btb.a, "com.google.android.apps.kids.familylinkhelper");
        applicationRestrictions2.putBoolean("EnableSecondaryAccountSignIn", bsy.c());
        devicePolicyManager.setApplicationRestrictions(btb.a, "com.google.android.apps.kids.familylinkhelper", applicationRestrictions2);
        Bundle applicationRestrictions3 = devicePolicyManager.getApplicationRestrictions(btb.a, "com.google.android.apps.classroom");
        applicationRestrictions3.putBoolean("EnableSchoolAccountsOnUnicornDevices", bsy.c());
        devicePolicyManager.setApplicationRestrictions(btb.a, "com.google.android.apps.classroom", applicationRestrictions3);
    }

    public static void d(DevicePolicyManager devicePolicyManager) {
        Bundle applicationRestrictions = devicePolicyManager.getApplicationRestrictions(btb.a, "com.google.android.apps.kids.familylink");
        applicationRestrictions.remove("EnableSecondaryAccountSignIn");
        devicePolicyManager.setApplicationRestrictions(btb.a, "com.google.android.apps.kids.familylink", applicationRestrictions);
        Bundle applicationRestrictions2 = devicePolicyManager.getApplicationRestrictions(btb.a, "com.google.android.apps.kids.familylinkhelper");
        applicationRestrictions2.remove("EnableSecondaryAccountSignIn");
        devicePolicyManager.setApplicationRestrictions(btb.a, "com.google.android.apps.kids.familylinkhelper", applicationRestrictions2);
        Bundle applicationRestrictions3 = devicePolicyManager.getApplicationRestrictions(btb.a, "com.google.android.apps.classroom");
        applicationRestrictions3.remove("EnableSchoolAccountsOnUnicornDevices");
        devicePolicyManager.setApplicationRestrictions(btb.a, "com.google.android.apps.classroom", applicationRestrictions3);
    }

    public static void b(DevicePolicyManager devicePolicyManager, String[] strArr) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("ForceBrowserSignin", true);
        bundle.putStringArray("RestrictAccountsToPatterns", strArr);
        devicePolicyManager.setApplicationRestrictions(btb.a, "com.android.chrome", bundle);
    }

    public static void e(DevicePolicyManager devicePolicyManager) {
        devicePolicyManager.setApplicationRestrictions(btb.a, "com.android.chrome", new Bundle());
    }

    public static void a(DevicePolicyManager devicePolicyManager, boolean z) {
        if (z) {
            ComponentName componentName = btb.a;
            IntentFilter intentFilter = new IntentFilter("android.intent.action.VIEW");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            intentFilter.addCategory("android.intent.category.BROWSABLE");
            intentFilter.addDataScheme("http");
            intentFilter.addDataScheme("https");
            intentFilter.addDataAuthority("youtube.com", null);
            intentFilter.addDataAuthority("www.youtube.com", null);
            intentFilter.addDataAuthority("m.youtube.com", null);
            intentFilter.addDataAuthority("youtu.be", null);
            intentFilter.addDataPath("/", 0);
            devicePolicyManager.addPersistentPreferredActivity(componentName, intentFilter, new ComponentName("com.google.android.apps.youtube.kids", "com.google.android.apps.youtube.kids.activities.YTMainDeepLinkActivity"));
            return;
        }
        devicePolicyManager.clearPackagePersistentPreferredActivities(btb.a, "com.google.android.apps.youtube.kids");
    }

    @TargetApi(21)
    public static boolean a(Context context) {
        return f((DevicePolicyManager) context.getSystemService("device_policy"));
    }

    public static boolean f(DevicePolicyManager devicePolicyManager) {
        return devicePolicyManager.isAdminActive(btb.a) && devicePolicyManager.isProfileOwnerApp(btb.a.getPackageName());
    }

    public static void g(DevicePolicyManager devicePolicyManager) {
        if (f(devicePolicyManager)) {
            devicePolicyManager.clearProfileOwner(btb.a);
            if (Build.VERSION.SDK_INT < 24) {
                devicePolicyManager.removeActiveAdmin(btb.a);
            }
        }
    }

    public static void b(DevicePolicyManager devicePolicyManager, boolean z) {
        devicePolicyManager.setUninstallBlocked(btb.a, ayt.a().getPackageName(), z);
        devicePolicyManager.setUninstallBlocked(btb.a, "com.google.android.apps.kids.familylinkmanager", z);
        devicePolicyManager.setUninstallBlocked(btb.a, "com.google.android.apps.kids.familylink", z);
        devicePolicyManager.setUninstallBlocked(btb.a, "com.google.android.apps.kids.familylinkhelper", z);
        devicePolicyManager.setUninstallBlocked(btb.a, bbz.GOOGLE_NOW_PACKAGE_NAME, z);
    }

    public static void c(DevicePolicyManager devicePolicyManager, boolean z) {
        try {
            if (Build.VERSION.SDK_INT == 22) {
                z = false;
            }
            devicePolicyManager.setKeyguardDisabledFeatures(btb.a, z ? 2 : 0);
        } catch (SecurityException e) {
            btv.d("Admin", "disable-keyguard-features permission is not granted.", new Object[0]);
        }
    }

    public static void a(DevicePolicyManager devicePolicyManager, String str, byte[] bArr) throws bxi {
        if (!devicePolicyManager.resetPasswordWithToken(btb.a, str, bArr, 0)) {
            j(devicePolicyManager);
            if (!devicePolicyManager.resetPasswordWithToken(btb.a, str, bArr, 0)) {
                throw new bxi("Failed to reset password with token");
            }
        }
    }

    private static void i(DevicePolicyManager devicePolicyManager) {
        if (!devicePolicyManager.isAdminActive(btb.b)) {
            a(devicePolicyManager, btb.b);
        }
    }

    public static void a(DevicePolicyManager devicePolicyManager, String str) throws bxi {
        i(devicePolicyManager);
        if (!devicePolicyManager.resetPassword(str, 0)) {
            j(devicePolicyManager);
            i(devicePolicyManager);
            if (!devicePolicyManager.resetPassword(str, 0)) {
                throw new bxi("Failed to reset password");
            }
        }
    }

    public static void h(DevicePolicyManager devicePolicyManager) {
        i(devicePolicyManager);
        btv.d("Admin", "Wiping device...", new Object[0]);
        devicePolicyManager.wipeData(0);
    }

    private static void j(DevicePolicyManager devicePolicyManager) {
        btv.a("Admin", "Disabling all other device admins", new Object[0]);
        List<ComponentName> activeAdmins = devicePolicyManager.getActiveAdmins();
        if (activeAdmins != null) {
            for (ComponentName componentName : activeAdmins) {
                if (!btb.a.equals(componentName)) {
                    devicePolicyManager.removeActiveAdmin(componentName);
                }
            }
        }
    }

    private static void a(DevicePolicyManager devicePolicyManager, ComponentName componentName) {
        try {
            DevicePolicyManager.class.getMethod("setActiveAdmin", ComponentName.class, Boolean.TYPE).invoke(devicePolicyManager, componentName, true);
            btv.c("Admin", "Successfully refreshed device admin", new Object[0]);
        } catch (Exception e) {
            btv.c("Admin", e, "Unexpected exception when refreshing admin", new Object[0]);
            btt.a("Admin", e, "Unexpected exception when refreshing admin", new Object[0]);
        }
    }

    public static void b(Context context) {
        boolean z;
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) dvl.a(context.getSystemService("device_policy"));
        if (!f(devicePolicyManager)) {
            btv.b("Admin", "Not the profile owner. Skipping refresh of active admin.", new Object[0]);
            return;
        }
        int[] iArr = {0, 1, 3, 6, 7, 8, 9};
        int i = 0;
        while (true) {
            if (i < 7) {
                if (!devicePolicyManager.hasGrantedPolicy(btb.a, iArr[i])) {
                    z = false;
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            btv.b("Admin", "The admin has all policies. Skipping refresh.", new Object[0]);
        } else {
            a(devicePolicyManager, btb.a);
        }
    }
}
