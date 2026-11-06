package flm;

import android.content.Intent;
import android.os.Message;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ccu extends bgz {
    ccu(bhb bhbVar) {
        super(bhbVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ((Intent) message.obj).getAction();
    }
}
