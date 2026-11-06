package flm;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bgz extends Handler {
    private static final Looper b;
    private static Field c = null;
    public final Handler.Callback a;
    private final bhl d;

    public bgz(bhb bhbVar) {
        this(bhbVar, null);
    }

    private bgz(bhb bhbVar, Handler.Callback callback) {
        super(b);
        this.d = bhbVar.a;
        this.a = null;
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        Runnable callback = message.getCallback();
        if (callback != null) {
            this.d.execute(callback);
        } else {
            this.d.execute(new bha(this, message));
        }
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        Runnable bhaVar;
        boolean z = false;
        if (this.d.isShutdown()) {
            String strValueOf = String.valueOf(this);
            RuntimeException runtimeException = new RuntimeException(new StringBuilder(String.valueOf(strValueOf).length() + 42).append(strValueOf).append(" sendMessageAtTime() called with no mQueue").toString());
            Log.w("Looper", runtimeException.getMessage(), runtimeException);
            return false;
        }
        if (bgp.a.b && bpj.b()) {
            if (message.getCallback() != null) {
                bhaVar = message.getCallback();
            } else {
                bhaVar = new bha(this, message);
            }
            long j2 = j - bgp.a.e;
            if (j2 <= bho.a) {
                z = true;
            } else {
                long jUptimeMillis = SystemClock.uptimeMillis();
                bho.a = jUptimeMillis;
                if (j2 <= jUptimeMillis) {
                    z = true;
                }
            }
            if (z) {
                bhaVar = duc.a(bhaVar);
            }
            Message messageObtain = Message.obtain(this, bhaVar);
            message.recycle();
            return super.sendMessageAtTime(messageObtain, j);
        }
        return super.sendMessageAtTime(message, j);
    }

    static {
        HandlerThread handlerThread = new HandlerThread("GlobalDispatchingHandlerThread", 9);
        handlerThread.start();
        b = handlerThread.getLooper();
    }
}
