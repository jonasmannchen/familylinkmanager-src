package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eti extends fio implements fkg {
    eti() {
        super(ete.t);
    }

    public final eti a(String str) {
        c();
        ete eteVar = (ete) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        eteVar.a |= 2;
        eteVar.c = str;
        return this;
    }

    public final eti a(ewz ewzVar) {
        c();
        ete eteVar = (ete) this.a;
        if (ewzVar == null) {
            throw new NullPointerException();
        }
        eteVar.m = ewzVar;
        eteVar.a |= 32768;
        return this;
    }

    public final etj a() {
        etj etjVarA = etj.a(((ete) this.a).o);
        return etjVarA == null ? etj.STATUS_UNKNOWN : etjVarA;
    }
}
