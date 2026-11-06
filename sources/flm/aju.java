package flm;

import com.android.volley.Request;
import com.android.volley.Response;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aju implements Runnable {
    private final Request a;
    private final Response b;
    private final Runnable c;

    public aju(Request request, Response response, Runnable runnable) {
        this.a = request;
        this.b = response;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.isCanceled()) {
            this.a.a("canceled-at-delivery");
            return;
        }
        if (this.b.isSuccess()) {
            this.a.a(this.b.result);
        } else {
            this.a.deliverError(this.b.error);
        }
        if (this.b.intermediate) {
            this.a.addMarker("intermediate-response");
        } else {
            this.a.a("done");
        }
        if (this.c != null) {
            this.c.run();
        }
    }
}
