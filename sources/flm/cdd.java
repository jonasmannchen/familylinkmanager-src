package flm;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.chimeraresources.R;
import com.google.android.gms.common.app.BaseApplicationContext;
import com.google.android.gms.kids.database.SupervisionDatabase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdd extends cdc {
    @Override // flm.cdc
    public final int a(bwg bwgVar, cdb cdbVar) {
        fbf fbfVar = (fbf) fin.b(fbf.c, bwgVar.f);
        String str = bwgVar.b;
        int i = fbfVar.b;
        BaseApplicationContext baseApplicationContextA = ayt.a();
        PackageManager packageManager = baseApplicationContextA.getPackageManager();
        bel belVarA = bel.a((Context) baseApplicationContextA);
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, btb.c);
            btv.b("Policy", "Checking version of %s, required %s, found %s", str, Integer.valueOf(i), Integer.valueOf(packageInfo.versionCode));
            if (packageInfo.versionCode < i) {
                bxk.a(str, ekr.POLICY_MIN_VERSION);
                if (belVarA != null) {
                    if (SupervisionDatabase.h().j().b(str)) {
                        int i2 = bst.a;
                        String string = packageInfo.applicationInfo.loadLabel(packageManager).toString();
                        String string2 = baseApplicationContextA.getString(R.string.kids_app_min_version_msg, string);
                        Notification.Builder group = buc.a(baseApplicationContextA, R.drawable.quantum_ic_play_store_white_24).setOngoing(true).setColor(oo.c(baseApplicationContextA, R.color.kids_play_apps_primary)).setLargeIcon(btm.a(packageInfo.applicationInfo.loadIcon(packageManager))).setContentTitle(baseApplicationContextA.getString(R.string.kids_app_min_version_title, string)).setContentText(string2).setStyle(new Notification.BigTextStyle().bigText(string2)).setGroup("com.google.android.gms.kids.POLICY_UPDATES");
                        Intent intent = new Intent("android.intent.action.VIEW");
                        String strValueOf = String.valueOf(packageInfo.packageName);
                        belVarA.a(str, i2, group.setContentIntent(PendingIntent.getActivity(baseApplicationContextA, 0, intent.setData(Uri.parse(strValueOf.length() != 0 ? "market://details?id=".concat(strValueOf) : new String("market://details?id="))), 134217728)).build());
                    } else {
                        belVarA.a(str, bst.a);
                    }
                }
            } else {
                bxk.b(str, ekr.POLICY_MIN_VERSION);
                bst.a(str, belVarA);
            }
        } catch (PackageManager.NameNotFoundException e) {
            btv.b("Policy", "Can't find app %s, skip version check", str);
            bxk.b(str, ekr.POLICY_MIN_VERSION);
            bst.a(str, belVarA);
        }
        return 2;
    }

    @Override // flm.cdc
    public final void a(bwg bwgVar) {
        String str = bwgVar.b;
        bxk.b(str, ekr.POLICY_MIN_VERSION);
        bst.a(str, bel.a((Context) ayt.a()));
    }
}
