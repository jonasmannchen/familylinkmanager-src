package flm;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gai implements fza {
    public final fza a;
    public volatile boolean b;
    public List c = new ArrayList();

    public gai(fza fzaVar) {
        this.a = fzaVar;
    }

    private final void a(Runnable runnable) {
        synchronized (this) {
            if (!this.b) {
                this.c.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // flm.ghf
    public final void a(ghg ghgVar) {
        if (this.b) {
            this.a.a(ghgVar);
        } else {
            a(new gaj(this, ghgVar));
        }
    }

    @Override // flm.ghf
    public final void a() {
        if (this.b) {
            this.a.a();
        } else {
            a(new gak(this));
        }
    }

    @Override // flm.fza
    public final void a(ftv ftvVar) {
        a(new gal(this, ftvVar));
    }

    @Override // flm.fza
    public final void b(fvc fvcVar, ftv ftvVar) {
        a(new gam(this, fvcVar, ftvVar));
    }

    @Override // flm.fza
    public final void a(fvc fvcVar, int i, ftv ftvVar) {
        a(new gan(this, fvcVar, i, ftvVar));
    }
}
