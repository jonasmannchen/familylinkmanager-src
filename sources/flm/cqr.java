package flm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class cqr extends Handler {
    public static volatile cqs propagator = null;

    public cqr() {
    }

    public cqr(Handler.Callback callback) {
        super(callback);
    }

    public cqr(Looper looper) {
        super(looper);
    }

    public cqr(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        prepare(message, j);
        return super.sendMessageAtTime(message, j);
    }

    public boolean sendMessageAtFrontOfQueueTraced(Message message) {
        prepare(message, 0L);
        return sendMessageAtFrontOfQueue(message);
    }

    public boolean postAtFrontOfQueueTraced(Runnable runnable) {
        cqs cqsVar = propagator;
        if (cqsVar == null) {
            return postAtFrontOfQueue(runnable);
        }
        Message messageObtain = Message.obtain(this, runnable);
        cqsVar.a();
        return sendMessageAtFrontOfQueue(messageObtain);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        cqs cqsVar = propagator;
        if (cqsVar == null) {
            dispatchMessageTraced(message);
        } else {
            cqsVar.b();
        }
    }

    protected void dispatchMessageTraced(Message message) {
        super.dispatchMessage(message);
    }

    private void prepare(Message message, long j) {
        cqs cqsVar = propagator;
        if (cqsVar != null) {
            cqsVar.a();
        }
    }

    static void installPropagator(cqs cqsVar) {
        if (cqsVar == null) {
            throw new NullPointerException();
        }
        if (propagator != null) {
            throw new IllegalStateException("Duplicate install");
        }
        propagator = cqsVar;
    }
}
