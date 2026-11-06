package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class k implements m, Iterator {
    private j a;
    private boolean b = true;
    private final /* synthetic */ g c;

    k(g gVar) {
        this.c = gVar;
    }

    @Override // flm.m
    public final void a_(j jVar) {
        if (jVar == this.a) {
            this.a = this.a.d;
            this.b = this.a == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return this.c.b != null;
        }
        return (this.a == null || this.a.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.b) {
            this.b = false;
            this.a = this.c.b;
        } else {
            this.a = this.a != null ? this.a.c : null;
        }
        return this.a;
    }
}
