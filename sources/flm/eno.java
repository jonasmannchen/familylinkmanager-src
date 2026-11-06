package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eno extends fio implements fkg {
    eno() {
        super(enn.i);
    }

    public final eno a(boolean z) {
        c();
        enn ennVar = (enn) this.a;
        ennVar.a |= 1;
        ennVar.b = z;
        return this;
    }

    public final eno a(eot eotVar) {
        c();
        enn ennVar = (enn) this.a;
        if (eotVar == null) {
            throw new NullPointerException();
        }
        ennVar.a |= 4;
        ennVar.d = eotVar.e;
        return this;
    }
}
