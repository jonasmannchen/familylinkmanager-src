package flm;

import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class axq extends cqr {
    private final /* synthetic */ axp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axq(axp axpVar, Looper looper) {
        super(looper);
        this.a = axpVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        bdi.checkArgument(message.what == 1);
        axp axpVar = this.a;
        axs axsVar = (axs) message.obj;
        Object obj = axpVar.a;
        if (obj == null) {
            axsVar.a();
            return;
        }
        try {
            axsVar.a(obj);
        } catch (RuntimeException e) {
            axsVar.a();
            throw e;
        }
    }
}
