package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gsw extends fio implements fkg {
    gsw() {
        super(gsv.e);
    }

    public final String a() {
        return ((gsv) this.a).b;
    }

    public final gsw a(String str) {
        c();
        gsv gsvVar = (gsv) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        gsvVar.a |= 1;
        gsvVar.b = str;
        return this;
    }

    public final gsw a(long j) {
        c();
        gsv gsvVar = (gsv) this.a;
        gsvVar.a |= 2;
        gsvVar.d = j;
        return this;
    }
}
