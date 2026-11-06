package flm;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class l implements m, Iterator {
    private j a;
    private j b;

    l(j jVar, j jVar2) {
        this.a = jVar2;
        this.b = jVar;
    }

    abstract j a(j jVar);

    abstract j b(j jVar);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b != null;
    }

    @Override // flm.m
    public final void a_(j jVar) {
        if (this.a == jVar && jVar == this.b) {
            this.b = null;
            this.a = null;
        }
        if (this.a == jVar) {
            this.a = b(this.a);
        }
        if (this.b == jVar) {
            this.b = a();
        }
    }

    private final j a() {
        if (this.b == this.a || this.a == null) {
            return null;
        }
        return a(this.b);
    }

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        j jVar = this.b;
        this.b = a();
        return jVar;
    }
}
