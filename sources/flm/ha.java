package flm;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ha implements Handler.Callback {
    private final /* synthetic */ gz a;

    ha(gz gzVar) {
        this.a = gzVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case bbx.MSG_UNBIND_SERVICE /* 0 */:
                gz gzVar = this.a;
                hc hcVar = (hc) message.obj;
                synchronized (gzVar.a) {
                    if (gzVar.c == hcVar || gzVar.d == hcVar) {
                        gzVar.a(hcVar, 2);
                    }
                    break;
                }
                return true;
            default:
                return false;
        }
    }
}
