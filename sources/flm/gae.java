package flm;

import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gae implements Runnable {
    private final /* synthetic */ InputStream a;
    private final /* synthetic */ fzu b;

    gae(fzu fzuVar, InputStream inputStream) {
        this.b = fzuVar;
        this.a = inputStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.a(this.a);
    }
}
