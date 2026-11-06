package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fdb extends fio implements fkg {
    fdb() {
        super(fda.d);
    }

    public final fdb a(fdc fdcVar) {
        c();
        fda fdaVar = (fda) this.a;
        if (fdcVar == null) {
            throw new NullPointerException();
        }
        fdaVar.a |= 1;
        fdaVar.b = fdcVar.z;
        return this;
    }

    public final fdb a(String str) {
        c();
        fda fdaVar = (fda) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        fdaVar.a |= 2;
        fdaVar.c = str;
        return this;
    }
}
