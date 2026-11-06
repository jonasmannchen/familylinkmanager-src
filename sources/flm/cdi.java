package flm;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.chimera.WebView;
import com.google.android.chimeraresources.R;
import com.google.android.gms.common.app.BaseApplicationContext;
import com.google.android.gms.kids.alarm.KidsAlarmIntentOperation;
import com.google.android.gms.kids.database.SupervisionDatabase;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cdi extends cdc {
    private static final int a = R.id.kids_app_disable_notification_id;
    private final ayt b = ayt.a();
    private final PackageManager c = this.b.getPackageManager();
    private final DevicePolicyManager d = (DevicePolicyManager) this.b.getSystemService("device_policy");
    private final bel e = bel.a((Context) this.b);

    private static void a(long j) {
        BaseApplicationContext baseApplicationContextA = ayt.a();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        PendingIntent pendingIntentA = bta.a(baseApplicationContextA, KidsAlarmIntentOperation.class, bta.a((Context) baseApplicationContextA, KidsAlarmIntentOperation.class, "com.google.android.gms.kids.alarm.APPLY_POLICY"), 0, 134217728);
        bfr bfrVar = new bfr(baseApplicationContextA);
        WorkSource workSourceA = bjd.a(bfrVar.f, (String) null);
        if (bfr.a(jElapsedRealtime)) {
            bfrVar.a("Kids:PolicyApply", 3, jElapsedRealtime, bfrVar.g ? bfr.a : bfr.b, 0L, pendingIntentA, workSourceA);
        }
        btv.c("Policy", "schedulePolicyApply:%s", Long.valueOf(j));
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d6  */
    @Override // flm.cdc
    public final int a(bwg bwgVar, cdb cdbVar) throws bxi {
        ekr ekrVar;
        boolean z;
        fbo fboVar = (fbo) fin.b(fbo.d, bwgVar.f);
        String str = bwgVar.b;
        if (!bsw.a(str)) {
            btv.a("Policy", "Skip. App does not exist:%s", str);
            return 2;
        }
        if (!fboVar.b) {
            a(str);
            return 2;
        }
        if (((Boolean) buw.k.b()).booleanValue()) {
            throw new bxi(String.format("(TEST ONLY) Unable to hide app: %s", str));
        }
        if (biw.d() && cdbVar == cdb.BOOTSTRAP) {
            try {
                if (str.equals(WebView.getCurrentWebViewPackage().packageName)) {
                    return 1;
                }
            } catch (Throwable th) {
                btv.b("Policy", th, "Webview Provider check failed.", new Object[0]);
            }
        }
        fbq fbqVarA = fbq.a(fboVar.c);
        if (fbqVarA == null) {
            fbqVarA = fbq.UNKNOWN_HIDE_REASON;
        }
        switch (fbqVarA.ordinal()) {
            case 1:
                ekrVar = ekr.POLICY_PARENT;
                break;
            case 2:
                ekrVar = ekr.POLICY_BLACKLIST;
                break;
            default:
                btv.d("Policy", "map unknown hide app reason:%s", fbqVarA);
                btt.a("Policy", "hideAppReason", "Unknown app reasons:%s", fbqVarA);
                ekrVar = ekr.POLICY_BLACKLIST;
                break;
        }
        if (cdbVar.e || bbz.GOOGLE_NOW_PACKAGE_NAME.equals(str) || this.d.isApplicationHidden(btb.a, str)) {
            z = false;
        } else {
            if (ayt.a().getPackageManager().getLaunchIntentForPackage(str) != null) {
                z = true;
            } else {
                z = false;
            }
        }
        if (cdbVar.d) {
            a(str, ekrVar, z);
            return 2;
        }
        long jB = btj.b();
        buy buyVarJ = SupervisionDatabase.h().j();
        boolean zContains = bsw.a().contains(str);
        if (bwgVar.e == 1) {
            long jE = buyVarJ.e(str);
            long millis = (TimeUnit.MINUTES.toMillis(1L) + jE) - jB;
            if (zContains && millis > 0) {
                a(millis);
                btv.a("Policy", "Hide app still pending:%s, %s", str, Long.valueOf(jE));
                return 1;
            }
            a(str, ekrVar, z);
            return 2;
        }
        if (z && ekrVar == ekr.POLICY_PARENT && zContains) {
            buyVarJ.a(new bux(str, jB));
            ApplicationInfo applicationInfoB = b(str);
            if (applicationInfoB != null) {
                this.e.a(str, a, a(this.b.getString(R.string.kids_app_disabled_title), this.b.getString(R.string.kids_app_will_be_disabled_msg, new Object[]{applicationInfoB.loadLabel(this.c).toString()}), applicationInfoB.loadIcon(this.c), "kids_alerts_channel").build());
            }
            a(TimeUnit.MINUTES.toMillis(1L));
            btv.c("Policy", "%s is in use, show heads up notification", str);
            return 1;
        }
        buyVarJ.f(str);
        a(str, ekrVar, z);
        return 2;
    }

    @Override // flm.cdc
    public final void a(bwg bwgVar) throws bxj {
        a(bwgVar.b);
    }

    private final void a(String str) throws bxj {
        if (bxk.b(str, ekr.POLICY_PARENT, ekr.POLICY_BLACKLIST)) {
            this.e.a(str, a);
            return;
        }
        throw new bxj(String.format("Enable app failed:%s", str));
    }

    private final void a(String str, ekr ekrVar, boolean z) throws bxj {
        String string;
        String string2;
        ApplicationInfo applicationInfoB = b(str);
        if (bxk.a(str, ekrVar)) {
            if (z && applicationInfoB != null) {
                String string3 = applicationInfoB.loadLabel(this.c).toString();
                Drawable drawableLoadIcon = applicationInfoB.loadIcon(this.c);
                if (ekrVar == ekr.POLICY_PARENT) {
                    string2 = this.b.getString(R.string.kids_app_disabled_title);
                    string = this.b.getString(R.string.kids_app_disabled_msg, new Object[]{string3});
                } else {
                    string = this.b.getString(R.string.kids_app_blacklisted_msg);
                    string2 = string3;
                }
                this.e.a(str, a, a(string2, string, drawableLoadIcon, "kids_setting_updates_channel").setGroup("com.google.android.gms.kids.POLICY_UPDATES").build());
                return;
            }
            this.e.a(str, a);
            return;
        }
        throw new bxj(String.format("Disable app failed: %s [%s]", str, ekrVar));
    }

    private final ApplicationInfo b(String str) {
        try {
            return this.c.getApplicationInfo(str, btb.c);
        } catch (PackageManager.NameNotFoundException e) {
            btv.d("Policy", "Can't get info for app %s, skip", str);
            return null;
        }
    }

    private final Notification.Builder a(String str, String str2, Drawable drawable, String str3) {
        Notification.Builder style = buc.a(this.b, R.drawable.quantum_ic_block_white_24, str3).setContentTitle(str).setContentText(str2).setStyle(new Notification.BigTextStyle().bigText(str2));
        if (drawable != null) {
            style.setLargeIcon(btm.a(drawable));
        }
        return style;
    }
}
