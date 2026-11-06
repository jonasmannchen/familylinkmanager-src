package flm;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class rd implements Handler.Callback {
    private final /* synthetic */ rc a;

    rd(rc rcVar) {
        this.a = rcVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                rc rcVar = this.a;
                synchronized (rcVar.a) {
                    if (!rcVar.c.hasMessages(1)) {
                        rcVar.b.quit();
                        rcVar.b = null;
                        rcVar.c = null;
                    }
                }
                return true;
            case 1:
                rc rcVar2 = this.a;
                ((Runnable) message.obj).run();
                synchronized (rcVar2.a) {
                    rcVar2.c.removeMessages(0);
                    rcVar2.c.sendMessageDelayed(rcVar2.c.obtainMessage(0), rcVar2.d);
                    break;
                }
                return true;
            default:
                return true;
        }
    }
}
