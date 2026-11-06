package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gti extends fio implements fkg {
    gti() {
        super(gth.e);
    }

    public final gti a(gtj gtjVar) {
        c();
        gth gthVar = (gth) this.a;
        if (gtjVar == null) {
            throw new NullPointerException();
        }
        gthVar.d = gtjVar;
        gthVar.a |= 4;
        return this;
    }
}
