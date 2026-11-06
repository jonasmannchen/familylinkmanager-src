package flm;

import android.os.Handler;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class re implements Runnable {
    public final /* synthetic */ rh a;
    private final /* synthetic */ Callable b;
    private final /* synthetic */ Handler c;

    re(rc rcVar, Callable callable, Handler handler, rh rhVar) {
        this.b = callable;
        this.c = handler;
        this.a = rhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = this.b.call();
        } catch (Exception e) {
            objCall = null;
        }
        this.c.post(new rf(this, objCall));
    }
}
