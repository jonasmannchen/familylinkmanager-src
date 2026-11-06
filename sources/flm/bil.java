package flm;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bil {
    private static long b;
    private static final IntentFilter a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static float c = Float.NaN;

    @TargetApi(20)
    public static int a(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent intentRegisterReceiver = context.getApplicationContext().registerReceiver(null, a);
        boolean z = ((intentRegisterReceiver == null ? 0 : intentRegisterReceiver.getIntExtra("plugged", 0)) & 7) != 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        return (a(powerManager) ? 2 : 0) | (z ? 1 : 0);
    }

    @TargetApi(20)
    public static boolean a(PowerManager powerManager) {
        return powerManager.isInteractive();
    }

    public static synchronized float b(Context context) {
        float f;
        if (SystemClock.elapsedRealtime() - b < 60000 && !Float.isNaN(c)) {
            f = c;
        } else {
            Intent intentRegisterReceiver = context.getApplicationContext().registerReceiver(null, a);
            if (intentRegisterReceiver != null) {
                c = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
            }
            b = SystemClock.elapsedRealtime();
            f = c;
        }
        return f;
    }
}
