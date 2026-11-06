package flm;

import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class aoa extends IntentOperation {
    /* JADX WARN: Multi-variable type inference failed */
    public final void onHandleIntent(Intent intent) {
        if (!bav.IS_DECOMPOSED) {
            bhq.c();
        }
        String action = intent.getAction();
        switch (action) {
            case "android.intent.action.LOCKED_BOOT_COMPLETED":
                a(1);
                break;
            case "android.intent.action.BOOT_COMPLETED":
                a();
                a((a() ? 0 : 1) | 2);
                break;
            case "com.google.android.chimera.IntentOperation.NEW_MODULE":
                a((intent.getBooleanExtra("containerUpdated", false) ? 8 : 0) | 4);
                break;
            case "com.google.android.gms.chimera.container.CONTAINER_UPDATED":
                if (!ModuleManager.get(this).getCurrentModuleApk().apkPackageName.equals("com.google.android.gms")) {
                    a(8);
                    break;
                }
                break;
            default:
                String strValueOf = String.valueOf(action);
                Log.w("ModuleInitIntentOp", strValueOf.length() != 0 ? "Dropping unexpected action ".concat(strValueOf) : new String("Dropping unexpected action "));
                break;
        }
    }

    private static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public void a(int i) {
    }
}
