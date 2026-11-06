package flm;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lo extends Handler {
    private final /* synthetic */ ln a;

    lo(ln lnVar) {
        this.a = lnVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 2:
                this.a.a();
                this.a.b.b();
                break;
            default:
                super.handleMessage(message);
                break;
        }
    }
}
