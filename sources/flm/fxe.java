package flm;

import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fxe implements ghg {
    private final Runnable a;
    private boolean b = false;
    private final /* synthetic */ fww c;

    fxe(fww fwwVar, Runnable runnable) {
        this.c = fwwVar;
        this.a = runnable;
    }

    @Override // flm.ghg
    public final InputStream a() {
        if (!this.b) {
            this.a.run();
            this.b = true;
        }
        return (InputStream) this.c.c.poll();
    }
}
