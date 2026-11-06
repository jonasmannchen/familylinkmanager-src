package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evi extends fio implements fkg {
    evi() {
        super(evh.f);
    }

    public final evi a(evj evjVar) {
        c();
        evh evhVar = (evh) this.a;
        if (evjVar == null) {
            throw new NullPointerException();
        }
        evhVar.a |= 1;
        evhVar.b = evjVar.c;
        return this;
    }

    public final evi a(String str) {
        c();
        evh evhVar = (evh) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        evhVar.a |= 2;
        evhVar.c = str;
        return this;
    }

    public final evi b(String str) {
        c();
        evh evhVar = (evh) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        evhVar.a |= 4;
        evhVar.d = str;
        return this;
    }

    public final evi c(String str) {
        c();
        evh evhVar = (evh) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        evhVar.a |= 16;
        evhVar.e = str;
        return this;
    }
}
