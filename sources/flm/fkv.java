package flm;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fkv extends fhb {
    private final fkx a;
    private fhf b = b();
    private final /* synthetic */ fku c;

    fkv(fku fkuVar) {
        this.c = fkuVar;
        this.a = new fkx(this.c);
    }

    private final fhf b() {
        if (this.a.hasNext()) {
            return (fhf) ((fhh) this.a.next()).iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // flm.fhf
    public final byte a() {
        if (this.b == null) {
            throw new NoSuchElementException();
        }
        byte bA = this.b.a();
        if (!this.b.hasNext()) {
            this.b = b();
        }
        return bA;
    }
}
