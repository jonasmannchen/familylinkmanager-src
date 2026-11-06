package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gov extends fio implements fkg {
    gov() {
        super(gou.i);
    }

    public final gov a(long j) {
        c();
        gou gouVar = (gou) this.a;
        gouVar.a |= 1;
        gouVar.b = j;
        return this;
    }

    public final gov b(long j) {
        c();
        gou gouVar = (gou) this.a;
        gouVar.a |= 2;
        gouVar.c = j;
        return this;
    }

    public final gov c(long j) {
        c();
        gou gouVar = (gou) this.a;
        gouVar.a |= 4;
        gouVar.d = j;
        return this;
    }

    public final gov d(long j) {
        c();
        gou gouVar = (gou) this.a;
        gouVar.a |= 8;
        gouVar.e = j;
        return this;
    }

    public final gov e(long j) {
        c();
        gou gouVar = (gou) this.a;
        gouVar.a |= 16;
        gouVar.f = j;
        return this;
    }

    public final gov f(long j) {
        c();
        gou gouVar = (gou) this.a;
        gouVar.a |= 32;
        gouVar.g = j;
        return this;
    }

    public final gov a(goq goqVar) {
        c();
        gou gouVar = (gou) this.a;
        if (goqVar == null) {
            throw new NullPointerException();
        }
        gouVar.h = goqVar;
        gouVar.a |= 64;
        return this;
    }
}
