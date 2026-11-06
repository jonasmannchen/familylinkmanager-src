package flm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bds implements bbm {
    public static final String TAG = "UncertifiedCheckPreProcessor";
    public final bjc mUncertifiedDeviceUtils;

    public bds(Context context) {
        this(new bjc(context));
    }

    bds(bjc bjcVar) {
        this.mUncertifiedDeviceUtils = bjcVar;
    }

    @Override // flm.bbm
    public final apx process(bbn bbnVar, bbe bbeVar) {
        boolean z = true;
        bjc bjcVar = this.mUncertifiedDeviceUtils;
        if (((Boolean) azi.a.b()).booleanValue() && !bjc.a) {
            int iIntValue = ((Long) azi.e.b()).intValue();
            bjc.a = iIntValue == 1;
            if (iIntValue != 3 && (iIntValue != 2 || ((Long) azi.f.b()).longValue() >= bjcVar.d.a())) {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            return new apx(0);
        }
        String str = (String) azi.b.b();
        if (TextUtils.isEmpty(str)) {
            return new apx(0);
        }
        duw duwVar = new duw(',');
        dvl.a(duwVar);
        Iterator it = new dvo(new dvp(duwVar)).a((CharSequence) str).iterator();
        while (it.hasNext()) {
            try {
                if (Integer.parseInt((String) it.next()) == bbnVar.getServiceId()) {
                    return new apx(0);
                }
            } catch (NumberFormatException e) {
                return new apx(0);
            }
        }
        bjc bjcVar2 = this.mUncertifiedDeviceUtils;
        if (bjcVar2.c.nextFloat() < ((Double) azi.c.b()).doubleValue()) {
            asn asnVar = new asn();
            ass assVar = new ass();
            assVar.a = 2;
            asnVar.b = assVar;
            new bem().a(bjcVar2.b).a(asnVar).a(15).a();
        }
        bjc bjcVar3 = this.mUncertifiedDeviceUtils;
        return new apx(6, PendingIntent.getActivity(bjcVar3.b, 0, new Intent().setClassName(bjcVar3.b, "com.google.android.gms.auth.uiflows.addaccount.UncertifiedNotificationActivity"), 134217728));
    }
}
