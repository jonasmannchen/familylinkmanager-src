package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elo extends fio implements fkg {
    elo() {
        super(eln.f);
    }

    public final elo a(ell ellVar) {
        c();
        eln elnVar = (eln) this.a;
        if (ellVar == null) {
            throw new NullPointerException();
        }
        elnVar.a |= 1;
        elnVar.b = ellVar.b;
        return this;
    }

    public final elo a(elj eljVar) {
        c();
        eln elnVar = (eln) this.a;
        if (eljVar == null) {
            throw new NullPointerException();
        }
        elnVar.a |= 2;
        elnVar.c = eljVar.c;
        return this;
    }

    public final elo a(String str) {
        c();
        eln elnVar = (eln) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        elnVar.a |= 4;
        elnVar.d = str;
        return this;
    }
}
