package flm;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(23)
public class bhx extends bhw {
    bhx(Context context) {
        super(context);
    }

    @Override // flm.bhv, flm.bhs
    public final String a(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
