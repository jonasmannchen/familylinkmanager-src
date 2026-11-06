package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ela extends fio implements fkg {
    ela() {
        super(ekz.d);
    }

    public final ela a(eku ekuVar) {
        c();
        ekz ekzVar = (ekz) this.a;
        if (ekuVar == null) {
            throw new NullPointerException();
        }
        ekzVar.a |= 1;
        ekzVar.b = ekuVar.k;
        return this;
    }

    public final ela a(ekw ekwVar) {
        c();
        ekz ekzVar = (ekz) this.a;
        if (ekwVar == null) {
            throw new NullPointerException();
        }
        ekzVar.a |= 2;
        ekzVar.c = ekwVar.d;
        return this;
    }
}
