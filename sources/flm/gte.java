package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gte extends fio implements fkg {
    gte() {
        super(gtd.e);
    }

    public final gte a(gtf gtfVar) {
        c();
        gtd gtdVar = (gtd) this.a;
        if (gtfVar == null) {
            throw new NullPointerException();
        }
        gtdVar.a |= 1;
        gtdVar.b = gtfVar.e;
        return this;
    }
}
