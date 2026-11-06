package flm;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(21)
final class bpt extends cqr {
    private final /* synthetic */ bpr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bpt(bpr bprVar, Looper looper) {
        super(looper);
        this.a = bprVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Messenger messenger;
        if (!bjb.a(this.a, message.sendingUid, "com.google.android.gms")) {
            Log.e("GcmTaskChimeraService", "unable to verify presence of Google Play Services");
        }
        switch (message.what) {
            case 1:
                Bundle data = message.getData();
                if (!data.isEmpty() && (messenger = message.replyTo) != null) {
                    String string = data.getString("tag");
                    ArrayList parcelableArrayList = data.getParcelableArrayList("triggered_uris");
                    long j = data.getLong("max_exec_duration", 180L);
                    if (!this.a.a(string)) {
                        this.a.a(new bpu(this.a, string, messenger, data.getBundle(baw.KEY_EXTRAS), j, parcelableArrayList));
                    }
                    break;
                }
                break;
            case 2:
                break;
            case 3:
            default:
                String strValueOf = String.valueOf(message);
                Log.e("GcmTaskChimeraService", new StringBuilder(String.valueOf(strValueOf).length() + 31).append("Unrecognized message received: ").append(strValueOf).toString());
                break;
            case 4:
                this.a.onInitializeTasks();
                break;
        }
    }
}
