package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elq extends fio implements fkg {
    elq() {
        super(elp.i);
    }

    public final elq a(String str) {
        c();
        elp elpVar = (elp) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        elpVar.a |= 1;
        elpVar.d = str;
        return this;
    }

    public final elq a(elr elrVar) {
        c();
        elp elpVar = (elp) this.a;
        if (elrVar == null) {
            throw new NullPointerException();
        }
        elpVar.a |= 8;
        elpVar.e = elrVar.c;
        return this;
    }
}
