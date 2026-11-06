package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bys extends fio implements fkg {
    bys() {
        super(byr.i);
    }

    public final bys a(String str) {
        c();
        byr byrVar = (byr) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        byrVar.a |= 1;
        byrVar.b = str;
        return this;
    }

    public final bys a(esu esuVar) {
        c();
        byr byrVar = (byr) this.a;
        if (esuVar == null) {
            throw new NullPointerException();
        }
        byrVar.a |= 2;
        byrVar.c = esuVar.e;
        return this;
    }
}
