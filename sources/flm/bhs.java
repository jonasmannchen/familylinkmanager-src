package flm;

import android.content.Context;
import android.os.Process;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bhs {
    public static bht a = new bht();

    public abstract int a(String str, int i, String str2);

    public abstract String a(String str);

    public static void a(bht bhtVar) {
        a = bhtVar;
    }

    static bhs a(Context context) {
        if (biw.e()) {
            return new bhy(context);
        }
        if (biw.a()) {
            return new bhx(context);
        }
        if (context.checkPermission("android.permission.UPDATE_APP_OPS_STATS", Process.myPid(), Process.myUid()) == 0) {
            return new bhw(context);
        }
        return new bhv();
    }
}
