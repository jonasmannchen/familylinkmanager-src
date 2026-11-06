package flm;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bam extends cqr {
    public static final int NORMAL_CALLBACK = 2;
    public static final int ON_CONNECTION_SUSPENDED = 6;
    public static final int ON_LOCAL_NOT_AVAILABLE = 5;
    public static final int ON_NOT_AVAILABLE = 3;
    public static final int ON_POST_BIND = 7;
    public static final int ON_POST_INIT = 1;
    public static final int ON_REMOTE_NOT_AVAILABLE = 4;
    public final /* synthetic */ bai this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bam(bai baiVar, Looper looper) {
        super(looper);
        this.this$0 = baiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        apx apxVar;
        apx apxVar2;
        if (this.this$0.mDisconnectCount.get() != message.arg1) {
            if (hasCallback(message)) {
                deliverCallbackFailed(message);
                return;
            }
            return;
        }
        if ((message.what == 1 || message.what == 7 || ((message.what == 4 && !this.this$0.enableLocalFallback()) || message.what == 5)) && !this.this$0.isConnecting()) {
            deliverCallbackFailed(message);
            return;
        }
        if (message.what != 4) {
            if (message.what != 5) {
                if (message.what == 3) {
                    apx apxVar3 = new apx(message.arg2, message.obj instanceof PendingIntent ? (PendingIntent) message.obj : null);
                    this.this$0.mConnectionProgressReportCallbacks.onReportServiceBinding(apxVar3);
                    this.this$0.onConnectionFailed(apxVar3);
                    return;
                }
                if (message.what != 6) {
                    if (message.what == 2 && !this.this$0.isConnected()) {
                        deliverCallbackFailed(message);
                        return;
                    } else if (hasCallback(message)) {
                        ((ban) message.obj).deliverCallback();
                        return;
                    } else {
                        Log.wtf(bai.TAG, new StringBuilder(45).append("Don't know how to handle message: ").append(message.what).toString(), new Exception());
                        return;
                    }
                }
                this.this$0.setConnectState(5, null);
                if (this.this$0.mConnectionCallbacks != null) {
                    this.this$0.mConnectionCallbacks.onConnectionSuspended(message.arg2);
                }
                this.this$0.onConnectionSuspended(message.arg2);
                this.this$0.compareAndSetConnectState(5, 1, null);
                return;
            }
            if (this.this$0.mRemoteServiceFailedResult == null) {
                apxVar = new apx(8);
            } else {
                apxVar = this.this$0.mRemoteServiceFailedResult;
            }
            this.this$0.mConnectionProgressReportCallbacks.onReportServiceBinding(apxVar);
            this.this$0.onConnectionFailed(apxVar);
            return;
        }
        this.this$0.mRemoteServiceFailedResult = new apx(message.arg2);
        if (this.this$0.isLocalServicePresent() && !this.this$0.mLocalServiceFailedConnect) {
            this.this$0.setConnectState(3, null);
            return;
        }
        if (this.this$0.mRemoteServiceFailedResult == null) {
            apxVar2 = new apx(8);
        } else {
            apxVar2 = this.this$0.mRemoteServiceFailedResult;
        }
        this.this$0.mConnectionProgressReportCallbacks.onReportServiceBinding(apxVar2);
        this.this$0.onConnectionFailed(apxVar2);
    }

    private final void deliverCallbackFailed(Message message) {
        ban banVar = (ban) message.obj;
        banVar.onDeliverCallbackFailed();
        banVar.unregister();
    }

    private final boolean hasCallback(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }
}
