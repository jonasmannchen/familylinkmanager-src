package flm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class sd implements Iterator {
    private final int a;
    private int b;
    private int c;
    private boolean d = false;
    private final /* synthetic */ sc e;

    sd(sc scVar, int i) {
        this.e = scVar;
        this.a = i;
        this.b = scVar.a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = this.e.a(this.c, this.a);
        this.c++;
        this.d = true;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        this.c--;
        this.b--;
        this.d = false;
        this.e.a(this.c);
    }
}
