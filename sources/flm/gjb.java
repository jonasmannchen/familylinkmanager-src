package flm;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gjb {
    public boolean a;
    public final /* synthetic */ gja b;
    private final guc c;
    private final boolean d;

    gjb(gja gjaVar, guc gucVar, boolean z) {
        this.b = gjaVar;
        this.c = gucVar;
        this.d = z;
    }

    final int a() {
        return (int) this.c.c;
    }

    final void b() {
        do {
            int iA = a();
            int iMin = Math.min(iA, this.b.g.b.c());
            if (iMin == iA) {
                this.b.g.d.a(-iA);
                this.b.a(-iA);
                try {
                    this.b.g.b.a(this.d, this.b.b, this.c, iA);
                    this.b.f.h.d(iA);
                    if (this.a) {
                        this.b.c -= iA;
                        this.b.a.remove(this);
                        return;
                    }
                    return;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            a(iMin).b();
        } while (a() > 0);
    }

    final gjb a(int i) {
        int iMin = Math.min(i, (int) this.c.c);
        guc gucVar = new guc();
        gucVar.a_(this.c, iMin);
        gjb gjbVar = new gjb(this.b, gucVar, false);
        if (this.a) {
            this.b.c -= iMin;
        }
        return gjbVar;
    }
}
