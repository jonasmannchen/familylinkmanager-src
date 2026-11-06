package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evy extends fio implements fkg {
    evy() {
        super(evx.d);
    }

    public final evy a(String str) {
        c();
        evx evxVar = (evx) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        evxVar.a |= 2;
        evxVar.b = str;
        return this;
    }

    public final evy a(evi eviVar) {
        c();
        evx evxVar = (evx) this.a;
        evxVar.c = (evh) ((fin) eviVar.h());
        evxVar.a |= 4;
        return this;
    }
}
