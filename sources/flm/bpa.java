package flm;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bpa extends BroadcastReceiver {
    public volatile boolean a = false;
    public volatile Boolean b = null;
    public volatile Boolean c = null;
    public volatile Boolean d = null;
    public volatile boolean e = false;
    public volatile boolean f = false;

    bpa() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (intent.getAction()) {
            case "android.intent.action.ACTION_POWER_CONNECTED":
                this.b = true;
                break;
            case "android.intent.action.ACTION_POWER_DISCONNECTED":
                this.b = false;
                break;
            case "android.intent.action.SCREEN_ON":
                this.c = true;
                break;
            case "android.intent.action.SCREEN_OFF":
                this.c = false;
                break;
            case "android.intent.action.BATTERY_LOW":
                this.d = true;
                break;
            case "android.intent.action.BATTERY_OKAY":
                this.d = false;
                break;
            case "android.os.action.DEVICE_IDLE_MODE_CHANGED":
                this.e = a(context);
                break;
            case "android.os.action.POWER_SAVE_MODE_CHANGED":
                this.f = b(context);
                break;
        }
    }

    @TargetApi(23)
    static boolean a(Context context) {
        PowerManager powerManager;
        if (!biw.a() || (powerManager = (PowerManager) context.getSystemService("power")) == null) {
            return false;
        }
        return powerManager.isDeviceIdleMode();
    }

    @TargetApi(21)
    static boolean b(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            return powerManager.isPowerSaveMode();
        }
        return false;
    }
}
