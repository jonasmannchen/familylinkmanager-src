package flm;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ow extends Handler {
    ow() {
        super(Looper.getMainLooper());
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ov ovVar = (ov) message.obj;
        switch (message.what) {
            case 1:
                or orVar = ovVar.a;
                Object obj = ovVar.b[0];
                if (orVar.f.get()) {
                    orVar.b(obj);
                } else {
                    orVar.a(obj);
                }
                orVar.e = dp.D;
                break;
            case 2:
                or.a();
                break;
        }
    }
}
