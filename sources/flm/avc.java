package flm;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class avc extends cqr {
    public avc() {
        this(Looper.getMainLooper());
    }

    public avc(Looper looper) {
        super(looper);
    }

    public final void a(atz atzVar, aty atyVar) {
        sendMessage(obtainMessage(1, new Pair(atzVar, atyVar)));
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                Pair pair = (Pair) message.obj;
                atz atzVar = (atz) pair.first;
                aty atyVar = (aty) pair.second;
                try {
                    atzVar.a(atyVar);
                    return;
                } catch (RuntimeException e) {
                    BasePendingResult.maybeReleaseResult(atyVar);
                    throw e;
                }
            case 2:
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.d);
                return;
            default:
                Log.wtf(BasePendingResult.TAG, new StringBuilder(45).append("Don't know how to handle message: ").append(message.what).toString(), new Exception());
                return;
        }
    }
}
