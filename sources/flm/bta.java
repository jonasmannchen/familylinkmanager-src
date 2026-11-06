package flm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bta {
    public static PendingIntent a(Context context, Class cls, Intent intent, int i, int i2) {
        return bus.a(context) >= 10000000 ? IntentOperation.getPendingIntent(context, cls, intent, 0, 134217728) : PendingIntent.getService(context, 0, intent, 134217728);
    }

    public static Intent a(Context context, Class cls, String str) {
        return a(context, cls.getName(), str);
    }

    public static Intent a(Context context, String str, String str2) {
        if (bus.a(context) >= 9410000) {
            return IntentOperation.getStartIntent(context, str, str2);
        }
        Intent intent = new Intent(str2);
        intent.setClassName("com.google.android.gms", "com.google.android.gms.chimera.GmsIntentOperationService");
        String strValueOf = String.valueOf(str);
        intent.addCategory(strValueOf.length() != 0 ? "targeted_intent_op_prefix:".concat(strValueOf) : new String("targeted_intent_op_prefix:"));
        return intent;
    }
}
