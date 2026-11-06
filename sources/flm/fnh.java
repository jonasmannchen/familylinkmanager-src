package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fnh extends fiq implements fkg {
    fnh() {
        super(fng.k);
    }

    public final long a() {
        return ((fng) this.a).b;
    }

    public final fnh a(long j) {
        c();
        fng fngVar = (fng) this.a;
        fngVar.a |= 1;
        fngVar.b = j;
        return this;
    }

    public final fnh b(long j) {
        c();
        fng fngVar = (fng) this.a;
        fngVar.a |= 2;
        fngVar.c = j;
        return this;
    }

    public final fnh a(fgy fgyVar) {
        c();
        fng fngVar = (fng) this.a;
        if (fgyVar == null) {
            throw new NullPointerException();
        }
        fngVar.a |= 1024;
        fngVar.g = fgyVar;
        return this;
    }

    public final fnh c(long j) {
        c();
        fng fngVar = (fng) this.a;
        fngVar.a |= 32768;
        fngVar.h = j;
        return this;
    }
}
