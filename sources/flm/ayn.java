package flm;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ayn extends cqr {
    private final /* synthetic */ ayl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayn(ayl aylVar, Looper looper) {
        super(looper);
        this.a = aylVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                att attVar = (att) message.obj;
                synchronized (this.a.e) {
                    try {
                        if (attVar == null) {
                            this.a.b.a(new Status(13, "Transform returned null"));
                        } else {
                            if (attVar instanceof axy) {
                                ayl aylVar = this.a.b;
                                throw new NoSuchMethodError();
                            }
                            ayl aylVar2 = this.a.b;
                            synchronized (aylVar2.e) {
                                aylVar2.d = attVar;
                                aylVar2.a();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 1:
                RuntimeException runtimeException = (RuntimeException) message.obj;
                String strValueOf = String.valueOf(runtimeException.getMessage());
                Log.e("TransformedResultImpl", strValueOf.length() != 0 ? "Runtime exception on the transformation worker thread: ".concat(strValueOf) : new String("Runtime exception on the transformation worker thread: "));
                throw runtimeException;
            default:
                Log.e("TransformedResultImpl", new StringBuilder(70).append("TransformationResultHandler received unknown message type: ").append(message.what).toString());
                return;
        }
    }
}
