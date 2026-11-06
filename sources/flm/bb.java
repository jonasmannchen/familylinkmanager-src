package flm;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bb {
    public final ag a;
    private final Handler b = new Handler();
    private bc c;

    public bb(af afVar) {
        this.a = new ag(afVar);
    }

    public final void a(y yVar) {
        if (this.c != null) {
            this.c.run();
        }
        this.c = new bc(this.a, yVar);
        this.b.postAtFrontOfQueue(this.c);
    }
}
