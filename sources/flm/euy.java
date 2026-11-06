package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class euy extends fio implements fkg {
    euy() {
        super(eux.c);
    }

    public final euy a(euz euzVar) {
        c();
        eux euxVar = (eux) this.a;
        if (euzVar == null) {
            throw new NullPointerException();
        }
        euxVar.a |= 1;
        euxVar.b = euzVar.n;
        return this;
    }
}
