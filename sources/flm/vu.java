package flm;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class vu extends Handler {
    private WeakReference a;

    public vu(DialogInterface dialogInterface) {
        this.a = new WeakReference(dialogInterface);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case -3:
            case -2:
            case -1:
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.a.get(), message.what);
                break;
            case 1:
                ((DialogInterface) message.obj).dismiss();
                break;
        }
    }
}
