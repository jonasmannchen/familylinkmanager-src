package flm;

import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fym {
    public int a;
    private final Object b = new Object();
    private final Collection c;

    fym(int i, long j, String str) {
        dvl.a(i > 0, "maxEvents must be greater than zero");
        dvl.a(str, "channelType");
        this.c = new fyn(this, i);
        ftb ftbVar = new ftb();
        ftbVar.a = String.valueOf(str).concat(" created");
        ftbVar.b = ftc.CT_INFO;
        a(ftbVar.a(j).a());
    }

    final void a(fta ftaVar) {
        synchronized (this.b) {
            this.c.add(ftaVar);
        }
    }
}
