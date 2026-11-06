package flm;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class awr extends cqr {
    private final /* synthetic */ awp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    awr(awp awpVar, Looper looper) {
        super(looper);
        this.a = awpVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                awq awqVar = (awq) message.obj;
                awp awpVar = this.a;
                awpVar.a.lock();
                try {
                    if (awpVar.k == awqVar.a) {
                        awqVar.a();
                        return;
                    }
                    return;
                } finally {
                    awpVar.a.unlock();
                }
            case 2:
                throw ((RuntimeException) message.obj);
            default:
                Log.w("GACStateManager", new StringBuilder(31).append("Unknown message id: ").append(message.what).toString());
                return;
        }
    }
}
