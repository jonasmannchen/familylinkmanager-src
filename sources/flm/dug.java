package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dug extends fio implements fkg {
    dug() {
        super(duf.g);
    }

    public final dug a(dsm dsmVar) {
        c();
        duf dufVar = (duf) this.a;
        if (dsmVar == null) {
            throw new NullPointerException();
        }
        dufVar.f = dsmVar;
        dufVar.a |= 8;
        return this;
    }
}
