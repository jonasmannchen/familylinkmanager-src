package flm;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bid {
    public static boolean a(Context context) {
        boolean zA;
        if (!dfj.b(context)) {
            return false;
        }
        atp atpVarB = new atq(context).a(ddo.a).b();
        if (!atpVarB.a(5L, TimeUnit.SECONDS).b()) {
            return false;
        }
        try {
            ddu dduVar = (ddu) ddo.b.a(atpVarB).await(5L, TimeUnit.SECONDS);
            if (dduVar.b().a()) {
                zA = dduVar.a();
                atpVarB.d();
            } else {
                Log.w("CheckboxUtil", "Could not retrieve Usage & Diagnostics setting. Giving up.");
                atpVarB.d();
                zA = false;
            }
            return zA;
        } catch (Throwable th) {
            atpVarB.d();
            throw th;
        }
    }
}
