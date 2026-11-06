package flm;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fgz extends fhb {
    private int a = 0;
    private final int b;
    private final /* synthetic */ fgy c;

    fgz(fgy fgyVar) {
        this.c = fgyVar;
        this.b = this.c.b();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // flm.fhf
    public final byte a() {
        int i = this.a;
        if (i >= this.b) {
            throw new NoSuchElementException();
        }
        this.a = i + 1;
        return this.c.b(i);
    }
}
