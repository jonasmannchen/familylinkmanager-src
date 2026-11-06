package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class goz extends fio implements fkg {
    goz() {
        super(goy.e);
    }

    public final goz a(int i) {
        c();
        goy goyVar = (goy) this.a;
        goyVar.a |= 1;
        goyVar.b = i;
        return this;
    }

    public final goz a(long j) {
        c();
        goy goyVar = (goy) this.a;
        goyVar.a |= 2;
        goyVar.c = j;
        return this;
    }

    public final goz a(goq goqVar) {
        c();
        goy goyVar = (goy) this.a;
        if (goqVar == null) {
            throw new NullPointerException();
        }
        goyVar.d = goqVar;
        goyVar.a |= 4;
        return this;
    }

    public final goz a(gor gorVar) {
        c();
        goy goyVar = (goy) this.a;
        goyVar.d = (goq) ((fin) gorVar.h());
        goyVar.a |= 4;
        return this;
    }
}
