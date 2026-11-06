package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gto extends fio implements fkg {
    gto() {
        super(gtn.c);
    }

    public final gto a(gtp gtpVar) {
        c();
        gtn gtnVar = (gtn) this.a;
        if (gtpVar == null) {
            throw new NullPointerException();
        }
        gtnVar.a |= 1;
        gtnVar.b = gtpVar.d;
        return this;
    }
}
