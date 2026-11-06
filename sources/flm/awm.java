package flm;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class awm extends cqr {
    private final /* synthetic */ awk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    awm(awk awkVar, Looper looper) {
        super(looper);
        this.a = awkVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.a.f();
                break;
            case 2:
                this.a.e();
                break;
            default:
                Log.w("GoogleApiClientImpl", new StringBuilder(31).append("Unknown message id: ").append(message.what).toString());
                break;
        }
    }
}
