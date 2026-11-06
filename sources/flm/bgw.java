package flm;

import android.content.Intent;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bgw extends bgz {
    private final /* synthetic */ bgv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgw(bgv bgvVar, bhb bhbVar) {
        super(bhbVar);
        this.b = bgvVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.b.onHandleIntent((Intent) message.obj);
        this.b.stopSelf(message.arg1);
    }
}
