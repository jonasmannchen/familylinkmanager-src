package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eyx extends fio implements fkg {
    eyx() {
        super(eyw.f);
    }

    public final eyx a(String str) {
        c();
        eyw eywVar = (eyw) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        eywVar.a |= 2;
        eywVar.b = str;
        return this;
    }

    public final eyx b(String str) {
        c();
        eyw eywVar = (eyw) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        eywVar.a |= 4;
        eywVar.c = str;
        return this;
    }

    public final eyx c(String str) {
        c();
        eyw eywVar = (eyw) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        eywVar.a |= 8;
        eywVar.d = str;
        return this;
    }

    public final eyx a(int i) {
        c();
        eyw eywVar = (eyw) this.a;
        eywVar.a |= 16;
        eywVar.e = i;
        return this;
    }
}
