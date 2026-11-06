package flm;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class die {
    public final String a;
    public final Long b;
    private final String c;
    private final String d;
    private final grx e;
    private final dfk f;
    private final long g;
    private final dmb h;

    private die(String str, String str2, String str3, grx grxVar, Long l, dfk dfkVar, dmb dmbVar) {
        this.c = str;
        this.d = str2;
        this.a = str3;
        this.e = grxVar;
        this.b = l;
        this.f = dfkVar;
        this.g = dfkVar.a().getTotalSpace() / 1024;
        this.h = dmbVar;
    }

    static die a(Context context, dmb dmbVar) {
        String packageName = ((Context) dse.a(context)).getPackageName();
        String strE = dpl.e(context);
        String str = null;
        grx grxVar = grx.PHONE_OR_TABLET;
        PackageManager packageManager = context.getPackageManager();
        try {
            str = packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            dkm.a(5, "MetricStamper", "Failed to get PackageInfo for: %s", packageName);
        }
        if (Build.VERSION.SDK_INT >= 20) {
            if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                grxVar = grx.WATCH;
            } else if (Build.VERSION.SDK_INT >= 21 && packageManager.hasSystemFeature("android.software.leanback")) {
                grxVar = grx.LEANBACK;
            }
        }
        return new die(packageName, strE, str, grxVar, dqm.a(context), new dfk(context), dmbVar);
    }

    public final gtr a(gtr gtrVar) {
        grt grtVar;
        if (gtrVar == null) {
            dkm.a(5, "MetricStamper", "Unexpected null metric to stamp, Stamping has been skipped.", new Object[0]);
            return null;
        }
        fio fioVar = (fio) gtrVar.a(dp.au, (Object) null);
        fioVar.a((fin) gtrVar);
        gts gtsVar = (gts) fioVar;
        grw grwVar = (grw) ((fio) grv.g.a(dp.au, (Object) null));
        grx grxVar = this.e;
        grwVar.c();
        grv grvVar = (grv) grwVar.a;
        if (grxVar == null) {
            throw new NullPointerException();
        }
        grvVar.a |= 4;
        grvVar.d = grxVar.d;
        if (this.c != null) {
            String str = this.c;
            grwVar.c();
            grv grvVar2 = (grv) grwVar.a;
            if (str == null) {
                throw new NullPointerException();
            }
            grvVar2.a |= 1;
            grvVar2.b = str;
        }
        if (this.b != null) {
            long jLongValue = this.b.longValue();
            grwVar.c();
            grv grvVar3 = (grv) grwVar.a;
            grvVar3.a |= 8;
            grvVar3.e = jLongValue;
        }
        if (this.a != null) {
            String str2 = this.a;
            grwVar.c();
            grv grvVar4 = (grv) grwVar.a;
            if (str2 == null) {
                throw new NullPointerException();
            }
            grvVar4.a |= 2;
            grvVar4.c = str2;
        }
        if (this.d != null) {
            String str3 = this.d;
            grwVar.c();
            grv grvVar5 = (grv) grwVar.a;
            if (str3 == null) {
                throw new NullPointerException();
            }
            grvVar5.a |= 16;
            grvVar5.f = str3;
        }
        gtsVar.c();
        gtr gtrVar2 = (gtr) gtsVar.a;
        gtrVar2.f = (grv) ((fin) grwVar.h());
        gtrVar2.a |= 16;
        gse gseVar = (gse) ((fio) gsd.d.a(dp.au, (Object) null));
        long freeSpace = this.f.a().getFreeSpace() / 1024;
        gseVar.c();
        gsd gsdVar = (gsd) gseVar.a;
        gsdVar.a |= 1;
        gsdVar.b = freeSpace;
        long j = this.g;
        gseVar.c();
        gsd gsdVar2 = (gsd) gseVar.a;
        gsdVar2.a |= 2;
        gsdVar2.c = j;
        gtsVar.c();
        gtr gtrVar3 = (gtr) gtsVar.a;
        gtrVar3.v = (gsd) ((fin) gseVar.h());
        gtrVar3.a |= 4194304;
        String string = this.h == null ? null : ((dim) this.h.a()).toString();
        if (!TextUtils.isEmpty(string)) {
            if (gtrVar.t == null) {
                grtVar = grt.c;
            } else {
                grtVar = gtrVar.t;
            }
            fio fioVar2 = (fio) grtVar.a(dp.au, (Object) null);
            fioVar2.a((fin) grtVar);
            gru gruVar = (gru) fioVar2;
            if (gruVar.a().isEmpty()) {
                gruVar.a(string);
            } else {
                gruVar.a(string + "::" + gruVar.a());
            }
            gtsVar.a(gruVar);
        }
        return (gtr) ((fin) gtsVar.h());
    }
}
