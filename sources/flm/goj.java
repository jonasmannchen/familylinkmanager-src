package flm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class goj extends fio implements fkg {
    goj() {
        super(goi.k);
    }

    public final goj a(String str) {
        c();
        goi goiVar = (goi) this.a;
        if (str == null) {
            throw new NullPointerException();
        }
        goiVar.a |= 4;
        goiVar.d = str;
        return this;
    }

    public final goj a(gpa gpaVar) {
        c();
        goi goiVar = (goi) this.a;
        if (gpaVar == null) {
            throw new NullPointerException();
        }
        goiVar.i = gpaVar;
        goiVar.a |= 128;
        return this;
    }

    public final goj a(long j) {
        c();
        goi goiVar = (goi) this.a;
        goiVar.a |= 256;
        goiVar.j = j;
        return this;
    }
}
