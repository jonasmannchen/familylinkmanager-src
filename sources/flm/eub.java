package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eub extends fio implements fkg {
    eub() {
        super(eua.f);
    }

    public final eub a(boolean z) {
        c();
        eua euaVar = (eua) this.a;
        euaVar.a |= 1;
        euaVar.b = z;
        return this;
    }

    public final eub a(euc eucVar) {
        c();
        eua euaVar = (eua) this.a;
        if (eucVar == null) {
            throw new NullPointerException();
        }
        euaVar.a |= 2;
        euaVar.c = eucVar.e;
        return this;
    }
}
