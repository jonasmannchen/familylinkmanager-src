package flm;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ghu implements Runnable {
    private final /* synthetic */ gho a;

    ghu(gho ghoVar) {
        this.a = ghoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.b != null) {
            try {
                this.a.b.close();
                this.a.c.close();
            } catch (IOException e) {
                gho.a.logp(gho.a(e), "io.grpc.okhttp.AsyncFrameWriter$14", "run", "Failed closing connection", (Throwable) e);
            }
        }
    }
}
