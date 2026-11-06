package flm;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgl {
    private static Boolean b;
    public static bgl a = new bgl();
    private static boolean c = bav.IS_PACKAGE_SIDE;

    public static void a(Context context, String str, int i, String str2, String str3, String str4, int i2, List list, long j) {
        if (a()) {
            if (TextUtils.isEmpty(str)) {
                String strValueOf = String.valueOf(str);
                Log.e("WakeLockTracker", strValueOf.length() != 0 ? "missing wakeLock key. ".concat(strValueOf) : new String("missing wakeLock key. "));
            } else if (7 == i || 8 == i || 10 == i || 11 == i) {
                a(context, new WakeLockEvent(System.currentTimeMillis(), i, str2, i2, bgj.a(list), str, SystemClock.elapsedRealtime(), bil.a(context), str3, bgj.a(context.getPackageName()), bil.b(context), j, str4, false));
            }
        }
    }

    public static void a(Context context, WakeLockEvent wakeLockEvent) {
        if (c) {
            bgi bgiVar = null;
            bgiVar.a(wakeLockEvent);
        } else {
            try {
                context.startService(new Intent().setComponent(bgb.a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
            } catch (Exception e) {
                Log.wtf("WakeLockTracker", e);
            }
        }
    }

    public static boolean a() {
        boolean z = true;
        if (b == null) {
            if (c) {
                bgi bgiVar = null;
                if (0 == 0 || bgiVar.a(1) == bgb.b) {
                    z = false;
                }
            } else {
                z = false;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }
}
